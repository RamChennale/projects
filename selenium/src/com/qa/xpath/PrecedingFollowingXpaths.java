package com.qa.xpath;
import org.openqa.selenium.By;
/*Xpath searching using /parent:: ,//preceding, //preceding-sibling::, //following, //following-sibling::
clicking on it.*/
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class PrecedingFollowingXpaths extends DynamicBaseClass{

	@Test(enabled=false)
	public void precedingFollowingXpaths() {
		driver.findElement(By.xpath("//*[contains(text(),'friend')]//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'friend')]//following-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'user_name']/parent::td//pareceding-sibling::td//input[@name='contact_id']")).click();

	}
}



