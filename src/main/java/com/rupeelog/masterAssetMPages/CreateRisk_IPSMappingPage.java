package com.rupeelog.masterAssetMPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateRisk_IPSMappingPage {
	
	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Asset Master")
	@CacheLookup
	private WebElement Asset_Master;
	
	@FindBy(xpath = "//a[contains(text(),'Risk-IPS Mapping')]")
	@CacheLookup
	private WebElement Risk_IPS_Mapping;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#riskId")
	@CacheLookup
	private WebElement riskTypeDD;
	
	@FindBy(css = "#effectiveDate")
	@CacheLookup
	private WebElement effectiveDate;
	
	@FindBy(css = "#norm1Min")
	@CacheLookup
	private WebElement norm1Min;
	
	@FindBy(css = "#norm1Max")
	@CacheLookup
	private WebElement norm1Max;
	
	@FindBy(css = "#norm2Min")
	@CacheLookup
	private WebElement norm2Min;
	
	@FindBy(css = "#norm2Max")
	@CacheLookup
	private WebElement norm2Max;
	
	@FindBy(css = "#norm3Min")
	@CacheLookup
	private WebElement norm3Min;
	
	@FindBy(css = "#norm3Max")
	@CacheLookup
	private WebElement norm3Max;
	
	@FindBy(css = "#norm4Min")
	@CacheLookup
	private WebElement norm4Min;
	
	@FindBy(css = "#norm4Max")
	@CacheLookup
	private WebElement norm4Max;
	
	@FindBy(css = "#norm5Min")
	@CacheLookup
	private WebElement norm5Min;
	
	@FindBy(css = "#norm5Max")
	@CacheLookup
	private WebElement norm5Max;
	
	@FindBy(css = "#norm6Min")
	@CacheLookup
	private WebElement norm6Min;
	
	@FindBy(css = "#norm6Max")
	@CacheLookup
	private WebElement norm6Max;
	
	@FindBy(css = "#Norm7")
	@CacheLookup
	private WebElement Norm7DD;
	
	@FindBy(css = "#Norm8")
	@CacheLookup
	private WebElement Norm8DD;
	
	@FindBy(css = "#Norm9")
	@CacheLookup
	private WebElement Norm9DD;
	
	@FindBy(css = "#Norm10")
	@CacheLookup
	private WebElement Norm10DD;
	
	@FindBy(css = "#Norm11")
	@CacheLookup
	private WebElement Norm11DD;
	
	@FindBy(css = "#Norm12")
	@CacheLookup
	private WebElement Norm12DD;
	
	@FindBy(css = "#norm13Min")
	@CacheLookup
	private WebElement norm13Min;
	
	@FindBy(css = "#norm13Max")
	@CacheLookup
	private WebElement norm13Max;
	
	@FindBy(css = "#norm14Min")
	@CacheLookup
	private WebElement norm14Min;
	
	@FindBy(css = "#norm14Max")
	@CacheLookup
	private WebElement norm14Max;
	
	@FindBy(css = "#norm15Min")
	@CacheLookup
	private WebElement norm15Min;
	
	@FindBy(css = "#norm15Max")
	@CacheLookup
	private WebElement norm15Max;
	
	@FindBy(css = "#norm16Min")
	@CacheLookup
	private WebElement norm16Min;
	
	@FindBy(css = "#norm16Max")
	@CacheLookup
	private WebElement norm16Max;
	
	@FindBy(css = "#norm17Min")
	@CacheLookup
	private WebElement norm17Min;
	
	@FindBy(css = "#norm17Max")
	@CacheLookup
	private WebElement norm17Max;
	
	@FindBy(css = "#norm18Min")
	@CacheLookup
	private WebElement norm18Min;
	
	@FindBy(css = "#norm18Max")
	@CacheLookup
	private WebElement norm18Max;
	
	@FindBy(css = "#Norm19")
	@CacheLookup
	private WebElement Norm19;
	
	@FindBy(css = "#Norm20")
	@CacheLookup
	private WebElement Norm20;
	
	@FindBy(css = "#Norm21")
	@CacheLookup
	private WebElement Norm21;
	
	@FindBy(css = "#Norm22")
	@CacheLookup
	private WebElement Norm22;
	
	@FindBy(css = "#Norm23")
	@CacheLookup
	private WebElement Norm23;
	
	@FindBy(css = "#Norm24")
	@CacheLookup
	private WebElement Norm24;
	
	@FindBy(css = "#Norm25")
	@CacheLookup
	private WebElement Norm25;
	
	@FindBy(css = "#Norm26")
	@CacheLookup
	private WebElement Norm26;
	
	@FindBy(css = "#Norm27")
	@CacheLookup
	private WebElement Norm27;
	
	@FindBy(css = "#Norm28")
	@CacheLookup
	private WebElement Norm28;
	
	@FindBy(css = "#Norm29")
	@CacheLookup
	private WebElement Norm29;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;
		
	public CreateRisk_IPSMappingPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void createRisk_IPSMapping() {
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(Asset_Master);
		actions.moveToElement(Asset_Master).perform();
		
		ElementWait.isElementVisible(Risk_IPS_Mapping);
		actions.moveToElement(Risk_IPS_Mapping).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(riskTypeDD);
		Select selectriskTypeDD= new Select(riskTypeDD);
		selectriskTypeDD.selectByVisibleText(file.getMasterData("riskTypeDD"));
		
		ElementWait.isElementVisible(effectiveDate);
		effectiveDate.sendKeys(file.getMasterData("effectiveDate"));
		
		ElementWait.isElementVisible(norm1Min);
		norm1Min.sendKeys((file.getMasterData("norm1Min")));
		
		ElementWait.isElementVisible(norm1Max);
		norm1Max.sendKeys((file.getMasterData("norm1Max")));
		
		ElementWait.isElementVisible(norm2Min);
		norm2Min.sendKeys((file.getMasterData("norm2Min")));
		
		ElementWait.isElementVisible(norm2Max);
		norm2Max.sendKeys((file.getMasterData("norm2Max")));
		
		ElementWait.isElementVisible(norm3Min);
		norm3Min.sendKeys((file.getMasterData("norm3Min")));
		
		ElementWait.isElementVisible(norm3Max);
		norm3Max.sendKeys((file.getMasterData("norm3Max")));
		
		ElementWait.isElementVisible(norm4Min);
		norm4Min.sendKeys((file.getMasterData("norm4Min")));
		
		ElementWait.isElementVisible(norm4Max);
		norm4Max.sendKeys((file.getMasterData("norm4Max")));
		
		ElementWait.isElementVisible(norm5Min);
		norm5Min.sendKeys((file.getMasterData("norm5Min")));
		
		ElementWait.isElementVisible(norm5Max);
		norm5Max.sendKeys((file.getMasterData("norm5Max")));
		
		ElementWait.isElementVisible(norm6Min);
		norm6Min.sendKeys((file.getMasterData("norm6Min")));
		
		ElementWait.isElementVisible(norm6Max);
		norm6Max.sendKeys((file.getMasterData("norm6Max")));
		
		ElementWait.isElementVisible(Norm7DD);
		Select selectNorm7DD= new Select(Norm7DD);
		selectNorm7DD.selectByVisibleText(file.getMasterData("Norm7DD"));
		
		ElementWait.isElementVisible(Norm8DD);
		Select selectNorm8DD= new Select(Norm8DD);
		selectNorm8DD.selectByVisibleText(file.getMasterData("Norm8DD"));
		
		ElementWait.isElementVisible(Norm9DD);
		Select selectNorm9DD= new Select(Norm9DD);
		selectNorm9DD.selectByVisibleText(file.getMasterData("Norm9DD"));
		
		ElementWait.isElementVisible(Norm10DD);
		Select selectNorm10DD= new Select(Norm10DD);
		selectNorm10DD.selectByVisibleText(file.getMasterData("Norm10DD"));
		
		ElementWait.isElementVisible(Norm11DD);
		Select selectNorm11DD= new Select(Norm11DD);
		selectNorm11DD.selectByVisibleText(file.getMasterData("Norm11DD"));
		
		ElementWait.isElementVisible(Norm12DD);
		Select selectNorm12DD= new Select(Norm12DD);
		selectNorm12DD.selectByVisibleText(file.getMasterData("Norm12DD"));
		
		ElementWait.isElementVisible(norm13Min);
		norm13Min.sendKeys(file.getMasterData("norm13Min"));
		
		ElementWait.isElementVisible(norm13Max);
		norm13Max.sendKeys(file.getMasterData("norm13Max"));
		
		ElementWait.isElementVisible(norm14Min);
		norm14Min.sendKeys(file.getMasterData("norm14Min"));
		
		ElementWait.isElementVisible(norm14Max);
		norm14Max.sendKeys(file.getMasterData("norm14Max"));
		
		ElementWait.isElementVisible(norm15Min);
		norm15Min.sendKeys(file.getMasterData("norm15Min"));
		
		ElementWait.isElementVisible(norm15Max);
		norm15Max.sendKeys(file.getMasterData("norm15Max"));
		
		ElementWait.isElementVisible(norm16Min);
		norm16Min.sendKeys(file.getMasterData("norm16Min"));
		
		ElementWait.isElementVisible(norm16Max);
		norm16Max.sendKeys(file.getMasterData("norm16Max"));
		
		ElementWait.isElementVisible(norm17Min);
		norm17Min.sendKeys(file.getMasterData("norm17Min"));
		
		ElementWait.isElementVisible(norm17Max);
		norm17Max.sendKeys(file.getMasterData("norm17Max"));
		
		ElementWait.isElementVisible(norm18Min);
		norm18Min.sendKeys(file.getMasterData("norm18Min"));
		
		ElementWait.isElementVisible(norm18Max);
		norm18Max.sendKeys(file.getMasterData("norm18Max"));
		
		ElementWait.isElementVisible(Norm19);
		Norm19.sendKeys(file.getMasterData("Norm19"));
		
		ElementWait.isElementVisible(Norm20);
		Norm20.sendKeys(file.getMasterData("Norm20"));
		
		ElementWait.isElementVisible(Norm21);
		Norm21.sendKeys(file.getMasterData("Norm21"));
		
		ElementWait.isElementVisible(Norm22);
		Norm22.sendKeys(file.getMasterData("Norm22"));
		
		ElementWait.isElementVisible(Norm23);
		Norm23.sendKeys(file.getMasterData("Norm23"));
		
		ElementWait.isElementVisible(Norm24);
		Norm24.sendKeys(file.getMasterData("Norm24"));
		
		ElementWait.isElementVisible(Norm25);
		Norm25.sendKeys(file.getMasterData("Norm25"));
		
		ElementWait.isElementVisible(Norm26);
		Norm26.sendKeys(file.getMasterData("Norm26"));
		
		ElementWait.isElementVisible(Norm27);
		Norm27.sendKeys(file.getMasterData("Norm27"));
		
		ElementWait.isElementVisible(Norm28);
		Norm28.sendKeys(file.getMasterData("Norm28"));
		
		ElementWait.isElementVisible(Norm29);
		Norm29.sendKeys(file.getMasterData("Norm29"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Risk IPS Mapping : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
