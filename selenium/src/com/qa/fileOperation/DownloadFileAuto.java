package com.qa.fileOperation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadFileAuto {

	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void downloadFileAuto() {
		//to generate unique number
		folder= new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		//chrome: 
		System.setProperty("webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		
		Map<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_setting.popups", 0); // to disable pop-up if displayed on click of download 
		prefs.put("download.default_directory", folder.getAbsolutePath()); //get file path to download 

		//passing file path to ChromeOptions object for downloading
		options.setExperimentalOption("prefs", prefs);
		
		//
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
	
		//driver= new ChromeDriver(cap); pass option/function to chrome
		driver= new ChromeDriver(options);
		
		/*Firefox
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("browser.download.dir", folder.getAbsolutePath());
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/jpeag, application/pdf, application/octet-stream");
		profile.setPreference("pdfjs.disabled", true);
		driver= new FirefoxDriver((Capabilities) profile);
*/	}
	
	@Test
	public void download() throws InterruptedException{
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[@href='download/avatar.jpg']//parent::div//following::a[@href='download/arquivotxt.txt']")).click();
		
		//
		Thread.sleep(4000);
		File listOffiles[]= folder.listFiles();
		for(File file: listOffiles) {
		//dowloaded file not empty
			Assert.assertTrue(file.length()>0);
		}
		
		//Directory is not empty
		Assert.assertTrue(listOffiles.length>0);//or
		if(listOffiles.length!=0)
			System.out.println("File downloaded");
		else
			System.out.println("No file downloaded");
	}
	
	@AfterMethod(enabled=true)
	public void tearDown() {
		driver.quit();
		for(File file: folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}
}
