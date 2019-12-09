package com.qa.seleniumFunctionality;

import com.qa.base.TestBase;

public class RadioButtonFunctionality extends TestBase {

	public void radioButtonFunctionality() {
		boolean statu = webElement.isSelected();
		statu = webElement.isDisplayed();
		statu = webElement.isEnabled();
		if (statu) {
			System.out.println("Radio button already selected");
		} else {
			webElement.click();
		}
	}
}

/*
 * webElement.isSelected(): Determine whether or not this element is selected or
 * not. This operation only applies to input elements such as checkboxes,
 * options in a select and radio buttons.
 * 
 * Returns: True if the element is currently selected or checked, false
 * otherwise.
 */