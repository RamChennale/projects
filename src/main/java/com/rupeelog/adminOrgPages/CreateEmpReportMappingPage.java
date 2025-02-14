package com.rupeelog.adminOrgPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateEmpReportMappingPage {

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

	@FindBy(linkText = "Employee Reporting Mapping")
	@CacheLookup
	private WebElement EmployeeReportingMapping;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "employeeIdStr1")
	@CacheLookup
	private WebElement erEmpAutoSugg;

	@FindBy(id = "reportingEmpIdStr1")
	@CacheLookup
	private WebElement erReportingEmpAutoSugg;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement erstartDate;

	@FindBy(id = "savebtn")
	@CacheLookup
	private WebElement saveBtn;

	public CreateEmpReportMappingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createEmpReportMapping() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(Organization);
		actions.moveToElement(Organization).perform();

		ElementWait.isElementVisible(EmployeeReportingMapping);
		actions.moveToElement(EmployeeReportingMapping).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(erEmpAutoSugg);
		erEmpAutoSugg.sendKeys(file.getAdminTestData("erEmpAutoSugg"));
		
		List<WebElement> empList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-2']//li")));
		
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selecterEmpAutoSugg"))) {
				System.out.println(empList.get(i).getText());
				empList.get(i).click();
			}
			break;
		}
		
		ElementWait.isElementVisible(erReportingEmpAutoSugg);
		erReportingEmpAutoSugg.sendKeys(file.getAdminTestData("erReportingEmpAutoSugg"));
		
		List<WebElement> reEempList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-3']//li")));
		
		for(int i=0; i<reEempList.size(); i++) {
			if(reEempList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selecterReportingEmpAutoSugg"))) {
				System.out.println(empList.get(i).getText());
				reEempList.get(i).click();
			}
			break;
		}
		
		ElementWait.isElementVisible(erstartDate);
		erstartDate.sendKeys(file.getAdminTestData("erstartDate"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			alert = driver.switchTo().alert();
			System.out.println("Employee creation : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}

	}
}
