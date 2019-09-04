package com.qa.loginPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LoginPage {

	private static Logger logger = Logger.getLogger(LoginPage.class);
	String fileName = ".\\data\\inputdata.xlsx";
	XSSFWorkbook workBook = null;
	XSSFSheet sheet = null;
	File excelFile = null;
	FileInputStream fileInputStream = null;
	WebDriver driver = null;
	WebDriverWait wait;

	@FindBy(id = "username")
	public WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login-submit")
	private WebElement login;
	@FindBy(id = "gisspan")
	public WebElement verifyGISVIEW;

	public LoginPage(WebDriver localDriver) {
		this.driver = localDriver;
	}

	public void loginAppl() {
		logger.info("User entered inside gemsLogin()");
		try {
			wait = new WebDriverWait(driver, 5);
			excelFile = new File(fileName);
			fileInputStream = new FileInputStream(excelFile);
			workBook = new XSSFWorkbook(fileInputStream);
			sheet = workBook.getSheetAt(0);
			String user = sheet.getRow(2).getCell(0).getStringCellValue();
			String pwd = sheet.getRow(2).getCell(1).getStringCellValue();
			username.sendKeys(user);
			boolean userState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")))
					.isDisplayed();
			logger.info("USER LOCATOR DISPLAYING SUCCESSFULLY : " + userState);
			password.sendKeys(pwd);
			boolean passState = wait.until(ExpectedConditions.visibilityOf(password)).isDisplayed();
			logger.info("PASSWORD LOCATOR DISPLAYING SUCCESSFULLY : " + passState);
			boolean siginState = wait.until(ExpectedConditions.visibilityOf(login)).isEnabled();
			login.submit();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			logger.info("SIGN IN LOCATOR IS ENABLED SUCCESSFULLY : " + siginState);
			String assertTest = verifyGISVIEW.getText();
			Assert.assertEquals("GIS View", assertTest, "TestCase verified " + assertTest);
			System.out.println("GEMS title is : " + assertTest);
			logger.info("User login successfully verified : " + assertTest);
		} catch (FileNotFoundException fnfe) {
			logger.info("File dose not exist to read data" + fnfe);
		} catch (IOException ioe) {
			logger.info("While reading file, problem occured", ioe);
		}
		logger.info("User exits gemsLogin()");
	}
	
	public void login(String user, String pwd) throws InterruptedException {
		Thread.sleep(3000);
		username.sendKeys(user);
		Thread.sleep(3000);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		login.click();
		Thread.sleep(3000);
	}
}
