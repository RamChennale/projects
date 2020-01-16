package com.qa.BDDcucumber;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDTestCaseStepDefination {

	WebDriver driver;

	@Given("^open chrome and start appl$")
	public void open_chrome_and_start_appl() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^I click on link$")
	public void I_click_on_link() throws Throwable {
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("chennale");
		driver.findElement(By.cssSelector("#EnrollmentDate")).sendKeys("01/01/2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	}

	@Then("^The clicked link should be open$")
	public void The_clicked_link_should_be_open() throws Throwable {
		System.out.println("All links are clickable");
		driver.close();
	}

	@Given("^open chrome browser and launch application$")
	public void open_chrome_browser_and_launch_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://uitestpractice.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^click on all links over homepage$")
	public void click_on_all_links_over_homepage() throws Throwable {
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.partialLinkText("AjaxCa")).click();
		driver.findElement(By.cssSelector(
				"div.navbar.navbar-inverse.navbar-fixed-top:nth-child(1) div.container div.navbar-collapse.collapse ul.nav.navbar-nav li:nth-child(3) > a:nth-child(1)"))
				.click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Controls')]")).click();
	}

	@Then("^all clicks verified$")
	public void all_clicks_verified() throws Throwable {
		System.out.println("All links are clickable");
		driver.close();
	}
	
	@When("^enter field data$")
	public void enter_field_data() throws Throwable {
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("chennale");
		driver.findElement(By.cssSelector("#EnrollmentDate")).sendKeys("01/01/2020");
	}

	@Then("^rest/clear all data fields data$")
	public void rest_clear_all_data_fields_data() throws Throwable {
		driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
		driver.findElement(By.xpath("//input[@id='LastName']")).clear();
		driver.findElement(By.cssSelector("#EnrollmentDate")).clear();
		driver.close();
	}
}
