package com.rupeelog.adminOrgPages;

import java.util.List;

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

public class CreateEmpLinkPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;

	@FindBy(linkText = "Organization")
	@CacheLookup
	private WebElement Organization;

	@FindBy(linkText = "Linked Employee")
	@CacheLookup
	private WebElement LinkedEmployee;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "firstName")
	@CacheLookup
	private WebElement leEmpAutoSugg;

	@FindBy(id = "middleName")
	@CacheLookup
	private WebElement leLinkedEmpAutoSugg;

	@FindBy(xpath = "//select[@id='role']")
	@CacheLookup
	private WebElement leRelationTypeDD;

	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement saveBtn;

	public CreateEmpLinkPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createEmpLink() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(Organization);
		actions.moveToElement(Organization).perform();

		ElementWait.isElementVisible(LinkedEmployee);
		actions.moveToElement(LinkedEmployee).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(leEmpAutoSugg);
		leEmpAutoSugg.sendKeys(file.getAdminTestData("leEmpAutoSugg"));
		
		List<WebElement> empList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-2']//li")));
		
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectleEmpAutoSugg"))) {
				System.out.println(empList.get(i).getText());
				empList.get(i).click();
			}
			break;
		}
		
		ElementWait.isElementVisible(leLinkedEmpAutoSugg);
		leLinkedEmpAutoSugg.sendKeys(file.getAdminTestData("leLinkedEmpAutoSugg"));
		
		List<WebElement> reEempList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-1']//li")));
		
		for(int i=0; i<reEempList.size(); i++) {
			if(reEempList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectleLinkedEmpAutoSugg"))) {
				System.out.println(empList.get(i).getText());
				reEempList.get(i).click();
			}
			break;
		}
		
		ElementWait.isElementVisible(leRelationTypeDD);
		Select selectleRelationTypeDD= new Select(leRelationTypeDD);
		selectleRelationTypeDD.selectByVisibleText(file.getAdminTestData("leRelationTypeDD"));		

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		WebElement linkEmpResult=ElementWait.isElementVisible(driver.findElement(By.id("msg")));
		String linkedResult=linkEmpResult.getText();
		System.out.println("Employee linked Result : "+linkedResult);
		Assert.assertEquals(linkedResult, "SAVED SUCCESSFULLY", "Employee failed to link");

	}
}
