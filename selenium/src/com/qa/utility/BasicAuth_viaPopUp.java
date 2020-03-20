package com.qa.utility;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class BasicAuth_viaPopUp extends DynamicBaseClass {

	@Test
	public void basicAuth() {
		// https://username:password@facebook.com
		DynamicBaseClass.NavigateToUrl("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String loggedMessage = driver
				.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"))
				.getText();
		System.out.println(loggedMessage);
	}
}
