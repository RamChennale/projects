package com.qa.stdUtility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.stdBrowser.WebDriverManager;
import com.qa.stdReports.CalendarUtility;
import com.qa.stdReports.LoggerHelper;
import com.qa.stdUtility.ExceptionHandler;
public class CaptureScreenshot {
	
	static String format = "png";
	public static String imageFolderPath = null;
	
	private static Logger log = LoggerHelper.getLogger(CaptureScreenshot.class);
	
	private static int count = 0;
	
	
	//capture whole screenshot
	
	public static synchronized byte[] captureEntireScreenshot() {
		String dest = imageFolderPath + "/" + "image-" + counter() + "." + format;
		
		byte[] imageByterArr = null; 
		try {
			BufferedImage scourceImage = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			log.debug("screen captured and save to buffer");
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(scourceImage, "jpg", baos);
			baos.flush();
			imageByterArr = baos.toByteArray();
			baos.close();
			
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		}		
		return imageByterArr;
	}
	
	
	public static synchronized String captureEntireScreenshot(String fileName) {
		String dest = imageFolderPath + "/" + fileName + "-" + counter() + "." + format;
		
		try {
			BufferedImage scourceImage = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			log.debug("screen captured and save to buffer");
			
			File destImage = new File(dest);
			log.debug("Teamp screenshot file created");
			
			ImageIO.write(scourceImage, "jpg", destImage);
			log.debug("Buffered screen captured wrote in temp."+ format + " file");
			
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		}		
		return dest;
	}
	
	
	//capture browser screen shot(to use in cucumber only )
	
	public static synchronized byte[] screenCapture() {
		TakesScreenshot captureScreen = (TakesScreenshot) WebDriverManager.getDriver();
		byte[] screenShotAs = captureScreen.getScreenshotAs(OutputType.BYTES);
		log.debug("Browser screen captured ");
		return screenShotAs;
	}

	//capture browser screen shot(to use in TestNG only )
	
	public static synchronized String screenCapture(String fileName) {
		String dest = imageFolderPath + "\\" + fileName + "-" + counter() + "." + format;
		
		TakesScreenshot captureScreen = (TakesScreenshot) WebDriverManager.getDriver();

		File src = captureScreen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(dest));
		} catch (Exception e) {
			ExceptionHandler.handleException(e);
		}
		return dest;
	}
	
	 public static synchronized String  shutterEntireScreenCaspture() {
		String screenshotName = "screenshot"+ (++count);
		
		PropertyFileUtility propertyFileUtility = new PropertyFileUtility("./scr/test/resouces/extent.properties");
		String sparkDirPath = "./" + propertyFileUtility.getProperty("extent.reporter.apark.out");
		
		Shutterbug.shootPage(WebDriverManager.getDriver(),ScrollStrategy.BOTH_DIRECTIONS, true).withName(screenshotName).save(sparkDirPath);
		
		return screenshotName + ".png";
	}
	
	 public static synchronized String  shutterScreenCaspture() {
		String screenshotName = "screenshot"+ (++count);
		
		PropertyFileUtility propertyFileUtility = new PropertyFileUtility("./scr/test/resouces/extent.properties");
		String sparkDirPath = "./" + propertyFileUtility.getProperty("extent.reporter.apark.out");
		
		Shutterbug.shootPage(WebDriverManager.getDriver(), true).withName(screenshotName).save(sparkDirPath);
		
		return screenshotName + ".png";
	}
	 
	 public static synchronized String  desktopScreenCapture() {
		String screenshotName = "screenshot"+ (++count);
		
		PropertyFileUtility propertyFileUtility = new PropertyFileUtility("./scr/test/resouces/extent.properties");
		String sparkDirPath = "./" + propertyFileUtility.getProperty("extent.reporter.apark.out");
		
		String dest = sparkDirPath+ "/"+screenshotName;
		
		File src = DesktopDriverManager.getDriver().getScreenshotAs(OutputType.FILE);


		try {
			FileUtils.copyFile(src, new File(dest));
		} catch (IOException e) {
			log.info("exception occured while taking desktop screenshot");
			log.error(e);
			e.printStackTrace();
		}
		return screenshotName + ".png";
	}
	 
	 //capture browser screenshot in base 64 format
	 
	 public static synchronized String screenCapturBase64() {
		 TakesScreenshot takesScreenshot = (TakesScreenshot) WebDriverManager.getDriver();
		 
		 return takesScreenshot.getScreenshotAs(OutputType.BASE64);
		
	}
	
	private static String counter() {
		return CalendarUtility.getCalendarUtilityObject().getTimeStamp("ddmmyyyyHHss");
	}

}
