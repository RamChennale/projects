package test;

public class FindPrime {

	public void gmailLogin() {
		
		ebDriverManager.chromedriver.opertaingSystem(opertaingSystem.WIN);
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(10, driver);
		
		driver.get("http://gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf)
		
		WebElement userName=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginBtn=driver.findElement(By.id("login"));
		
		userName.sendKeys("ram");
		password.sendKeys("password");
		loginBtn.click();
	}
}
