package com.qa.stdBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.qa.stdUtility.FileManager;

public class FirefoxBrowser implements BrowserInterface {

	private WebDriver driver;

	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub

		String userDir = System.getProperty("user.dir");
		System.getProperty("webdriver.gecko.driver", userDir + "srrc/test/rescource/geckodriver.exe");
		
		FirefoxProfile profile = new FirefoxProfile();

		// don't show anypop up while downloading any file
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/jpeg,application/pdf, application/octat-stream, application/zip");

		// default download folder
		profile.setPreference("browser.download.dir", FileManager.getFileManagerObject().dowloadFolderFilePath());
		profile.setPreference("pdfjs.disabled", "true");
		
		// handling certificate issue
		profile.setAcceptUntrustedCertificates(true);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);

		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;

	}

}
