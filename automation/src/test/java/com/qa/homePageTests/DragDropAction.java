package com.qa.homePageTests;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.homePages.DragDropActionLocators;

public class DragDropAction extends TestBase{

	
	@Test
	public void dragDropTC(){
		DragDropActionLocators dragDropActionLocator = new DragDropActionLocators(driver);
		try {
		dragDropActionLocator.dragDropTextBox(driver);
	}catch (InterruptedException ie) {
		ie.printStackTrace();
	}
	}
}
