package com.rupeelog.adminOrgPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class ReportingOrgTreeViewPage {

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

	@FindBy(linkText = "Reporting Organization Tree")
	@CacheLookup
	private WebElement ReportingOrganizationTree;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "name")
	@CacheLookup
	private WebElement empNameAutoSugg;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement GoBtn;

	public ReportingOrgTreeViewPage(WebDriver driver) {
		this.driver = driver;
	}

	public void reportingOrgTreeView() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Admin);
		actions.moveToElement(Admin).perform();

		ElementWait.isElementVisible(Organization);
		actions.moveToElement(Organization).perform();

		ElementWait.isElementVisible(ReportingOrganizationTree);
		actions.moveToElement(ReportingOrganizationTree).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(empNameAutoSugg);
		empNameAutoSugg.sendKeys(file.getAdminTestData("Employee"));

		List<WebElement> empList = ElementWait
				.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-1']//li")));

		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectEmployee"))) {
				System.out.println(empList.get(i).getText());
				empList.get(i).click();
			}
			break;
		}

		ElementWait.isElementVisible(GoBtn);
		GoBtn.click();

	}
}
