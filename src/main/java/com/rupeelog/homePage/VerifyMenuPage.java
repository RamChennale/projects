package com.rupeelog.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;


public class VerifyMenuPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	@CacheLookup
	private WebElement home;
	
	@FindBy(xpath = "//*[text()='Master']")
	@CacheLookup
	private WebElement master;
	
	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement admin;
	
	@FindBy(xpath = "//*[text()='Instrument']")
	@CacheLookup
	private WebElement instrument;
	
	@FindBy(xpath = "//*[text()='Order']")
	@CacheLookup
	private WebElement order;
	
	@FindBy(xpath = "//*[text()='Reports']")
	@CacheLookup
	private WebElement reports;
	
	@FindBy(xpath = "//*[text()='RIMS']")
	@CacheLookup
	private WebElement rims;
	
	@FindBy(xpath = "//*[text()='Process']")
	@CacheLookup
	private WebElement process;
	
	@FindBy(xpath = "//*[text()='Accounting']")
	@CacheLookup
	private WebElement accounting;
	
	@FindBy(xpath = "//*[text()='Settlement']")
	@CacheLookup
	private WebElement settlement;
	
	@FindBy(xpath = "//*[text()='Disc PMS']")
	@CacheLookup
	private WebElement discPMS;
	
	@FindBy(xpath = "//*[text()='Held Away']")
	@CacheLookup
	private WebElement heldAway;
	
	@FindBy(xpath = "//*[text()='FP Admin']")
	@CacheLookup
	private WebElement fpAdmin;
	
	@FindBy(xpath = "//*[text()='Finanacial Planning']")
	@CacheLookup
	private WebElement finanacialPlanning;
	
	/*
	 * @FindBy(xpath = "//*[text()='Finplan Input']")
	 * 
	 * @CacheLookup private WebElement finplanInput;
	 */
	
	@FindBy(xpath = "//*[text()='Investment']")
	@CacheLookup
	private WebElement investment;
	
	@FindBy(xpath = "//*[text()='Operations']")
	@CacheLookup
	private WebElement operation;
	
	
	public VerifyMenuPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyAllMenu() {
		SoftAssert softAssert= new SoftAssert();
		Actions actions= new Actions(driver);
		softAssert.assertEquals(home.getText(), "Home", "Failed to display Home menu");
		actions.moveToElement(home).perform();
		
		softAssert.assertEquals(master.getText(), "Master", "Failed to display Master menu");
		actions.moveToElement(master).perform();
		
		softAssert.assertEquals(admin.getText(), "Admin", "Failed to display Admin menu");
		actions.moveToElement(admin).perform();
		
		softAssert.assertEquals(instrument.getText(), "Instrument", "Failed to display Instrument menu");
		actions.moveToElement(instrument).perform();
		
		softAssert.assertEquals(order.getText(), "Order", "Failed to display Order menu");
		actions.moveToElement(order).perform();
		
		softAssert.assertEquals(reports.getText(), "Reports", "Failed to display Reports menu");
		actions.moveToElement(reports).perform();
		
		softAssert.assertEquals(rims.getText(), "RIMS", "Failed to display RIMS menu");
		actions.moveToElement(rims).perform();
		
		softAssert.assertEquals(process.getText(),  "Process", "Failed to display Process menu");
		actions.moveToElement(process).perform();
		
		softAssert.assertEquals(accounting.getText(),  "Accounting", "Failed to display Accounting menu");
		actions.moveToElement(accounting).perform();
		
		softAssert.assertEquals(settlement.getText(),  "Settlement", "Failed to display Settlement menu");
		actions.moveToElement(settlement).perform();
		
		softAssert.assertEquals(discPMS.getText(),  "Disc PMS", "Failed to display Disc PMS menu");
		actions.moveToElement(discPMS).perform();
		
		softAssert.assertEquals(heldAway.getText(),  "Held Away", "Failed to display Held Away menu");
		actions.moveToElement(heldAway).perform();
		
		softAssert.assertEquals(fpAdmin.getText(),  "FP Admin", "Failed to display FP Admin menu");
		actions.moveToElement(fpAdmin).perform();
		
		softAssert.assertEquals(finanacialPlanning.getText(),  "Finanacial Planning", "Failed to display Finanacial Planning menu");
		actions.moveToElement(finanacialPlanning).perform();
		
		/*
		 * softAssert.assertEquals(finplanInput.getText(), "Finplan Input",
		 * "Failed to display Finplan Input menu");
		 * actions.moveToElement(finplanInput).perform();
		 */
		
		softAssert.assertEquals(investment.getText(),  "Investment", "Failed to display Investment menu");
		actions.moveToElement(investment).perform();
		
		softAssert.assertEquals(operation.getText(),  "Operations", "Failed to display Operations menu");
		actions.moveToElement(operation).perform();
		
		softAssert.assertAll();
		System.out.println("All menus are verified");
	}
}
