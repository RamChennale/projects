package com.qa.popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ModelPopUpChatPopUp extends DynamicBaseClass{

	@Test
	public void modelorChatPopUp() throws InterruptedException{
		//DynamicBaseClass.NavigateToUrl("https://www.comm100.com/platform/livechat/personalization/live-chat-window/");
		Thread.sleep(3000);
		WebElement frameElement= driver.findElement(By.id("chat_window_container"));
/*		frameElement=driver.findElement(By.xpath("//iframe[@id='chat_window_container']"));
		 driver.switchTo().frame(frameElement);
		 String name=""; 
*/			
		String id="chat_window_container";
		driver.switchTo().frame(id);
		
		Actions actions= new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@id='main']"))).build().perform();
	
		WebElement chatPopUpclose=driver.findElement(By.xpath("//*[@class='svg icon-close']"));
		chatPopUpclose.click();
		Thread.sleep(3000);
	}
}
