package com.qa.stdSeleniumUtility;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.google.common.base.Function;
import com.qa.stdBrowser.WebDriverManager;
import com.qa.stdDataBaseUtility.DataBaseRowsTo;
import com.qa.stdReports.Report;
import com.qa.stdUtility.CaptureScreenshot;
import com.qa.stdUtility.ExceptionHandler;
import com.qa.stdUtility.GlobalVaribales;
import com.qa.stdUtility.Reporter;

public class ActionsUtility {

	List<DataBaseRowsTo> listOfElements;
	static boolean screentshotCapturePerAction = false;

	// assigning listElements to ActionsUtility class
	public ActionsUtility(List<DataBaseRowsTo> argsListElement) {
		this.listOfElements = argsListElement;
	}

	// screen shot configuration to as action

	public static void configurationScreentshotPerAction() {
		// reading from command line
		String captureScreenShotAction = System.getProperty("screentshotCapturePerAction");

		if (captureScreenShotAction != null) {
			screentshotCapturePerAction = Boolean.parseBoolean(captureScreenShotAction);
		} else {
			// reading from property file
			screentshotCapturePerAction = Boolean
					.parseBoolean(GlobalVaribales.configProp.getProperty("screentshotCapturePerAction"));
		}

	}

	private void takeScreenShotEveryAction() {
		if (screentshotCapturePerAction) {
			if (Reporter.TScenario.get() != null) {
				Reporter.addScreenCapture();
			}
		}
	}

	// Element click operation

	public final void click(WebElement element) {

		String status = "FAIL";
		try {
			new WebDriverWait(WebDriverManager.getDriver(), GlobalVaribales.waitTime)
					.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Click");
			Report.printStatus(status);
		}

	}

	// context click operation

	public final void contextClick(WebElement element) {

		String status = "FAIL";
		try {
			new WebDriverWait(WebDriverManager.getDriver(), GlobalVaribales.waitTime)
					.until(ExpectedConditions.elementToBeClickable(element));

			new Actions(WebDriverManager.getDriver()).contextClick(element).perform();
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("context Click");
			Report.printStatus(status);
		}

	}

	// double click operation

	public final void doubleClick(WebElement element) {

		String status = "FAIL";
		try {
			new WebDriverWait(WebDriverManager.getDriver(), GlobalVaribales.waitTime)
					.until(ExpectedConditions.elementToBeClickable(element));

			new Actions(WebDriverManager.getDriver()).doubleClick(element).perform();
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("double Click");
			Report.printStatus(status);
		}

	}

	public final void clear(WebElement element) {

		String status = "FAIL";
		try {
			new WebDriverWait(WebDriverManager.getDriver(), GlobalVaribales.waitTime)
					.until(ExpectedConditions.visibilityOf(element));

			element.clear();
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("clear");
			Report.printStatus(status);
		}

	}

	// sendKeys

	public final void sendKeys(WebElement element, String value) {
		String status = "FAIL";
		try {
			element.sendKeys(value);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("sendKeys");
			Report.printValue(value);
			Report.printStatus(status);
		}

	}
	// SendKeys takes key as parameter

	public final void sendKeys(WebElement element, Keys keys) {
		String status = "FAIL";
		try {
			element.sendKeys(keys);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("sendKeys");
			Report.printValue(keys.toString());
			Report.printStatus(status);
		}

	}

	public final void sendKeys(Keys keys) {
		String status = "FAIL";
		try {
			Actions actions = new Actions(WebDriverManager.getDriver());
			actions.sendKeys(keys).perform();
			;
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("sendKeys");
			Report.printValue(keys.toString());
			Report.printStatus(status);
		}

	}

	// send keys char by char

	public final void sendKeysCharesterWise(WebElement element, String input1) {
		String status = "FAIL";
		try {
			char[] charArray = input1.toCharArray();
			for (char c : charArray) {
				element.sendKeys(c + "");
				Thread.sleep(500);
			}
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("sendKeys");
			Report.printValue(input1);
			Report.printStatus(status);
		}

	}

	// Javascript to send character to text field

	public final void javascriptSendKeys(WebElement element, String value) {
		String status = "FAIL";
		try {
			JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();
			js.executeScript("arguments[0].setAttribute('value','" + value + "');", element);

			status = "PASS";

			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("js sendKeys");
			Report.printValue(value);
			Report.printStatus(status);
		}

	}

	// sendKeys using system clipboard

	public final void sendKeysClipboard(WebElement element, String value) {
		String status = "FAIL";
		try {
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection str = new StringSelection(value);
			clipboard.setContents(str, null);
			element.sendKeys(Keys.CONTROL, "v");

			status = "PASS";

			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("sendKeys");
			Report.printValue(value);
			Report.printStatus(status);
		}

	}

	// close browser

	public final void closeBrowser() {
		String status = "FAIL";
		try {
			WebDriverManager.getDriver().close();
			status = "PASS";

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Close Browser");
			Report.printStatus(status);
		}

	}

	// quit browser

	public final void quitBrowser() {
		String status = "FAIL";
		try {
			WebDriverManager.getDriver().quit();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Quit Browser");
			Report.printStatus(status);
		}

	}

	// is Alert Present

	public final boolean isAlertPresent() {
		boolean isAlertPresent = false;

		String status = "FAIL";

		try {
			ExpectedCondition<Alert> alertIsPresent = ExpectedConditions.alertIsPresent();

			if (alertIsPresent != null) {
				isAlertPresent = true;
			}
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("isAlertPresent");
			Report.printStatus(status);
		}
		return isAlertPresent;
	}

	// switch to alert

	public final Alert switchToAlert() {
		Alert alert = null;
		String status = "FAIL";

		try {
			alert = WebDriverManager.getDriver().switchTo().alert();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("switch to Alert");
			Report.printStatus(status);
		}
		return alert;
	}

	// accept alert

	public final void acceptAlert(Alert alert) {
		String status = "FAIL";

		try {
			alert.accept();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("accept Alert");
			Report.printStatus(status);
		}
	}

//dismiss alert

	public final void dismissAlert(Alert alert) {
		String status = "FAIL";

		try {
			alert.dismiss();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("dismiss Alert");
			Report.printStatus(status);
		}
	}

//get alert text

	public final String getAlertText(Alert alert) {
		String alertText = null;
		String status = "FAIL";

		try {
			alertText = alert.getText();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("getting Alert text");
			Report.printStatus(status);
		}
		return alertText;
	}

	// move to a element

	public final void moveToElement(WebElement element) {
		String status = "FAIL";

		try {
			new Actions(WebDriverManager.getDriver()).moveToElement(element).build().perform();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("javascript click");
			Report.printStatus(status);
		}
	}

// drag and drop source to destination 

	public final void dragAndDrop(WebElement sourceElement, WebElement destElement) {
		String status = "FAIL";

		try {
			new Actions(WebDriverManager.getDriver()).dragAndDrop(sourceElement, destElement).perform();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Drag and Drop");
			Report.printStatus(status);
		}
	}

// get element text 

	public final String getElementText(WebElement element) {
		String text = "undefined";
		String status = "FAIL";

		try {
			text = element.getText();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Get Text");
			Report.printValue(text);
			;
			Report.printStatus(status);
		}
		return text;
	}

	// getElementValue

	public final String getElementValue(WebElement element) {
		String text = "undefined";
		String status = "FAIL";

		try {
			text = element.getAttribute("value");
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Get value");
			Report.printValue(text);
			;
			Report.printStatus(status);
		}
		return text;
	}

	// get web element attribute value

	public final String getElementAttributeValue(WebElement element, String attributeName) {
		String value = "undefined";
		String status = "FAIL";

		try {
			value = element.getAttribute(attributeName);
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Get attribute" + attributeName);
			Report.printValue(value);
			;
			Report.printStatus(status);
		}
		return value;
	}

//get page title

	public final String getPageTitle(WebElement element, String attributeName) {
		String title = "undefined";
		String status = "FAIL";

		try {
			title = WebDriverManager.getDriver().getTitle();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Geting page title ");
			Report.printValue(title);
			;
			Report.printStatus(status);
		}
		return title;
	}

//Expand root element

	public final WebElement expandRootElement(WebElement element) {

		WebElement elementExpanded = null;
		JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();

		String status = "FAIL";

		try {
			elementExpanded = (WebElement) js.executeScript("return argument[0].shadowRoot", element);
			System.out.print(" expandRootElement element " + element);
			status = "PASS";

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("expand shadowRoot");
			Report.printStatus(status);
		}
		return elementExpanded;
	}

// highlight WebElement 

	public final void highlightWebElement(WebElement element) {

		String status = "FAIL";
		JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();

		try {
			js.executeScript("argument[0].setAttribute('style', 'background: blue; border: 4px solid yellow;');",
					element);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("highlight WebElement");
			Report.printStatus(status);
		}
	}

// isDisplayed 
	public final boolean isDisplayed(WebElement element) {
		boolean isDisplayed = false;
		String status = "FAIL";

		try {
			isDisplayed = element.isDisplayed();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Is Displayed");
			Report.printStatus(status);
		}
		return isDisplayed;
	}

//is Enabled 
	public final boolean isEnabled(WebElement element) {
		boolean isEnabled = false;
		String status = "FAIL";

		try {
			isEnabled = element.isEnabled();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Is Enabled");
			Report.printStatus(status);
		}
		return isEnabled;
	}

//is Selected 
	public final boolean isSelected(WebElement element) {
		boolean isSelected = false;
		String status = "FAIL";

		try {
			isSelected = element.isSelected();
			status = "PASS";
			takeScreenShotEveryAction();

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Is Selected");
			Report.printStatus(status);
		}
		return isSelected;
	}

// isBold based on the tags "b" and "strong"

	public final boolean isBold(WebElement element) {
		boolean flag = false;
		String status = "FAIL";

		if (element.getTagName().equals("b") || element.getTagName().equals("strong")) {
			flag = true;
		}
		takeScreenShotEveryAction();
		return flag;
	}

//isBold based on the font-weight cass value

	public final boolean isBold(WebElement element, int fontWeight) {
		boolean flag = false;
		String value = element.getCssValue("font-weight");

		if (Integer.parseInt(value) >= fontWeight) {
			flag = true;
		}
		takeScreenShotEveryAction();
		return flag;
	}

//isUnderline based on css test-decoration style

	public final boolean isUnderline(WebElement element) {
		boolean flag = false;

		if (element.getCssValue("test-decoration").equals("underline")) {
			flag = true;
		}
		takeScreenShotEveryAction();
		return flag;
	}

// return CSS value of WebElement

	public final String getCssValue(WebElement element, String cssName) {
		String value = "";
		String status = "FAIL";

		try {
			value = element.getCssValue(cssName);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Geting CSS value ");
			Report.printValue(value);
			Report.printStatus(status);
			Report.printKey(cssName);
		}
		return value;
	}

//Return Browser cookies

	public final Set<org.openqa.selenium.Cookie> getCookies() {

		Set<org.openqa.selenium.Cookie> cookiesSet = null;
		String status = "FAIL";

		try {
			cookiesSet = WebDriverManager.getDriver().manage().getCookies();
			status = "PASS";

		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Get Browser cookie");
			Report.printStatus(status);
		}
		return cookiesSet;
	}

//java script click 
	
	public final void jsClick(WebElement element) {

		String status = "FAIL";
		JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();

		try {
			js.executeScript("argument[0].click();", element);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("java script Click");
			Report.printStatus(status);
		}
	}
	
	
	//open application URL from GlobalVariable class
	
	public final void openURL() {

		String status = "FAIL";

		try {
			WebDriverManager.getDriver().get(GlobalVaribales.applicationURL);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Open URL");
			Report.printValue(GlobalVaribales.applicationURL);
			Report.printStatus(status);
		}
	}
	
	
	//open application URL passed as parameter
	
	public final void openURL(String url) {

		String status = "FAIL";

		try {
			WebDriverManager.getDriver().get(url);
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Open URL");
			Report.printValue(url);
			Report.printStatus(status);
		}
	}
		
	
	//get current page URL 
	
	public final String getCurrentURL(String url) {
		String currentURL = "undefine";
		String status = "FAIL";

		try {
			currentURL = WebDriverManager.getDriver().getCurrentUrl();
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Get current URL");
			Report.printStatus(status);
		}
		return currentURL;
	}	
	
	
	//get current page source 
	
	public final String getPageSource() {
		String pageSource = "undefine";
		String status = "FAIL";

		try {
			pageSource = WebDriverManager.getDriver().getPageSource();
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Get page source");
			Report.printStatus(status);
		}
		return pageSource;
	}
	
	
	//opening a application in new tab
	
	public final void openNewTab(String url) {

		String status = "FAIL";

		try {
			((JavascriptExecutor) WebDriverManager.getDriver()).executeScript("window.open('" + url+ "','_blank');");
			status = "PASS";
			takeScreenShotEveryAction();
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("Open a new tab");
			Report.printValue(url);
			Report.printStatus(status);
		}
	}
	
	
	// scroll to bottom 
	
	public final void scrollToBottom() {
		JavascriptExecutor js =(JavascriptExecutor) WebDriverManager.getDriver();
		String status = "FAIL";

		try {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("scroll To Bottom");
			Report.printStatus(status);
		}
	}	
	
	
	// scroll to up 
	
	public final void scrollToUp() {
		JavascriptExecutor js =(JavascriptExecutor) WebDriverManager.getDriver();
		String status = "FAIL";

		try {
			js.executeScript("window.scrollBy(0, -350)", "");
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("scroll To up");
			Report.printStatus(status);
		}
	}	
	
	// scroll by pixel  
	
	public final void scrollByPixel(String value) {
		JavascriptExecutor js =(JavascriptExecutor) WebDriverManager.getDriver();
		String status = "FAIL";
		try {
			js.executeScript("window.scrollBy(0," + value + ")");
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("scroll by pixel");
			Report.printStatus(status);
		}
	}	
	
	// scroll to a WebElement  
	
	public final void scrollToElement(WebElement element) {
		
		String status = "FAIL";
		
		JavascriptExecutor js =(JavascriptExecutor) WebDriverManager.getDriver();

		try {
			js.executeScript("arguments[0].scrollIntoView();" , element);
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("scroll by element");
			Report.printStatus(status);
		}
	}	
		
	// switch frame by Name
	
	public final void switchFrameByName(String name) {
		
		String status = "FAIL";
		
		try {
			WebDriverManager.getDriver().switchTo().frame(name);
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("switch frame by Name");
			Report.printValue(name);
			Report.printStatus(status);
		}
	}
	
	// switch frame by Index
	
	public final void switchFrameByIndex(int index) {
		
		String status = "FAIL";
		
		try {
			WebDriverManager.getDriver().switchTo().frame(index);
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("switch frame by index");
			Report.printValue(index + "");
			Report.printStatus(status);
		}
	}

	// switch frame by WebElement
	
	public final void switchFrameByWebElement(WebElement frameElement) {
		
		String status = "FAIL";
		
		try {
			WebDriverManager.getDriver().switchTo().frame(frameElement);
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("switch frame by WebElement");
			Report.printStatus(status);
		}
	}
	
	// switch to default content
	
	public final void switchFrameToDefaultContent() {
		
		String status = "FAIL";
		
		try {
			WebDriverManager.getDriver().switchTo().defaultContent();
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("switch frame to default content");
			Report.printStatus(status);
		}
	}
	// switch to parent frame
	
	public final void switchFrameToParentFrame() {
		
		String status = "FAIL";
		
		try {
			WebDriverManager.getDriver().switchTo().parentFrame();
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("switch frame to parent frame");
			Report.printStatus(status);
		}
	}
	
	// select check box by value
	
public final void  selectCheckboxByValue( Select select, String value) {
		
		String status = "FAIL";
		
		try {
			select.selectByValue(value);
			status = "PASS";
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		} finally {
			Report.printOperation("select Checkbox By Value");
			Report.printStatus(status);
		}
	}
	

// select check box by index

public final void  selectCheckboxByIndex( Select select, int index) {
	
	String status = "FAIL";
	
	try {
		select.selectByIndex(index);
		status = "PASS";
	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("select Checkbox By index");
		Report.printValue(index +"");
		Report.printStatus(status);
	}
}
	
//select check box by visibleText

public final void  selectCheckboxByVisibleText( Select select, String visibleText) {
	
	String status = "FAIL";
	
	try {
		select.selectByVisibleText(visibleText);
		status = "PASS";
	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("select Checkbox By index");
		Report.printValue(visibleText );
		Report.printStatus(status);
	}
}
		
//deselect all option selected in drop down 

public final void  deSelectAllOption(Select select) {
	
	String status = "FAIL";
	
	try {
		select.deselectAll();
		status = "PASS";
	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("all options deselected");
		Report.printStatus(status);
	}
}
	
	
//get all select option from drop down 

public final List<WebElement>  getSelectOption(Select select) {
	
	String status = "FAIL";
	List<WebElement> options = null;
	
	try {
		options = select.getOptions();
		status = "PASS";
		takeScreenShotEveryAction();
	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("get all options");
		Report.printStatus(status);
	}
	
	return options;
}
	
//get all selected option from drop down 

public final List<WebElement>  getSelectedOption(Select select) {
	
	String status = "FAIL";
	List<WebElement> options = null;
	
	try {
		options = select.getAllSelectedOptions();
		status = "PASS";
		takeScreenShotEveryAction();
	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("get all selected options");
		Report.printStatus(status);
	}
	
	return options;
}
	
// take a screenshot

public final void  takeScreenShot() {
	
	String status = "FAIL";
	
	try {
		CaptureScreenshot.screenCapture();
		status = "PASS";

	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("TakeScreenshot");
		Report.printStatus(status);
	}
}
	
	
//take screenshot for entire window 

public final void  captureEntireScreenShot() {
	
	String status = "FAIL";
	
	try {
		CaptureScreenshot.captureEntireScreenshot();
		status = "PASS";

	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("TakeScreenshot");
		Report.printStatus(status);
	}
}
	
	// wait to load page

public final boolean waitToLoadPage() {
	
	String status = "FAIL";
	JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();
	boolean isPageLoaded = false;
	
	try {
		while (isPageLoaded == false) {
			isPageLoaded = js.executeScript("return document.readyState").toString().equals("complete");
			status = "PASS";
		}

	} catch (Exception e) {
		ExceptionHandler.handleException(e);
	} finally {
		Report.printOperation("wait for To Load Page");
		Report.printStatus(status);
	}
	return isPageLoaded;
}


//wait for For JavaSccript Elements

public List<WebElement> waitForJSElements(String dataBaseKey) {
	
	int timeLpas = 0;
	String status = "FAIL";
	List<WebElement> jsElements = null;
	
	while (status.equals("FAIL") && timeLpas <GlobalVaribales.waitTime) {
		try {
			jsElements = (List<WebElement>) getElements(dataBaseKey);
			
			if (jsElements.size() == 0) {
				status = "FAIL";
			}else {
				status = "PASS";
			}
		} catch (Exception e) {
			status = "FAIL";
		}
		pause(2000);
		++timeLpas;
	}
		Report.printOperation("wait for Javascript element");
		Report.printStatus(status);
	return jsElements;
}


//wait for For JavaSccript Element

public WebElement waitForJSElement(String dataBaseKey) {
	
	int timeLpas = 0;
	String status = "FAIL";
	WebElement jsElement = null;
	
	while (status.equals("FAIL") && timeLpas <GlobalVaribales.waitTime) {
		try {
			jsElement = (WebElement) getElement(dataBaseKey);
			
			if (jsElement.size() == 0) {
				status = "FAIL";
			}else {
				status = "PASS";
			}
		} catch (Exception e) {
			status = "FAIL";
		}
		pause(2000);
		++timeLpas;
	}
		Report.printOperation("wait for Javascript element");
		Report.printStatus(status);
	return jsElement;
}

	
//fluent wait for For WebElement

public WebElement fluentWaitForWebElement(String key) {
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverManager.getDriver())
			.withTimeout(Duration.ofSeconds(90)).pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
	return wait.until(new Function<WebDriver, WebElement>() {
		
		public WebElement apply(WebDriver driver) {
			WebElement element = null;
			getElement(key);
			
			String valueType = getValueType(key, listOfElements);
			String value = getValue(key, listOfElements);
			
			if(element == null) {
				throw new NullPointerException();
			}else {
				return element;
			}
		}

	});
}



//fluent wait for For function

public WebElement fluentWaitForFunction(String key, Function<WebDriver, WebElement> function) {
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverManager.getDriver())
			.withTimeout(Duration.ofSeconds(90)).pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
	return wait.until(function); 
}


//fluent wait for For WebElements

public List<WebElement> fluentWaitForWebElements(String key) {
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(WebDriverManager.getDriver())
			.withTimeout(Duration.ofSeconds(90)).pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
	
	return wait.until(new Function<WebDriver, List<WebElement>>() {
		
		public List<WebElement> apply(WebDriver driver) {
			Element element = new Element(driver); // Element class need to create
			String valueType = getValueType(key, listOfElements);
			String value = getValue(key, listOfElements);
			return element.getElements(valueType, value);
		}

	});
}

//static wait 

public static void pause(long milliSec) {
	try {
		Thread.sleep(milliSec);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

// verify WebElement present/available in DOM


public final boolean  isPresentWebElement(String dataBaseKey) {
	
	boolean isPresent = false;
	String status = "FAIL";
	String valueType = "undefined";
	String value = "undefined";
	
	try {
		valueType = getValueType(dataBaseKey, listOfElements);
		value = getValue(dataBaseKey, listOfElements);		
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Element element = new Element(WebDriverManager.getDriver());
		element.getElement(valueType, value);
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(GlobalVaribales.waitTime,TimeUnit.SECONDS);
		isPresent = true;
		status = "PASS";
		takeScreenShotEveryAction();
	} catch (Exception e) {
		status = "PASS";
	} finally {
		Report.printOperation("is Present");
		Report.printKey(dataBaseKey);
		Report.printValue(value);
		Report.printValueType(valueType);
		Report.printStatus(status);
	}
	return isPresent;
}

//verify javascript WebElement present/available in DOM


public final boolean  isPresentJavaScriptWebElement(String dataBaseKey) {
	
	boolean isPresent = false;
	String status = "FAIL";
	String valueType = "undefined";
	String value = "undefined";
	
	try {
		valueType = getValueType(dataBaseKey, listOfElements);
		value = getValue(dataBaseKey, listOfElements);		
		JavascriptExecutor js= (JavascriptExecutor) WebDriverManager.getDriver();
		js.executeScript(value);
		isPresent = true;
		status = "PASS";
		takeScreenShotEveryAction();
	} catch (Exception e) {
		status = "PASS";
	} finally {
		Report.printOperation("is Present");
		Report.printKey(dataBaseKey);
		Report.printValue(value);
		Report.printValueType(valueType);
		Report.printStatus(status);
	}
	return isPresent;
}
	
//verify WebElement present/available in DOM for Dynamic Xpath


public final boolean  isPresentWebElementXpath(String locator, String value) {
	
	boolean isPresent = false;
	String status = "FAIL";
	
	try {
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Element element = new Element(WebDriverManager.getDriver());
		element.getElement(locator, value);
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(GlobalVaribales.waitTime,TimeUnit.SECONDS);

		isPresent = true;
		status = "PASS";
		takeScreenShotEveryAction();
	} catch (Exception e) {
		status = "PASS";
	} finally {
		Report.printOperation("is Present");
		Report.printValue(value);
		Report.printValueType(locator);
		Report.printStatus(status);
	}
	return isPresent;
}


//get WebElement by javascriptExecutor 

public final Object  getWebElementByJavascriptExecutor(String dataBaseKey) {
	
	Object object = null;
	String valueType = getValueType(dataBaseKey, listOfElements);
	String value = getValue(dataBaseKey, listOfElements);		;

	JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();
	String status = "FAIL";
	
	try {
		Thread.sleep(1000);
		object = js.executeScript(value);
		status = "PASS";
	} catch (Exception e) {
		status = "PASS";
	} finally {
		Report.printOperation("get element by JS");
		Report.printValue(value);
		Report.printValueType(valueType);
		Report.printStatus(status);
	}
	return object;
}


//get WebElement by using driver.findElement() 

public final Object  getWebElementByJavascriptExecutor(String dataBaseKey) {
	
	Object object = null;
	String valueType = getValueType(dataBaseKey, listOfElements);
	String value = getValue(dataBaseKey, listOfElements);		;

	JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();
	String status = "FAIL";
	
	try {
		Thread.sleep(1000);
		object = js.executeScript(value);
		status = "PASS";
	} catch (Exception e) {
		status = "PASS";
	} finally {
		Report.printOperation("get element by JS");
		Report.printValue(value);
		Report.printValueType(valueType);
		Report.printStatus(status);
	}
	return object;
}

	
}
