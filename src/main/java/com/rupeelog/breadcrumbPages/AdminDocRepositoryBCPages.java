package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminDocRepositoryBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Doc Repository')]")
	@CacheLookup
	private WebElement DocRepository;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public AdminDocRepositoryBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void docRepository() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(DocRepository);
		actions.moveToElement(DocRepository).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DocRepository = breadcrumb.getText();
		Assert.assertTrue(DocRepository.contains(file.getBreadcrumb("DocRepository")), "Doc Repository name not exits in breadcrumb");
		System.out.println(DocRepository);
	}

}
