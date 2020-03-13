package com.qa.businesslogic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	String emailFieldName = "email";
	String passwordFieldName = "password";
	String AllButtonPaths = "//button";
	
	/**
	 * This method describes the functionality to login to the Eagle Biz Web Application. 
	 * <br>The parameters should be valid in order to avoid unwanted exceptions.
	 * @param d (WebDriver Object)
	 * @param username (The Username of the Test Employee)
	 * @param password (The Password of the Test Employee)
	 * @return (Returns the URL of the page for validation)
	 */
	public String loginUser(WebDriver d, String username, String password){
		WebDriverWait wait = new WebDriverWait(d, 10);
		d.findElement(By.name(emailFieldName)).sendKeys(username);
		d.findElement(By.name(passwordFieldName)).sendKeys(password);
		List<WebElement> loginPageButtons = d.findElements(By.xpath(AllButtonPaths));
		loginPageButtons.get(0).click();
		Boolean dashboardUrl = wait.until(ExpectedConditions.urlContains("dashboard"));
		if(dashboardUrl){
			return d.getCurrentUrl();
		}
		else {
			return null;
		}
	}
}
