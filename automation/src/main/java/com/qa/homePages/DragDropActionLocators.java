package com.qa.homePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DragDropActionLocators{

	@FindBy(xpath="//div[@id='draggable']")
	private WebElement from;
	@FindBy(xpath="//*[contains(text(),'Drop here')]")
	private WebElement to;
	
	
	
	public DragDropActionLocators(WebDriver driver) {
		PageFactory.initElements(driver, DragDropActionLocators.class);
	}
	
	public void dragDropTextBox(WebDriver driver) throws InterruptedException{
		Actions actions= new Actions(driver);
		actions.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
	}
}
