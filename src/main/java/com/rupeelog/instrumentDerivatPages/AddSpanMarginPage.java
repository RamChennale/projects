package com.rupeelog.instrumentDerivatPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class AddSpanMarginPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument Derivatives")
	@CacheLookup
	private WebElement InstrumentDerivatives;
	
	@FindBy(linkText = ".Span Margin")
	@CacheLookup 
	private WebElement SpanMargin;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "exchange")
	@CacheLookup
	private WebElement smBseNseDD;
	
	@FindBy(id = "marginDate")
	@CacheLookup
	private WebElement spMarginDate;
	
	@FindBy(id = "uploadFile")
	@CacheLookup
	private WebElement smUploadFileBrowse;
	
	@FindBy(id = "upload")
	@CacheLookup
	private WebElement uploadBtn;
	
	@FindBy(id = "status")
	@CacheLookup
	private WebElement smUploadResult;
	
 	public AddSpanMarginPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void addSpanMargin() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentDerivatives);
 		actions.moveToElement(InstrumentDerivatives).perform();
 		
 		ElementWait.isElementVisible(SpanMargin);
 		actions.moveToElement(SpanMargin).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(smBseNseDD);
 		Select selectsmBseNseDD= new Select(smBseNseDD);
 		selectsmBseNseDD.selectByVisibleText(file.getInstrumentTestData("smBseNseDD"));
 		
 		ElementWait.isElementVisible(spMarginDate);
 		spMarginDate.sendKeys(file.getInstrumentTestData("spMarginDate"));
 		
 		ElementWait.isElementVisible(smUploadFileBrowse);
 		smUploadFileBrowse.sendKeys(file.getInstrumentTestData("smUploadFileBrowse"));
 		
 		ElementWait.isElementVisible(uploadBtn);
 		uploadBtn.click();
 		
 		ElementWait.isElementVisible(smUploadResult);
 		String actual=smUploadResult.getText();
 		
 		String expected=file.getInstrumentTestData("SpanMarginResult");
 		System.out.println("actual result : "+actual);
 		System.out.println("expected result :"+expected);
 		
 		Assert.assertTrue(actual.contains(expected), "Falied to add span margin.");
 	}
}
