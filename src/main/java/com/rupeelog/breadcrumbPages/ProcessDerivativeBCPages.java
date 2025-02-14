package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessDerivativeBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(linkText = "Derivative")
	@CacheLookup
	private WebElement Derivative;
	
	@FindBy(xpath = "//a[contains(text(),'Derivative Error Txn - Exec')]")
	@CacheLookup
	private WebElement DerivativeErrorTxnExec;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessDerivativeBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void derivativeErrorTxnExec() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Derivative);
		actions.moveToElement(Derivative).perform();

		WebDriverWaitFunctions.waitToLoadElement(DerivativeErrorTxnExec);
		actions.moveToElement(DerivativeErrorTxnExec).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DerivativeErrorTxnExec = breadcrumb.getText();
		Assert.assertTrue(DerivativeErrorTxnExec.contains(file.getBreadcrumb("DerivativeErrorTxnExec")), "DerivativeErrorTxnExec  not exits in breadcrumb");
		System.out.println(DerivativeErrorTxnExec);
	}	
	
}
