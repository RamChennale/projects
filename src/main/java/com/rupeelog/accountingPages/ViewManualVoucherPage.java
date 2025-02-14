package com.rupeelog.accountingPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class ViewManualVoucherPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Accounting")
	@CacheLookup
	private WebElement AccountingMenu;

	@FindBy(linkText = "Manual Voucher")
	@CacheLookup
	private WebElement ManualVoucher;

	@FindBy(xpath = "//input[@id='client']")
	@CacheLookup
	private WebElement accountingPortfolioRdoBtn;

	@FindBy(id = "clientIdStr")
	@CacheLookup
	private WebElement accountingPortfAutoSugg;

	@FindBy(id = "go")
	@CacheLookup
	private WebElement GoBtn;

	public ViewManualVoucherPage(WebDriver driver) {
		this.driver = driver;
	}

	public void viewManualVoucher() {
		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(AccountingMenu);
		actions.moveToElement(AccountingMenu).perform();

		ElementWait.isElementVisible(ManualVoucher);
		actions.moveToElement(ManualVoucher).click().build().perform();

		ElementWait.isElementVisible(accountingPortfolioRdoBtn);
		if(accountingPortfolioRdoBtn.isSelected())
			System.out.println("Rdo btn already selected.");
		else {
			accountingPortfolioRdoBtn.click();
		}
	
		ElementWait.isElementVisible(accountingPortfAutoSugg);
		accountingPortfAutoSugg.sendKeys(file.getAccountingTestData("mvAccountingPortfAutoSugg"));

		List<WebElement> clientPortfolioWebElementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (int i = 0; i < clientPortfolioWebElementList.size(); i++) {
			if (clientPortfolioWebElementList.get(i).getText()
					.equalsIgnoreCase(file.getAccountingTestData("mvSelectaccountingPortfAutoSugg"))) {
				clientPortfolioWebElementList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(GoBtn);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, GoBtn);
		
		Navigation navigation=	driver.navigate();
		navigation.refresh();
	}
}
