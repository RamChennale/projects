package crossBrowserAndMultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyTitle(@Optional("browserName") String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\browser\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\browser\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", ".\\browser\\operadriver.exe");
			driver = new OperaDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", ".\\browser\\safari.exe");
			driver = new SafariDriver();
		}
		driver.get("http://epsserver.test.com/hes.admin/login.htm");
		String actualTilte = driver.getTitle();
		System.out.println("THE Page title is :  " + actualTilte);
		String expectedTitle = "Eyrie";
		Assert.assertEquals(actualTilte, expectedTitle, "Assertion failed to match the Title");
		driver.close();
	}

}
