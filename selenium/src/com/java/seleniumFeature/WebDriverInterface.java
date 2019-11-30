package com.java.seleniumFeature;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverInterface {

	static String url="http//www.google.com";
	
	@Test
	public void webDriverFunctionalaties() {
		WebDriver driver= new ChromeDriver();
		WebElement locator= driver.findElement(By.xpath("//input[@name='user_name']"));
		List<WebElement> list= driver.findElements(By.xpath("//*[text()='']"));
		driver.get("www.googgle.com");
		driver.navigate().to(url);
		String currentUrl=driver.getCurrentUrl();
		String currentPageTitle= driver.getTitle();
		driver.manage();
		driver.switchTo();
		String windowId=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		driver.close();
		driver.quit();
		
		WebDriver driver1= new WebDriver() {
			
			@Override
			public TargetLocator switchTo() {
				return null;
			}

			@Override
			public void quit() {
			}
			
			@Override
			public Navigation navigate() {
				return null;
			}
			
			@Override
			public Options manage() {
				return null;
			}
			
			@Override
			public Set<String> getWindowHandles() {
				return null;
			}
			
			@Override
			public String getWindowHandle() {
				return null;
			}
			
			@Override
			public String getTitle() {
				return null;
			}
			
			@Override
			public String getPageSource() {
				return null;
			}
			
			@Override
			public String getCurrentUrl() {
				return null;
			}
			
			@Override
			public void get(String arg0) {
			}
			
			@Override
			public List<WebElement> findElements(By arg0) {
				return null;
			}
			
			@Override
			public WebElement findElement(By arg0) {
				return null;
			}
			
			@Override
			public void close() {
			}
		};
	}
	
}























/*
 * Object is the parent class of all class these methods inherites to all
 * objects
 
File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(file, new File("d:\"+ System.currentTimeMillis() +".png"));"
Object object = new Object();
object.getClass();
object.equals("Object");
int hashcode = object.hashCode();
object.notify();
object.notifyAll();
String objectString = object.toString();
object.wait();
object.wait(300);
object.wait(300, 30);

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
//OR 
System.setProperty("webdriver.chrome.driver", ".//src//browser//chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.navigate().to("http://www.google.com");
WebElement element = driver.findElement(By.id("id"));
element.sendKeys("ram");
List<WebElement> elementList = driver.findElements(By.tagName("//a"));
String currentPageUrl = driver.getCurrentUrl();
String title = driver.getTitle();
driver.close();
driver.quit();

 WEBELEMENT FUNCTIONALITIES 
element.clear();
element.click();
String attribute = element.getAttribute(title);
String cssValue = element.getCssValue("arg0");
Point point1 = element.getLocation();
//File file = element.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("/d:" + System.currentTimeMillis() + ".png"));
Dimension dimension1 = element.getSize();
String tagName = element.getTagName();
String elementText = element.getText();
boolean isdisplayed = element.isDisplayed();
boolean isEnabled = element.isEnabled();
boolean isSelected = element.isSelected();
element.sendKeys("ram");
element.submit();
element.click();
Rectangle rectanle = element.getRect();

 WINDOW MANAGE FUNCTIONS 
driver.manage();
 TO DELETE ALL Cookies 
driver.manage().deleteAllCookies();
driver.manage().deleteCookieNamed("arg0");

 MANAGE WAIT TIME 
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
driver.manage().timeouts().setScriptTimeout(1000, TimeUnit.MILLISECONDS);

driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(22, TimeUnit.MILLISECONDS);
driver.manage().timeouts().setScriptTimeout(333, TimeUnit.MICROSECONDS);

 MANAGE WINDOW 
//driver.manage().window().fullscreen(); not working
Dimension dimension = driver.manage().window().getSize();
int dHeight = dimension.getHeight();
int dWidth = dimension.getWidth();
int w = dimension.width;
int h = dimension.height;

driver.manage().window().maximize();
//	driver.manage().window().fullscreen(); not working

//int x = point.getX();
//int y = point.getY();
//point.move(x, y);
//point.moveBy(dWidth, dHeight);

driver.manage().window().maximize();
//.manage().window().setPosition(point);
driver.manage().window().setSize(dimension);
driver.manage().window().setSize(new Dimension(300,500)); //valid http://www.software-testing-tutorials-automation.com/2015/02/how-to-setget-window-position-and-size.html
driver.manage().window().getSize().getHeight();
driver.manage().window().getSize().getWidth();

 NAVIGATIONS 
driver.navigate();
driver.navigate().to("https://www.google.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.navigate().to(url);

driver.navigate().to("");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

 WINDOW HANDLING 

String uniquewindId = driver.getWindowHandle();
driver.switchTo().window(uniquewindId);

String uid= driver.getWindowHandle();
driver.switchTo().window(uid);


Set<String> windList = driver.getWindowHandles();
ArrayList<String> arrayList = new ArrayList<String>();
Iterator<String> iterator = windList.iterator();
while (iterator.hasNext()) {
	arrayList.add(iterator.next());
}
driver.switchTo().window(arrayList.get(0));
driver.close();
driver.switchTo().window(arrayList.get(1));
driver.close();
driver.switchTo().window(arrayList.get(2)).close();

Set<String> wset=	driver.getWindowHandles();
ArrayList<String> al= new ArrayList<String>();
Iterator<String> iterator2=	wset.iterator();
while(iterator2.hasNext()) {
	al.add(iterator2.next());
}
driver.switchTo().window(al.get(0));
driver.switchTo().window(al.get(2)).switchTo().getClass();



 ALERT FUNCTIONS 
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
String alertText = driver.switchTo().alert().getText();
driver.switchTo().alert().sendKeys("passingValue_To_Alert");

Alert alert = driver.switchTo().alert();
String alertText1 = alert.getText();
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
//String alertText=	driver.switchTo().alert().getText();
driver.switchTo().alert().sendKeys("Ram");

 SWITCHING TO THE default-----PAGE 
driver.switchTo().defaultContent();
driver.switchTo().defaultContent();



 SWITCHING TO A WINDOW FRAME 
driver.switchTo().frame(1);
driver.switchTo().frame("string");
driver.switchTo().frame(driver.findElement(By.id("id")));
driver.switchTo().parentFrame();


driver.switchTo().frame(1);
driver.switchTo().frame("text");
driver.switchTo().frame(driver.findElement(By.id("")));
driver.switchTo().parentFrame();*/