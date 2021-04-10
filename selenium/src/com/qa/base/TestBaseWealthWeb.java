package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.rupeelog.utilty.WaitToLoadElement;

import io.github.bonigarcia.wdm.OperatingSystem;// need to add
import io.github.bonigarcia.wdm.WebDriverManager;// need to add

public class TestBaseWealthWeb {

	public static WebDriver driver;
	public static Properties properties;
	public static String url;
	public static FileInputStream fis;
	
	public static ExtentHtmlReporter extentHtmlReporter;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

	//=========LINUX Server==========
	
	@BeforeSuite(enabled = false)
	public void init() throws InterruptedException, IOException, FileNotFoundException{
		
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("/bin/google-chrome");
		chromeOptions.setHeadless(true);
		driver = new ChromeDriver(chromeOptions);
		
		//WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
		//driver= new FirefoxDriver();
		properties= new Properties();
			try {
				fis  = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/rupeelong/config/config.properties");
				properties.load(fis);
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			url = properties.getProperty("mtuaturl");
			String username=properties.getProperty("mtuatusername");
			String password=properties.getProperty("mtuatpassword");
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// 1st login
			WebElement userElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("loginid")));
			WebElement passwordElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("password")));	
			WebElement login=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
			userElement.sendKeys(username);
			passwordElement.sendKeys(password);
			login.click();
			//Thread.sleep(2000);
			// 1st select
			try {
				Thread.sleep(2000);
			WebElement role1=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
			Select selectRole= new Select(role1);
			selectRole.selectByVisibleText("Tenant Admin");
			WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
			proceedButton.click();
			}catch (StaleElementReferenceException se) {
				se.printStackTrace();
				Thread.sleep(2000);
				WebElement role1=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
				Select selectRole= new Select(role1);
				selectRole.selectByVisibleText("Tenant Admin");
				WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
				proceedButton.click();
			}
			
			
			//Thread.sleep(2000);
			
			// 2nd login
			WebElement user2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("username")));
			WebElement password2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("password")));	
			WebElement login2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@name='submit']")));
			user2.sendKeys(username);
			password2.sendKeys(password);
			login2.click();
			//Thread.sleep(2000);
			// 2nd select
			try {
				Thread.sleep(2000);
			WebElement role2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
			Select selectRole2= new Select(role2);
			selectRole2.selectByVisibleText("Tenant Admin");
			WebElement select2 =WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
			select2.click();
			//Thread.sleep(2000);
		}catch (StaleElementReferenceException e) {
			e.printStackTrace();
			Thread.sleep(2000);
			WebElement role2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
			Select selectRole2= new Select(role2);
			selectRole2.selectByVisibleText("Tenant Admin");
			WebElement select2 =WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
			select2.click();
		}
		
		
		}

	
	//===================
	
	
	@BeforeSuite(enabled = true)
	public void initDynamicTestEnvExe() throws InterruptedException, IOException, FileNotFoundException{
		
		 //System.setProperty("webdriver.chrome.driver", "./browser/chromedriver.exe");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter envirnment where you want run test cases ?");
		String envinment=scanner.next();

		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
		//driver= new FirefoxDriver();
		properties= new Properties();
		
		//MT UAT
		if(envinment.equalsIgnoreCase("MT")) {
			try {
				fis  = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/rupeelong/config/config.properties");
				properties.load(fis);
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		
		url = properties.getProperty("mtuaturl");
		String username=properties.getProperty("mtuatusername");
		String password=properties.getProperty("mtuatpassword");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1st login
		WebElement userElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("loginid")));
		WebElement passwordElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("password")));	
		WebElement login=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		userElement.sendKeys(username);
		passwordElement.sendKeys(password);
		login.click();
		//Thread.sleep(2000);
		// 1st select
		try {
			Thread.sleep(2000);
		WebElement role1=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
		Select selectRole= new Select(role1);
		selectRole.selectByVisibleText("Tenant Admin");
		WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		proceedButton.click();
		}catch (StaleElementReferenceException se) {
			se.printStackTrace();
			Thread.sleep(2000);
			WebElement role1=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
			Select selectRole= new Select(role1);
			selectRole.selectByVisibleText("Tenant Admin");
			WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
			proceedButton.click();
		}
		
		
		//Thread.sleep(2000);
		
		// 2nd login
		WebElement user2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("username")));
		WebElement password2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("password")));	
		WebElement login2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@name='submit']")));
		user2.sendKeys(username);
		password2.sendKeys(password);
		login2.click();
		//Thread.sleep(2000);
		// 2nd select
		try {
			Thread.sleep(2000);
		WebElement role2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
		Select selectRole2= new Select(role2);
		selectRole2.selectByVisibleText("Tenant Admin");
		WebElement select2 =WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		select2.click();
		//Thread.sleep(2000);
	}catch (StaleElementReferenceException e) {
		e.printStackTrace();
		Thread.sleep(2000);
		WebElement role2=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
		Select selectRole2= new Select(role2);
		selectRole2.selectByVisibleText("Tenant Admin");
		WebElement select2 =WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		select2.click();
	
	}
		// 52
		}else if (envinment.equalsIgnoreCase("52")) {
			try {
				fis  = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/rupeelong/config/config.properties");
				properties.load(fis);
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		
		url = properties.getProperty("52url");
		String username=properties.getProperty("52username");
		String password=properties.getProperty("52password");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1st login
		WebElement userElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@id='username']")));
		WebElement passwordElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@id='password']")));	
		WebElement login=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[2]/div[1]/form[1]/section[5]/input[4]")));
		userElement.sendKeys(username);
		passwordElement.sendKeys(password);
		login.click();
		try {
			Thread.sleep(2000);
		WebElement role52=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
		Select selectRole52= new Select(role52);
		selectRole52.selectByVisibleText(properties.getProperty("52role"));
		WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		proceedButton.click();
		}catch (StaleElementReferenceException se) {
			se.printStackTrace();
			Thread.sleep(2000);
			WebElement role1=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
			Select selectRole= new Select(role1);
			selectRole.selectByVisibleText(properties.getProperty("52role"));
			WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[2]/div[1]/div[1]/form[1]/section[1]/div[3]/input[1]")));
			proceedButton.click();
		}
		}
		else if (envinment.equalsIgnoreCase("dc")) {
			try {
				fis  = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/rupeelong/config/config.properties");
				properties.load(fis);
			} catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		
		url = properties.getProperty("democaliberurl");
		String username=properties.getProperty("democaliberusername");
		String password=properties.getProperty("democaliberpassword");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1st login
		WebElement userElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("loginid")));
		WebElement passwordElement=WaitToLoadElement.waitToLoadElement(driver.findElement(By.id("password")));	
		WebElement login=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		userElement.sendKeys(username);
		passwordElement.sendKeys(password);
		login.click();
		try {
			Thread.sleep(2000);
		WebElement role52=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
		Select selectRole52= new Select(role52);
		selectRole52.selectByVisibleText(properties.getProperty("democaliberrole"));
		WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
		proceedButton.click();
		}catch (StaleElementReferenceException se) {
			se.printStackTrace();
			Thread.sleep(2000);
			WebElement role1=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//select[@id='roleId']")));
			Select selectRole= new Select(role1);
			selectRole.selectByVisibleText(properties.getProperty("democaliberrole"));
			WebElement proceedButton=WaitToLoadElement.waitToLoadElement(driver.findElement(By.xpath("//input[@class='btn-medium btn-primary']")));
			proceedButton.click();
		}
		}
	}
	
	
	@BeforeTest(enabled = true)
	public void reportSetUp() {
		extentHtmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/report.html");
		extentHtmlReporter.config().setReportName("Test Report");
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
		extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		extentReports= new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Test Type", "Regression Test");
	}
	
	@BeforeMethod(enabled = true)
	public void getTestCaseName(Method method) {
		String testName=method.getName();
		extentTest=extentReports.createTest(testName);
	}
	
	@AfterMethod(enabled = true)
	public void testCaseResult(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(Status.PASS,"Test case name is : "+result.getName()+" passed.");
		}else if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, "Test case name is : "+result.getName()+"failed");
			extentTest.log(Status.FAIL, "Test case name is : "+result.getThrowable()+"failed");
		}else if (result.getStatus()==ITestResult.SKIP) {
			extentTest.log(Status.SKIP, "Test case name is : "+result.getName()+"skipped");
		}
	}
	
	@AfterTest(enabled = true)
	public void generateReport() {
		extentReports.flush();
	}

	@AfterSuite(enabled = true)
	public void tearDown() {
		driver.quit();
	}
}
