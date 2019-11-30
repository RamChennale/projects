package com.java.seleniumFeature;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClassInSelenium1 extends BaseClass{

	WebDriver driver;
	Properties properties;
	FileInputStream fileInputStream;
	Actions actions;
	Alert alert;

	@Test(enabled=false)
	public void dragAndDrop() throws InterruptedException{
		actions= new Actions(driver);
		//actions.click(); Clicks at the current mouse location.
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.cssSelector("#droppable"));
		Thread.sleep(3000);
		actions.dragAndDrop(from,to).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
	@Test(enabled=false)
	public void doubleClick() throws InterruptedException {
		actions= new Actions(driver);
		WebElement doubleClick = driver.findElement(By.cssSelector(".btn.btn-default"));
		actions.doubleClick(doubleClick).build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.close();
	}

	@Test(enabled=false)
	public void rightClickDoulbleClickAlert() throws InterruptedException{
		actions = new Actions(driver);
		WebElement tagname = driver.findElement(By.tagName("button"));
		WebElement rightClick = driver.findElement(By.xpath(".//*[text()='right click me']"));
		Thread.sleep(2000);
		actions.contextClick(rightClick).build().perform();
		System.out.println();
		Thread.sleep(2000);
		actions.doubleClick(tagname).build().perform();
		alert = driver.switchTo().alert();
		String expectedAlertText = "You double clicked me.. Thank You..";
		String actualAlertText = alert.getText();
		alert.accept();
		Assert.assertEquals(actualAlertText, expectedAlertText, "TEST CASE SUCCEED");
		driver.close();
	}
}

/*	public void base() throws IOException, InterruptedException, FileNotFoundException {
System.setProperty("webdriver.chrome.driver", ".\\browser\\chromeDriver.exe");
driver = new ChromeDriver();
Thread.sleep(5000);
try {
	properties = new Properties();
	fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/resource/config.properties");
	properties.load(fileInputStream);
	String guru99url = properties.getProperty("guru99");
	String testingurl= properties.getProperty("testingurl");
	System.out.println(guru99url);
	System.out.println(testingurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.navigate().to(guru99url);
	driver.get(testingurl);
	Thread.sleep(2000);
} catch (FileNotFoundException fileNotFoundException) {
	System.out.println("Faile to find file :" + fileNotFoundException);
} catch (IOException ioException) {
	System.out.println("faile to open a file :" + ioException);
}

}*/
