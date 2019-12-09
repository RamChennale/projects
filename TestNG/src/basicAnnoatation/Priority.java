package basicAnnoatation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {

	WebDriver driver;

	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\ChromeDriver.exe");
		driver = new ChromeDriver();
		System.out.println("==========Browser started ===============");
	}

	@Test(priority=1)
	public void verifyAppTitle() {
		driver.get("http://epsserver.test.com/hes.admin/login.htm");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String my_title = driver.getTitle();
		System.out.println("Actual title : " + my_title);
		String expected_Title = "Eyrie";
		System.out.println(" ");
		//Type 1
		Assert.assertTrue(my_title.contains(expected_Title));
		System.out.println("The app title verified which are my_title is = "+my_title+" expected Title is = "+expected_Title);
		System.out.println(" ");
		String expected_Title1 = "Eyri";
		//Type 2
		Assert.assertEquals(my_title, expected_Title1);
		System.out.println("Test completed");
	}

	@Test(priority=2)
	public void verifyErrorMessage() {
		driver.get("http://epsserver.test.com/hes.admin/login.htm");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("aestAdmin");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("login-submit")).click();
		String actualErrorMessage= driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]")).getText();
		System.out.println("Actual Error Message is : "+actualErrorMessage);
		String expected_message="Please enter a valid Username and Password.";
		Assert.assertEquals(actualErrorMessage, expected_message);
		System.out.println(" Error Message verified");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("==========Browser Closed ===============");
	}
}
