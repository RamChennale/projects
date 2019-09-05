package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;
	@Parameters("myBrowser") 
	@BeforeMethod()
	public static void getBrowser(String myBrowser) { //@Optional("browserName")
		if (System.getProperty("os.name").contains("Window")) {
			if (myBrowser.equalsIgnoreCase("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (myBrowser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/driver/geckodriver.exe");
				driver= new FirefoxDriver();
			}else if (myBrowser.equalsIgnoreCase("opera")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+"/driver/opera.exe");
				driver = new OperaDriver();
			}else if (myBrowser.equalsIgnoreCase("ie")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/driver/IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}	
			
		}else if (System.getProperty("os.name").contains("mac")) {
		}else if (System.getProperty("os.name").contains("linux")) {
		}else if (System.getProperty("os.name").contains("ubuntu")) {
			
		}
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!= null) {
			driver.quit();
		}
	}
	
}
