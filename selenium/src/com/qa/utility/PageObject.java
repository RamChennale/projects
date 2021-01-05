package veeva.ecm.inttest.pageobjects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import veeva.ecm.framework.selenium.components.Text;
import veeva.ecm.framework.selenium.driver.DriverManager;
import veeva.ecm.framework.selenium.framework.PageUtils;
import veeva.ecm.inttest.generated.uip.components.ButtonReactSelectors;
import veeva.ecm.inttest.generated.uip.components.HeaderReactSelectors;
import veeva.ecm.inttest.generated.uip.components.InputReactSelectors;
import veeva.ecm.inttest.generated.uip.components.InputFieldReactSelectors;
import veeva.ecm.inttest.util.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import veeva.ecm.inttest.Driver;
import veeva.ecm.inttest.Element;
import veeva.ecm.inttest.Util;
import veeva.ecm.inttest.components.headers.Banner;
import veeva.ecm.inttest.components.headers.ErrorBanner;
import veeva.ecm.inttest.components.headers.PersistentBanner;
import veeva.ecm.inttest.dialogs.ConfirmDialog;
import veeva.ecm.inttest.exception.VeevaException;
import veeva.ecm.inttest.exception.VeevaInvalidValueException;
import veeva.ecm.inttest.exception.VeevaNoSuchElementException;
import veeva.ecm.inttest.pageobjects.admin.AdminPage;
import veeva.ecm.inttest.pageobjects.interfaces.Loadable;
import veeva.ecm.inttest.pageobjects.vault.ErrorConsolePage;
import veeva.ecm.inttest.pageobjects.vault.document.DocInfoPage;
import veeva.ecm.inttest.tasks.Task;
import veeva.ecm.inttest.util.ElementUtil;
import veeva.ecm.inttest.util.MultiItemSelectInput;
import veeva.ecm.inttest.util.VeevaLogger;
import veeva.ecm.inttest.util.localization.Message;
import veeva.ecm.inttest.util.localization.StaticMessage;

import static veeva.ecm.inttest.ReportLogMain.logInfo;

/**
 * Base class for all PageObjects
 *
 * Contains common elements usable on any page.
 *
 * @author Scott Kirkpatrick
 * @author Haili Wells
 * @author Laxmi Mudragadda
 * @version 7.0.0, 10/23/2013
 * @since 6.5.5, 9/17/2013
 */
public abstract class PageObject implements Loadable {
    // FIXME Help content related methods should be in a separate object
    private static final By vaultHeaderBy = By.cssSelector("div.header_std");
    private static final By adminHeaderBy = By.cssSelector("div.header_admin");
    private static final By questionMarkIconBy = By.cssSelector(".questionMarkHelpIcon");
    private static final By questionMarkIconSpanBy = By.cssSelector("span.questionMarkHelpIcon");
    private static final By learnMoreLinkBy = By.cssSelector(".vaultHelpTooltip .vHTLearnMoreLink, .showMoreLessLabel");
    private static final By messageBy = By.className("vHTMessage");
    private static final By statusErrorBy = By.cssSelector("div.status_error");
    private final static By pageTitleBy = By.cssSelector(".single div a[title='Veeva Vault']");
    private final static By titleTagBy = By.cssSelector("head > title");
    private final static By pageBodyBy = By.cssSelector("#body div");
    private static final By statusErrorMoreInfoBy = By.cssSelector(".status_error .moreInfo");
    // FIXME QA-4157 There is only VV_ selector for view config.
    private static final By viewConfigurationBannerBy = By.cssSelector(".vv_new_update_prompt.vv_admin_mode");
    private static final By modifiedDateBy = By
            .cssSelector("div[class='highcharts-axis-labels highcharts-xaxis-labels '] span");
    protected static final By loadingWheelBy = By.cssSelector(
            "div.library_loading, .icon-spinner:not(.vv_generating_rendition_spinner), .fa.fa-spinner.fa-pulse, div.Loading, div.spinner,div.dashboardLoading");

    // FIXME: https://jira.veevadev.com/browse/DEV-87291
    // this selector is for the horizontal loading bar/wheel
    protected static final By progressSmallBy = By.cssSelector("div.vv_progress_small, div.dataLoadSpinny");
    // TODO investigate impact of changing to 'div.status_body' to handle all
    // banners
    protected static final By genericBannerBy = By.cssSelector("div.status_float div.status_body");
    protected static final By loadingNotificationBy = By.cssSelector("div.status_float div.status_progress, div.statusContainer div.status_progress");
    protected static final By successBannerBy = By
            .cssSelector("div.statusContainer div.status_success, div.status_float div.status_success");
    public static final By bannerWrapperBy = By.cssSelector("div.statusRowWrapper");
    protected static final By persistentBannerBy = By.cssSelector("div.statusRowWrapper .statusHtml");
    protected static final By blockOverlayBy = By.cssSelector("div.blockOverlay, #diFullOverlay, #diOverlay, div.blockUI");
    private static final By vaultLogoBy = By.cssSelector("#vaultLogoLink img");
    protected static final By userMenuBy = By.cssSelector("#userMenu");
    private static final By pageNotFoundBy = By.id("genericpageNotFound");
    private static final By documentNotFoundBy = By.cssSelector(".page h2");
    private final By headerLogoBy = By.cssSelector("#vaultLogoLink img");
    private static final String multiSelectdropDownTemplate = "div[data-vof-label='{{dropDownBox}}'],[data-target='{{dropDownBox}}']" + " " + InputReactSelectors.getContainer();
    private static final By noPermBy = By.cssSelector("div[class*='dnf_msg'] .pageTitle");
    private static final By saveButtonBy = By.cssSelector(HeaderReactSelectors.get() + " " + ButtonReactSelectors.getPrimary() + PageUtils.getTargetSelector("vof-detail-page-header-save-button") + ", a.saveAction");
    private static final By deleteButtonBy = By.cssSelector("a.deleteAction," + PageUtils.getTargetSelector("button_delete delete_record__v"));
    private static final By cancelButton = By.cssSelector(HeaderReactSelectors.get() + " .vv-btn-ghost,a.cancelAction");
    private static final By errorMessageBy = By.cssSelector("div[generated='true'].error," + InputFieldReactSelectors.getErrorText());

    private final String TEXT = "String";
    private final String NUMBER = "Number";
    private final String DATE = "Date";
    private final String CATALOG = "Catalog";
    private final String PICKLIST = "Picklist";
    private final String OBJECT_REFERENCE = "ObjectReference";
    private final String URL = "URL";
    private final static Message DOC_NOT_FOUND = new StaticMessage("base.general.document_not_found_page_title");
    private final static Message SERVER_HAVING_PROBLEMS = new StaticMessage("base.general.error_general");
    private static final String learnMoreText = "Show more";
    private static final String learnLessText = "Show less";

    private static SimpleDateFormat dateformatMMDDYYYY = new SimpleDateFormat("MM/dd/yyyy");

    public final By nextPageButtonBy = By.cssSelector(".NextPage");
    public final By prevPageButtonBy = By.cssSelector(".PrevPage");

    private static final Text delegateBanner = new Text(".updatePrompt");

    /**
     * Waits until page is fully loaded as indicated by the presence of a unique page identifying element.
     */
    @SuppressWarnings("unchecked")
    @Override
    public abstract PageObject waitForLoad();

    /**
     * Hovers over a specified fields label by property and compares message displayed to a specified string
     *
     * @param property the by label complete with correctly cased and spaced
     * @param hoverMessage the expected message to be displayed
     * @return returns true if an element exists on the page with property as displayed label and hoverMessage as value.
     * If no element is found with these attributes returns false
     */
    public static final boolean hoverFieldsTest(String property, String hoverMessage) {
        // TODO help content
        By propertyHelpBy = By.cssSelector(".customHelp");
        Element.waitForVisible(propertyHelpBy);
        for (WebElement foundElement : Element.getMultiple(propertyHelpBy)) {
            Element.scrollToElement(foundElement);
            String match = foundElement.getText();
            if (match.contains(property)) {
                String hoverMessageDisp = foundElement.getAttribute("value");
                if (hoverMessageDisp.contains(hoverMessage)) {
                    Element.hover(foundElement);
                    return true;
                }
                return false;
            }
        }
        return false;

    }

    /**
     * checks if the question mark for admin pages is present on page
     *
     * @return true if question mark is there false if not
     */
    public static final boolean isQuestionMarkIconDisplayed() {
        // TODO help content
        // verify that the question mark icon is present on the page
        waitForLoadingWheel();
        Element.waitForVisible(questionMarkIconBy);
        if (Element.getMultiple(questionMarkIconBy).size() != 0) {
            // if it is, return whether it is displayed or not
            Element.waitForEnabled(questionMarkIconBy);
            return Element.isElementDisplayed(questionMarkIconBy);
        }
        // return false, since the icon is not present on the page
        return false;
    }

    /**
     * checks if the question mark for admin control page is present on page
     *
     * @return true if question mark is there false if not
     */
    public static final boolean isQuestionMarkIconDisplayedControl() {
        // TODO help content
        // verify that the question mark icon is present on the page
        if (Element.getMultiple(questionMarkIconBy).size() != 0) {
            // if it is, return whether it is displayed or not
            Element.waitForVisible(questionMarkIconBy);
            return Element.getMultiple(questionMarkIconBy).get(1).isDisplayed();
        }
        // return false, since the icon is not present on the page
        return false;
    }

    /**
     * checks if the question mark for admin tabbed pages is present on page
     *
     * @return true if question mark is there false if not
     */
    public static final boolean isQuestionMarkIconDisplayedSpan() {
        // TODO help content
        // verify that the question mark icon is present on the page
        if (Element.getMultiple(questionMarkIconSpanBy).size() != 0) {
            // if it is, return whether it is displayed or not
            Element.waitForVisible(questionMarkIconSpanBy);
            return Element.getMultiple(questionMarkIconSpanBy).get(0).isDisplayed();
        }
        // return false, since the icon is not present on the page
        return false;
    }

    /**
     * checks if the server having problems is present on page
     *
     * @return true if server having problems is present
     */
    public static boolean isServerHavingProblemsDisplayed() {
        boolean errorBannerDisplayed = Element.isElementDisplayed(statusErrorBy);
        if (errorBannerDisplayed) {
            String errorTxt = Element.getTextSafely(statusErrorBy);
            return errorTxt.equals(SERVER_HAVING_PROBLEMS.get());
        }
        return false;
    }

    /**
     * clicks the question mark icon on the page bringing up help text
     */
    public static void clickQuestionMarkIcon() {
        // TODO help content
        Element.loadAndClick(Element.waitForAnyEnabled(questionMarkIconBy));
    }

    /**
     * clicks the question mark icon on the picklist control page needs to be separate because it is second on the
     * picklist detail pages
     */
    public static final void clickQuestionMarkIconControl() {
        // TODO help content
        Element.waitForLoad(questionMarkIconBy);
        Element.getMultiple(questionMarkIconBy).get(1).click();
    }

    /**
     * clicks the question marks within a tab field and not designated on the page itself
     */
    public static final void clickQuestionMarkIconSpan() {
        // TODO help content
        Element.waitForVisible(questionMarkIconSpanBy);
        Element.getMultiple(questionMarkIconSpanBy).get(0).click();
    }

    /**
     * check to see if the message portion of the help text is displayed
     *
     * @return true if message is displayed false if message is missing
     */
    public static final boolean isHelpMessageDisplayed() {
        if (Element.getMultiple(messageBy).size() != 0) {
            return Element.isElementDisplayed(messageBy);
        }
        return false;
    }

    /**
     * check to see if the learn more link of help text is displayed
     *
     * @return true if learn more is displayed and false if learn more is not displayed
     */
    public static final boolean isLearnMoreLinkDisplayed() {
        // TODO help content
        verifyHelpIconClickedandClickIfNot();
        if (Element.getMultiple(learnMoreLinkBy).size() != 0) {
            return Element.isElementDisplayed(learnMoreLinkBy);
        }
        return false;
    }

    /**
     * Click on the Learn More Link
     */
    public static final void clickOnLearnMoreLink() {
        verifyHelpIconClickedandClickIfNot();
        Element.waitForElementToStopMoving(learnMoreLinkBy);
        Element.loadAndClick(learnMoreLinkBy);
        Element.waitForNumberOfWindowsToEqual(2);
        Element.switchToWindowsPopup();
        Element.waitForVisible(pageTitleBy);
    }

    /**
     * @param hrefUrl
     * @return
     */
    public static final boolean isLearnMoreLinkCorrect(String hrefUrl) {
        // TODO help content
        verifyHelpIconClickedandClickIfNot();
        if (Element.getMultiple(learnMoreLinkBy).size() != 0) {
            System.out.println(
                    "The real URL = " + hrefUrl + " The Page URL = " + Element.getAttribute(learnMoreLinkBy, "href"));
            return hrefUrl.equalsIgnoreCase(Element.getAttribute(Element.waitForVisible(learnMoreLinkBy), "href"));
        }
        return false;
    }

    /**
     * When making string comparisons, it is best to perform the verification using the two messages in the test itself.
     * Use {@link #getHelpMessage()} to get the help message and perform the verification.
     */
    @Deprecated
    public static final boolean isHelpMessageCorrect(String message) {
        // TODO help content
        verifyHelpIconClickedandClickIfNot();
        Element.waitForVisible(messageBy);
        if (Element.getMultiple(messageBy).size() != 0) {
            // print the message from the page
            System.out.println(Element.loadAndGetText(messageBy));
            // print the expected message
            System.out.println("The expected message: " + message);
            return message.contains(Element.loadAndGetText(messageBy));
        }
        return false;
    }

    /**
     * Gets the message displayed in the help pop-up.
     */
    public static String getHelpMessage() {
        verifyHelpIconClickedandClickIfNot();
        Element.waitForVisible(messageBy);
        return Element.loadAndGetText(messageBy);
    }

    public static void closeMessageIfDisplayed() {
        if (Element.isElementDisplayed(messageBy)) {
            Element.loadAndClick(messageBy);
        }
    }

    /**
     * Click on 'Vault' logo link without saving changes on the page to verify the confirmation dialog appeared or not.
     */
    public ConfirmDialog clickVaultLogoWithUnsavedChanges() {
        Element.loadAndClick(vaultLogoBy);
        return new ConfirmDialog();
    }

    /**
     * Clicks on Help icon if its not already clicked
     */
    public static void verifyHelpIconClickedandClickIfNot() {
        if (!AdminPage.isHelpMessageDisplayed()) {
            AdminPage.clickQuestionMarkIcon();
            Element.waitForVisible(messageBy);
            Element.waitForElementToStopMoving(messageBy);
        }
    }

    /**
     * Wait until the notification banner completely disappears from the top of the page. FIXME: replace all calls with
     * {@link #waitForBannerREAL()}
     *
     * @deprecated this method does nothing now in an effort to clean up the FW and reduce calls to it
     *
     * {@link #waitForBannerREAL()}
     */
    @Deprecated
    public static final void waitForBanner() {
    }

    /**
     * Wait until the notification banner completely disappears from the top of the page.
     */
    public static final void waitForBannerREAL() {
        new Banner().wAITFORBANNERDISAPPEAR();
    }

    /**
     * As Persistent Banner which appears after creating video and Binders does not disappears till user closes it
     * manually
     *
     * @deprecated please use {@link #waitForBanner()}
     */
    @Deprecated
    public static final void waitForSuccessAndLoadingBanner() {
        Element.waitForDisappear(loadingNotificationBy);
        Element.waitForDisappear(successBannerBy);
    }

    /**
     * Wait until the notification banner HAS displayed and then completely disappears from the top of the page. This
     * EXPECTS a banner to be present and if one is not expected or doesn't pertain to the test please use {@link
     * #waitForBannerREAL()}
     */
    public static final void waitForBannerToDisplayAndDisappear() {
        waitForSuccessBannerToDisplay();
        waitForSuccessAndLoadingBanner();
        Element.waitForDisappear(bannerWrapperBy);
    }

    /**
     * Get the text of any banner
     *
     * @return String of text
     */
    public static String getGenericBannerText() {
        return new Banner().waitForLoad().getBannerText();
    }

    /**
     * Method is used to get the text of Success banner.
     *
     * @return : Text of the Success banner.
     */
    public static String getSuccessBannerText() {
        return new Banner().waitForLoad().getBannerText();
    }

    /**
     * Method is used to get the text of Error banner.
     *
     * @return
     */
    public static String getErrorBannerText() {
        return new ErrorBanner().waitForLoad().getBannerText();
    }

    /**
     * Get persistent banner text
     */
    public static String getPersistentBannerText() {
        return new PersistentBanner().waitForLoad().getBannerText();
    }

    /**
     * Method is used to get Color of success banner.
     *
     * @return : Color of success banner.
     * @deprecated - no colour verification please
     */
    @Deprecated
    public static boolean checkSuccessBannerColour() {
        try {
            return Element.getColorAttribute(successBannerBy).contains("rgba(51, 102, 51, 1)");
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * Wait until the loading wheel completely disappears from the page.
     */
    public static final void waitForLoadingWheel() {
        Element.waitForDisappear(loadingWheelBy);
    }

    /**
     * Wait until the loading process icon completely disappears from the page.
     */
    public static final void waitForLoadingProcess() {
        Element.waitForDisappear(progressSmallBy);
    }

    /**
     * Wait until the loading wheel completely disappears from the page.
     */
    public static final void waitForAllLoadingWheels() {
        List<WebElement> loadingWheels = Element.getMultiple(loadingWheelBy);
        for (WebElement loadingWheel : loadingWheels) {
            Element.waitForDisappear(loadingWheel);
        }
    }

    /**
     * Wait until the loading wheel completely disappears from the page.
     */
    public static final void waitForAllLoadingWheelsToAppearThenDisappear() {
        try {
            Element.waitForVisible(loadingWheelBy);
            List<WebElement> loadingWheels = Element.getMultiple(loadingWheelBy);
            for (WebElement loadingWheel : loadingWheels) {
                Element.waitForDisappear(loadingWheel);
            }
        } catch (TimeoutException toe) {
            // Do nothing because its a stupid selenium bug anyways.
        }
    }

    /**
     * Wait until the loading wheel completely disappears from the page in a specified time
     *
     * @param time time to wait for loading wheel disappear
     */
    public static final void waitForLoadingWheelWithCustomTimeout(int time) {
        Element.waitForDisappearWithCustomTimeout(loadingWheelBy, time);
    }

    /**
     * Wait until the input blocking overlay completely disappears from the page.
     */
    public static final void waitForBlockOverlay() {
        Element.waitForDisappear(blockOverlayBy);
    }

    /**
     * Wait until all the block overlays disappear
     */
    public static final void waitForAllBlockOverlays() {
        List<WebElement> blocks = Element.getMultiple(blockOverlayBy);
        for (WebElement block : blocks) {
            Element.waitForDisappear(block);
        }
    }

    /**
     * If the blocking overlay is visible, wait for it to disappear
     *
     * @return true if the overlay was present return false if it was not
     */
    public static final boolean waitForBlockOverlayExplicitly() {
        if (Element.isElementDisplayed(blockOverlayBy)) {
            waitForBlockOverlay();
            return true;
        }

        return false;
    }

    /**
     * Waits until the success banner is displayed.
     *
     * @see #waitForBanner()
     */
    public static final void waitForSuccessBannerToDisplay() {
        Element.waitForVisible(successBannerBy);
    }

    /**
     * Waits until the success banner is displayed for 5 seconds.
     *
     * @see #waitForBanner()
     */
    public static final void waitForSuccessBannerToDisplayWithCustomTimeout(int timeout) {
        Element.waitForVisibleWithCustomTimeout(successBannerBy, timeout);
    }

    /**
     * wait for the alert to show up and accept it
     *
     * @param timeout time out in seconds
     */
    public static <T extends Loadable> T waitForAlertAndAccept(Class<T> resultingComponent) {
        WebDriver driver = DriverManager.getCurrent();
        WebDriverWait wait = new WebDriverWait(driver, Driver.TIMEOUT_20_SEC);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        try {
            return resultingComponent.newInstance().waitForLoad();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new VeevaException(
                    "Exception when attempting to instantiate resulting component " + resultingComponent, e);
        }
    }

    /**
     * Checks if the Vault is in View Configuration mode.
     *
     * @return true if current page is in View Configuration mode and false otherwise.
     * @since 05/05/2014
     */
    public boolean isInViewConfiguration() {
        return Element.isElementDisplayed(viewConfigurationBannerBy);
    }

    /**
     * checks if the given pagename is the currently selected tab.
     *
     * @param pageName - the name attribute value for the tab being examined ex : vault_loader__v
     * @return
     */
    public boolean isSelectedTab(String pageTitle) {
        return Element.containsText(Element.get(titleTagBy), pageTitle);
    }

    /**
     * <p>
     * Go back to the previous page as though using the browser's back button.
     * </p>
     * <p>
     * This is a Page Object method because often browser back events occur asynchronously, so specific pages should
     * override this method and add the appropriate waits that indicate the initial page is no longer displayed, likely
     * through Element staleness. When doing this, it's important to remember that one cannot predict the page the user
     * will be taken back to, so waits for element appearance or page loads should <em>not</em> be added, and
     * consideration should be taken for scenarios where the user is taken back to another instance of the same page
     * (i.e. {@link DocInfoPage} -> {@link DocInfoPage}).
     * </p>
     * <p>
     * Note that overriding this method may not be applicable for superclass pages (i.e. {@link VaultPage}) as browser
     * back events may not always cause DOM changes specific to those pages.
     * </p>
     *
     * Use {@link #clickBrowsersBackButton()} instead
     */
    @Deprecated
    public void back() {
        new Driver().back();
    }

    /**
     * <p>
     * Messages container class.
     * </p>
     * <p>
     * All pages/components should inherit their Messages class from their superclass' Messages class, if applicable.
     * This will ensure that each class only defines the messages specific to that class, but still has access to other
     * messages that appear on the page (but are shared by other pages).
     * </p>
     * <p>
     * All Messages class definitions should contain predictable methods/members, with the following pattern:
     * </p>
     * <code> public static class Messages extends SuperClass.Messages {<br> &nbsp&nbsp&nbsp&nbspprivate static final
     * Message MESSAGE_NAME = new StaticMessage("message.key");<br> &nbsp&nbsp&nbsp&nbspprivate static final Message
     * MESSAGE_WITH_ARGS = new DynamicMessage("message.with.args");<br> <br> &nbsp&nbsp&nbsp&nbsppublic static final
     * String messageName() {<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspreturn MESSAGE_NAME.get();<br>
     * &nbsp&nbsp&nbsp&nbsp}<br> <br> &nbsp&nbsp&nbsp&nbsppublic static final String messageWithArgs(final String arg1,
     * final String arg2) {<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspreturn MESSAGE_WITH_ARGS.get().replace("{0}",
     * arg1).replace("{1}", arg2);<br> &nbsp&nbsp&nbsp&nbsp}<br> } </code>
     * <p>
     * Retrieving a message string looks like the following:
     * </p>
     * <code> String str1 = ClassName.Messages.messageName();<br> String str2 =
     * ClassName.Messages.messageWithArgs(argStr, argStr2);<br> </code>
     *
     * @author Scott Kirkpatrick
     * @version 7.0.0, 10/23/2013
     * @since 7.0.0, 10/23/2013
     */
    public static class Messages {

    }

    /**
     * Get current username by getting java script variable.
     *
     * @return current username as string
     */
    public static String getCurrentUsername() {
        try {
            return (String) ((JavascriptExecutor) DriverManager.getCurrent()).executeScript("return USER.name");
        } catch (WebDriverException e) {
            return null;
        }
    }

    /*
     * One method to clear any property
     */

    /**
     * Gets the property as a WebElement using the "name" tag value. Retrieves the data type of that property and clears
     * the value accordingly.
     *
     * TODO: When clearing a date field, ensure the Date Picker disappears
     *
     * @param propertyName is the value in the "name" tag of the property
     */
    protected PageObject clear(String propertyName) {
        // get the proper field By, and dataType
        By by = getBy(propertyName);
        WebElement element = Element.waitForLoad(by);
        Element.scrollToElement(element);
        String propertyType = element.getAttribute("datatype");
        // for null types clear text and clear input, basically throw everything at it because, well, we have no clue
        if (propertyType == null) {
            try {
                Element.clearText(element);
                MultiItemSelectInput input = new MultiItemSelectInput(".docInfoValue-" + propertyName);
                if (input.isMultiItemSelectDisplayed()) {
                    input.clear();
                }
            } catch (RuntimeException runtime) {
                throw new VeevaInvalidValueException(
                        "Unable to clear field of type " + propertyType + Util.takeScreenshot());
            }

            // Text, Number, URL, and Date handling to just clear text
        } else if (propertyType.equals(TEXT) || propertyType.equals(NUMBER) || propertyType.equals(URL)) {
            Element.clearText(element);
        } else if (propertyType.equals(DATE)) {
            element.clear();
            // Picklist, Catalog, and Object field handling to click X if multi-select and then clear the input
        } else if (propertyType.equals(PICKLIST) || propertyType.equals(CATALOG)
                || propertyType.equals(OBJECT_REFERENCE)) {
            // click Xs
            while (Element.isElementDisplayedWithin(element, By.cssSelector("span.removeItem"))) {
                WebElement clickedElement = Element
                        .loadAndClick(element.findElement(By.cssSelector("span.removeItem")));
                waitForBlockOverlay();
                Element.waitForLoad(by);
                Element.waitForDisappear(clickedElement);
            }

            // clear input
            MultiItemSelectInput input = new MultiItemSelectInput(".docInfoValue-" + propertyName);
            input.clear();
        } else {
            throw new VeevaInvalidValueException("Unable to clear field of type " + propertyType);
        }

        waitForBlockOverlay();
        return this;

    }

    /**
     * Gets the By object of an Element by the name value
     *
     * @param name is a String value of the "name" tag value of the property
     * @return By object of the property
     */
    protected By getBy(String name) {
        return By.cssSelector("[name='" + name + "']");
    }

    /**
     * Switch to the new tab. Use when a user action opens up a new tab.
     *
     * @param n : total number of tabs to expect
     */
    public void switchToNewTab(int n) {
        Element.waitForNumberOfWindowsToEqual(n);
        Element.switchToWindowsPopup();
    }

    /**
     * Switch to the new tab. Use when a user action opens up a new tab
     *
     * @param resultingNewPage : The expected page to be loaded in the new tab
     * @return the page that is loaded in the new tab
     */
    public <T extends Loadable> T switchToNewTab(Class<T> resultingNewPage) {
        VeevaLogger.getLogger().info("Number of Tabs opened now: " + new Driver().getNumberOfWindowHandles());
        VeevaLogger.getLogger().info("Number of Tabs opened right now: "+new Driver().getNumberOfWindowHandles());
        Element.waitForNumberOfWindowsToEqual(2);
        Element.switchToWindowsPopup();

        try {
            return resultingNewPage.newInstance().waitForLoad();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new VeevaException("Exception when attempting to instantiate resulting component " + resultingNewPage,
                    e);
        }
    }

    /**
     * Switch back to the main window after having switched to a new tab.
     */
    public void switchToMainTab() {
        Element.switchToMainWindow();
    }

    /**
     * Close the current tab you are on and switch to the main tab
     */
    public void closeCurrentTab() {
        DriverManager.getCurrent().close();
        switchToMainTab();
    }

    /**
     * Close the current tab you are on and switch to the main tab
     */
    public void closeCurrentWindow() {
        DriverManager.getCurrent().close();
        switchToMainTab();
    }

    /**
     * Closes windows pop up
     */
    public void closeWindowsPopup() {
        Set<String> handles = DriverManager.getCurrent().getWindowHandles();
        java.util.Iterator<String> itr = handles.iterator();
        String firstHandle = itr.next();
        String lastHandle = firstHandle;
        while (itr.hasNext()) {
            lastHandle = itr.next();
        }
        DriverManager.getCurrent().switchTo().window(lastHandle.toString()).close();
        Element.switchToMainWindow();
    }

    /**
     * Grabs the URL as a String of the currently focused page, tab, window, or reality
     *
     * @return The current URL as a String
     */
    public static String getCurrentURL() {
        // sleeper to account for URL processing without having to write a wait for load for non-vault pages.
        Sleeper.sleepTight(1500);
        return DriverManager.getCurrent().getCurrentUrl();
    }

    /**
     * @return true if "Page not found" message is displayed
     */
    public static boolean isPageNotFoundDisplayed() {
        Element.waitForVisible(pageBodyBy);
        Element.waitForElementToStopMoving(pageNotFoundBy);
        return Element.isElementDisplayed(pageNotFoundBy);
    }

    /**
     * @return true if "Document Not Found" message is displayed
     */
    public static boolean isDocumentNotFoundDisplayed() {
        Element.waitForVisible(pageBodyBy);
        return Element.containsText(documentNotFoundBy, DOC_NOT_FOUND.get());
    }

    /**
     * Does what it says it does. Do you even be like know how it do?
     *
     * @return
     */
    public static String checkForServerErrorAndGetKey() throws UnknownError {
        if (isServerHavingProblemsDisplayed() && Element.isElementEnabled(statusErrorMoreInfoBy)) {
            ErrorConsolePage ecp = clickMoreInfoOnErrorStatus();
            throw new UnknownError("Uh oh spaghetti O!" + ecp.getLogKey());
        }
        return null;
    }

    /**
     * Click the more info button on a server having problems. Will wait and switch to the new window Taken from vault
     * page
     *
     * @return {@link ErrorConsolePage}
     */
    public static ErrorConsolePage clickMoreInfoOnErrorStatus() {
        Element.loadAndClick(statusErrorMoreInfoBy);
        Element.waitForNumberOfWindowsToEqual(2);
        Element.switchToWindowsPopup();
        // TODO: Figure out a work-around for this sleeper
        Sleeper.sleepTightInSeconds(2);
        return new ErrorConsolePage().waitForLoad();
    }

    /**
     * A base wait for {@link Loadable} Class method, this can be used in methods that have variable returns, such as
     * dialogs, or uploads, or ETC
     *
     * @param resultingComponent - The Class to wait for load (DocInfoPage.class)
     * @return - the resultingComponent.waitForLoad();
     */
    public static <T extends Loadable> T waitForComponent(Class<T> resultingComponent) {
        try {
            // Try calling waitForLoad
            return resultingComponent.newInstance().waitForLoad();
        } catch (InstantiationException | IllegalAccessException e) {
            // If failed, throw an exception
            throw new VeevaException(
                    "Exception when attempting to instantiate resulting component " + resultingComponent, e);
        }
    }

    /**
     * Returns true if showMore link is displayed, false otherwise.
     */
    public static final boolean showMoreLinkDisplayed() {
        if (Element.getMultiple(learnMoreLinkBy).size() != 0) {
            return Element.containsText(learnMoreLinkBy, learnMoreText);
        }
        return false;
    }

    /**
     * Returns true if showLess link is displayed, false otherwise.
     */
    public static final boolean showLessLinkDisplayed() {
        if (Element.getMultiple(learnMoreLinkBy).size() != 0) {
            return Element.containsText(learnMoreLinkBy, learnLessText);
        }
        return false;
    }

    /**
     * Looks for any red-text error messages on the page.
     */
    public static boolean isErrorMessageDisplayedOnPage() {
        List<WebElement> elems = Element.getMultiple(errorMessageBy);
        return !elems.isEmpty();
    }

    /**
     * Retrieves a list of red-text error messages displayed on the page
     */
    public static List<String> getErrorMessagesOnPage() {
        Element.waitForVisible(errorMessageBy);
        List<WebElement> elems = Element.getMultiple(errorMessageBy);
        if (!elems.isEmpty()) {
            Stream<String> errorStream = elems.stream().map(WebElement::getText);
            return errorStream.collect(Collectors.toList());
        }
        throw new VeevaNoSuchElementException("No error messages could be found on the page" + Util.takeScreenshot());
    }

    /**
     * Checks if a date lies between a startDate and endDate date range
     *
     * @param startDate : Starting date of the range
     * @param endDate : End date of the range
     * @param lastModifiedDate : lastModifiedDate value
     */
    public static boolean verifyDatesBetween(Date startDate, Date endDate, List<String> dateElementsToCheck) {
        for (String dateElementToCheck : dateElementsToCheck) {
            Date dateToCheck = null;
            if (dateElementToCheck.split(" ").length > 1)
                dateToCheck = Util.getDate(dateElementToCheck.split(" ")[0], dateformatMMDDYYYY);
            else
                dateToCheck = Util.getDate(dateElementToCheck, dateformatMMDDYYYY);
            if (!dateToCheck.after(startDate) || !dateToCheck.before(endDate))
                return false;
        }
        return true;
    }

    /**
     * retunrs the date as list from Report result page
     *
     * @param null
     */
    public static List<String> getDate(By dateBy) {
        List<WebElement> modified_element = Element.getMultiple(dateBy);
        List<String> dates = new ArrayList<String>();
        for (int i = 0; i < modified_element.size(); i++) {
            dates.add(modified_element.get(i).getText());
        }
        return dates;
    }

    /**
     * Looks for a save button on the page and clicks it. That's it.
     */
    public static void saveAction() {
        Element.loadAndClick(saveButtonBy);
    }

    /**
     * Looks for a delete button on the page and clicks it. That's it.
     */
    public static void deleteAction() {
        Element.loadAndClick(deleteButtonBy);
    }

    /**
     * Looks for a cancel button on the page and clicks it. That's it.
     */
    public static void cancelAction() {
        Element.loadAndClick(cancelButton);
    }

    /**
     * Refreshes the current page and returns respective calling page.
     *
     * @param resultingComponent
     */
    public static <T extends Loadable> T refreshCurrentPage(Class<T> resultingComponent) {
        new Driver().refresh();
        waitForAllLoadingWheels();
        try {
            return resultingComponent.newInstance().waitForLoad();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new VeevaException(
                    "Exception when attempting to instantiate resulting component " + resultingComponent, e);
        }
    }

    /**
     * Method used to verify header logo is displaying in all different pages
     *
     * @return True if logo is a displayed, false otherwise.
     */
    public boolean isHeaderLogoDisplayed() {
        return Element.isElementDisplayed(headerLogoBy);
    }

    /**
     * Expands a picklist, single item select, or multi item select box's dropdown menu and retrieves the list of
     * available options.
     *
     * @param label : The label denoting the picklist on the page
     * @return : {@link List<String> List} of values. May contain duplicates if the dropdown has multiple sections e.g.
     * RECENT/ALL
     */
    public static List<String> getAvailableOptionsFromPicklistDropdown(String label) {
        String picklistBy = multiSelectdropDownTemplate.replace("{{dropDownBox}}", label);
        Element.waitForVisible(By.cssSelector(picklistBy));
        Element.loadAndClick(By.cssSelector(picklistBy));
        waitForBlockOverlay();
        return ElementUtil.getAvailablePLValues(picklistBy);
    }

    /**
     * navigates to a specified URL "bookmark" page
     *
     * @param url - the URL of the bookmark to navigate to, full URL is fine and will be converted for environment
     * @return the @param resultingComponent waited for load
     */

    public static <T extends Loadable> T navigateToBookmark(String url, Class<T> resultingComponent) {
        url = Task.convertMyURLToEnvURL(url);
        new Driver().open(url);
        return waitForComponent(resultingComponent);
    }

    /**
     * navigates to a specified url in current vault, assume already logged into vault.
     *
     * @param url - the url of the page to navigate to, the dns entry and host name will be grabbed from current page
     * url
     * @return
     */
    public static <T extends Loadable> T navigateToCurrentVualt(String url, Class<T> resultingComponent) {
        url = Task.convertToCurrentURL(url);
        logInfo("URL created for ObjectTypeDetailPage: " + url);
        new Driver().open(url);
        waitForAllLoadingWheels();
        return waitForComponent(resultingComponent);
    }

    /**
     * navigates to a specified url in current vault, assume already logged into vault. In case a PAGE_ID by By exists
     * BOTH on the page you are on and are navigating to, you can pass this By as a parameter and this will wait for
     * Original to disappear
     *
     * @param url - the url of the page to navigate to, the dns entry and host name will be grabbed from current page
     * url
     * @param pageIDBy - the PAGE_ID By to grab from original page if it exists and wait for disappear on new
     */
    public static <T extends Loadable> T navigateToCurrentVualt(String url, Class<T> resultingComponent, By pageIDBy) {
        // If the element you are waiting for on resulting component is present currently, grab an original
        WebElement originalPageID = null;
        if (Element.isElementDisplayed(pageIDBy)) {
            originalPageID = Element.get(pageIDBy);
        }
        url = Task.convertToCurrentURL(url);
        // Navigate via URL
        new Driver().open(url);
        // If the element you are waiting for on resulting component was present before, wait for original to disappear
        if (originalPageID != null) {
            Element.waitForDisappear(originalPageID);
        }
        return waitForComponent(resultingComponent);
    }

    /**
     * Wait for the header to be displayed on any page.
     */
    public static void waitForVaultPageOrAdminPage() {
        Element.waitForAnyVisible(vaultHeaderBy, adminHeaderBy);
    }

    /**
     * checks if the server having problems is present on page
     *
     * @return true if server having problems is present
     */
    public static boolean isServerHavingProblemDisplay() {
        // poll for presence of;
        for (int i = 0; i < 20; i++) {
            if (Element.isElementPresent(statusErrorBy)) {
                return true;
            }
            Sleeper.sleepTightInSeconds(1);
        }
        return false;
    }

    /**
     * @return true if "You do not have permission to view this record" message is displayed
     */
    public static boolean isNoPermToViewDisplayed() {
        Element.waitForVisible(pageBodyBy);
        Element.waitForElementToStopMoving(noPermBy);
        return Element.isElementDisplayed(noPermBy);
    }

    /**
     * clicks the question mark icon on the page Header bringing up help text
     */
    public static void clickQuestionMarkInHeaderOnAdminPage() {
        Element.getMultiple(questionMarkIconBy)
                .stream()
                .filter(WebElement::isDisplayed)
                .collect(Collectors.toList())
                .get(1)
                .click();
    }

    /**
     * This method will produce similar action as a browser's back button.
     *
     * NOTE :
     * Use this method only
     * 1. When required or the test case demands.
     * 2. You are sure which page will load after clicking the back button as we use two types of navigation i.e. URL
     * and navigation through menu. Both of this will load the last visited page.
     * E.g.
     * a. Login -> Home Page loads -> Navigated to Security policy page via URL
     *          -> Use back button -> Home Page loads.
     * b. Login -> Home Page loads -> Navigated through menu -> Admin
     *          ->Settings -> Security Policy -> Use back button -> Settings page will load.
     * 3. You are logged in and have performed at least one navigation to some other page after the expected page
     * is loaded.
     *
     * Above points will help you to get the best use of this method.
     *
     * (Recommended to add a waitForLoad of that page class as the next line of your code because we are unsure about
     * the time it takes to load that particular page.)
     *
     * In case, above point is not followed, the back button is disabled and you are still using this in your code,
     * then this method will do nothing apart from increasing your code line by 1.
     *
     */
    public static void clickBrowsersBackButton(){
        new Driver().back();
        waitForAllLoadingWheels();
        waitForBannerREAL();
    }

    /**
     * This method will produce similar action as a browser's forward button
     *
     * NOTE :
     * Use this method only
     * 1. If you have used {@link #clickBrowsersBackButton()} as the forward button will remain disable unless
     * and until we use the back button.
     * 2. You are sure which page will load after clicking the forward button.
     *
     * Above points will help you to get the best use of this method.
     *
     * (Recommended to add a waitForLoad of that page class as the next line of your code because we are unsure about
     *  the time it takes to load that particular page.)
     *
     *  In case, above point is not followed, the forward button is disabled and you are still using this in your code,
     *  then this method will do nothing apart from increasing your code line by 1.
     *
     *  Forward will always load the last page that you were on before using {@link #clickBrowsersBackButton()}
     */
    public static void clickBrowsersForwardButton(){
        new Driver().forward();
        waitForAllLoadingWheels();
        waitForBannerREAL();
    }

    /**
     * Checks if the delegation banner is displayed at the top of page
     *
     * @return true if the banner is displayed, false if it is not
     */
    public static boolean isDelegateBannerDisplayedAtTheTop() {
        return delegateBanner.isVisible();
    }

}