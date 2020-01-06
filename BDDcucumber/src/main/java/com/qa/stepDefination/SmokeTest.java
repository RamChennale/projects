package com.qa.stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;

	@Given("^open chrome and start appl$")
	public void open_chrome_and_start_appl() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://uitestpractice.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		System.out.println("Record created successfully.");
	}
}
