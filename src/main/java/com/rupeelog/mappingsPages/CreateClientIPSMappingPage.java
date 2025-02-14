package com.rupeelog.mappingsPages;

import java.util.List;

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

public class CreateClientIPSMappingPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement adminMenu;

	@FindBy(linkText = "Mappings")
	@CacheLookup
	private WebElement mappingsSubMenu;

	@FindBy(linkText = "Client-IPS Mapping")
	@CacheLookup
	private WebElement ClientIPSMapping;
	
	By overlay=By.id("loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "fcpType")
	@CacheLookup
	private WebElement fcpTypeDD;
	
	@FindBy(id = "fcpId")
	@CacheLookup
	private WebElement fcpCodeAutoSugg;
	
	@FindBy(id = "riskId")
	@CacheLookup
	private WebElement riskTypeDD;
	
	@FindBy(id = "effectiveDate")
	@CacheLookup
	private WebElement effectiveDate;
	
	@FindBy(id = "norm1Min")
	@CacheLookup
	private WebElement norm1Min; 
	
	@FindBy(id = "norm1Max")
	@CacheLookup
	private WebElement norm1Max; 
	
	@FindBy(id = "norm2Min")
	@CacheLookup
	private WebElement norm2Min;
	
	@FindBy(id = "norm2Max")
	@CacheLookup
	private WebElement norm2Max;
	
	@FindBy(id = "norm3Min")
	@CacheLookup
	private WebElement norm3Min;
	
	@FindBy(id = "norm3Max")
	@CacheLookup
	private WebElement norm3Max;

	@FindBy(id = "norm4Min")
	@CacheLookup
	private WebElement norm4Min;
	
	@FindBy(id = "norm4Max")
	@CacheLookup
	private WebElement norm4Max;
	
	@FindBy(id = "norm5Min")
	@CacheLookup
	private WebElement norm5Min;
	
	@FindBy(id = "norm5Max")
	@CacheLookup
	private WebElement norm5Max;
	
	@FindBy(id = "norm6Min")
	@CacheLookup
	private WebElement norm6Min;
	
	@FindBy(id = "norm6Max")
	@CacheLookup
	private WebElement norm6Max;
	
	@FindBy(id = "norm7")
	@CacheLookup
	private WebElement norm7DD;
	
	@FindBy(id = "norm8")
	@CacheLookup
	private WebElement norm8DD;
	
	@FindBy(id = "norm9")
	@CacheLookup
	private WebElement norm9DD;
	
	@FindBy(id = "norm10")
	@CacheLookup
	private WebElement norm10DD;
	
	@FindBy(id = "norm11")
	@CacheLookup
	private WebElement norm11DD;
	
	@FindBy(id = "norm12")
	@CacheLookup
	private WebElement norm12DD;
	
	@FindBy(id = "norm13Min")
	@CacheLookup
	private WebElement norm13Min;
	
	@FindBy(id = "norm13Max")
	@CacheLookup
	private WebElement norm13Max;
	
	@FindBy(id = "norm14Min")
	@CacheLookup
	private WebElement norm14Min;
	
	@FindBy(id = "norm14Max")
	@CacheLookup
	private WebElement norm14Max;
	
	@FindBy(id = "norm15Min")
	@CacheLookup
	private WebElement norm15Min;
	
	@FindBy(id = "norm15Max")
	@CacheLookup
	private WebElement norm15Max;
	
	@FindBy(id = "norm16Min")
	@CacheLookup
	private WebElement norm16Min;
	
	@FindBy(id = "norm16Max")
	@CacheLookup
	private WebElement norm16Max;
	
	@FindBy(id = "norm17Min")
	@CacheLookup
	private WebElement norm17Min;
	
	@FindBy(id = "norm17Max")
	@CacheLookup
	private WebElement norm17Max;
	
	@FindBy(id = "norm18Min")
	@CacheLookup
	private WebElement norm18Min;
	
	@FindBy(id = "norm18Max")
	@CacheLookup
	private WebElement norm18Max;
	
	@FindBy(id = "norm19")
	@CacheLookup
	private WebElement norm19;
	
	@FindBy(id = "norm20")
	@CacheLookup
	private WebElement norm20;
	
	@FindBy(id = "norm21")
	@CacheLookup
	private WebElement norm21;
	
	@FindBy(id = "norm22")
	@CacheLookup
	private WebElement norm22;
	
	@FindBy(id = "norm23")
	@CacheLookup
	private WebElement norm23;
	
	@FindBy(id = "norm24")
	@CacheLookup
	private WebElement norm24;
	
	@FindBy(id = "norm25")
	@CacheLookup
	private WebElement norm25;
	
	@FindBy(id = "norm26")
	@CacheLookup
	private WebElement norm26;
	
	@FindBy(id = "norm27")
	@CacheLookup
	private WebElement norm27;
	
	@FindBy(id = "norm28")
	@CacheLookup
	private WebElement norm28;
	
	@FindBy(id = "norm29")
	@CacheLookup
	private WebElement norm29;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	
	public CreateClientIPSMappingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createClientIPSMappingPage() {

		file = new FileReaderUtility();
		actions = new Actions(driver);

		ElementWait.isElementVisible(adminMenu);
		actions.moveToElement(adminMenu).perform();

		ElementWait.isElementVisible(mappingsSubMenu);
		actions.moveToElement(mappingsSubMenu).perform();

		ElementWait.isElementVisible(ClientIPSMapping);
		actions.moveToElement(ClientIPSMapping).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(fcpTypeDD);
		Select selectfcpTypeDD = new Select(fcpTypeDD);
		selectfcpTypeDD.selectByVisibleText(file.getAdminTestData("fcpTypeDD"));
		
		ElementWait.isElementVisible(fcpCodeAutoSugg);
		fcpCodeAutoSugg.sendKeys(file.getAdminTestData("clientName"));
		fcpCodeAutoSugg.clear();
		fcpCodeAutoSugg.sendKeys(file.getAdminTestData("clientName"));
		
		List<WebElement> clientList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));

		for (int i = 0; i < clientList.size(); i++) {
			if (clientList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectClientName"))) {
				clientList.get(i).click();
				break;
			}
		}

		ElementWait.isElementVisible(riskTypeDD);
		Select selectriskTypeDD = new Select(riskTypeDD);
		selectriskTypeDD.selectByVisibleText(file.getAdminTestData("riskTypeDD"));

		ElementWait.isElementVisible(effectiveDate);
		effectiveDate.sendKeys(file.getAdminTestData("effectiveDate"));
		
		ElementWait.scrollToFindElement(driver, norm7DD);

		ElementWait.isElementVisible(norm1Min);
		norm1Min.sendKeys(file.getAdminTestData("min"));

		ElementWait.isElementVisible(norm1Max);
		norm1Max.sendKeys(file.getAdminTestData("max"));
		
		ElementWait.isElementVisible(norm2Min);
		norm2Min.sendKeys(file.getAdminTestData("min"));
		
		ElementWait.isElementVisible(norm2Max);
		norm2Max.sendKeys(file.getAdminTestData("max"));
		
		ElementWait.isElementVisible(norm3Min);
		norm3Min.sendKeys(file.getAdminTestData("min"));
		
		ElementWait.isElementVisible(norm3Max);
		norm3Max.sendKeys(file.getAdminTestData("max"));
		
		ElementWait.isElementVisible(norm4Min);
		norm4Min.sendKeys(file.getAdminTestData("min"));
		
		ElementWait.isElementVisible(norm4Max);
		norm4Max.sendKeys(file.getAdminTestData("max"));
		
		ElementWait.isElementVisible(norm5Min);
		norm5Min.sendKeys(file.getAdminTestData("min"));
		
		ElementWait.isElementVisible(norm5Max);
		norm5Max.sendKeys(file.getAdminTestData("max"));
		
		ElementWait.isElementVisible(norm6Min);
		norm6Min.sendKeys(file.getAdminTestData("min"));
		
		ElementWait.isElementVisible(norm6Max);
		norm6Max.sendKeys(file.getAdminTestData("max"));
		
		ElementWait.scrollToFindElement(driver, norm13Min);
		
		ElementWait.isElementVisible(norm7DD);
		Select selectnorm7DD = new Select(norm7DD);
		selectnorm7DD.selectByVisibleText(file.getAdminTestData("Restricted/NRestInvest"));

		ElementWait.isElementVisible(norm8DD);
		Select selectnorm8DD = new Select(norm8DD);
		selectnorm8DD.selectByVisibleText(file.getAdminTestData("Restricted/NRestInvest"));
		
		ElementWait.isElementVisible(norm9DD);
		Select selectnorm9DD = new Select(norm9DD);
		selectnorm9DD.selectByVisibleText(file.getAdminTestData("Restricted/NRestInvest"));
		
		ElementWait.isElementVisible(norm10DD);
		Select selectnorm10DD = new Select(norm10DD);
		selectnorm10DD.selectByVisibleText(file.getAdminTestData("Restricted/NRestInvest"));
		
		ElementWait.isElementVisible(norm11DD);
		Select selectnorm11DD = new Select(norm11DD);
		selectnorm11DD.selectByVisibleText(file.getAdminTestData("Restricted/NRestInvest"));
		
		ElementWait.isElementVisible(norm12DD);
		Select selectnorm12DD = new Select(norm12DD);
		selectnorm12DD.selectByVisibleText(file.getAdminTestData("Restricted/NRestInvest"));
		
		ElementWait.isElementVisible(norm13Min);
		norm13Min.sendKeys(file.getAdminTestData("EqMarketCapMin"));

		ElementWait.isElementVisible(norm13Max);
		norm13Max.sendKeys(file.getAdminTestData("EqMarketCapmax"));
		
		ElementWait.isElementVisible(norm14Min);
		norm14Min.sendKeys(file.getAdminTestData("EqMarketCapMin"));

		ElementWait.isElementVisible(norm14Max);
		norm14Max.sendKeys(file.getAdminTestData("EqMarketCapmax"));
		
		ElementWait.isElementVisible(norm15Min);
		norm15Min.sendKeys(file.getAdminTestData("EqMarketCapMin"));

		ElementWait.isElementVisible(norm15Max);
		norm15Max.sendKeys(file.getAdminTestData("EqMarketCapmax"));
		
		ElementWait.isElementVisible(norm16Min);
		norm16Min.sendKeys(file.getAdminTestData("EqMarketCapMin"));

		ElementWait.isElementVisible(norm16Max);
		norm16Max.sendKeys(file.getAdminTestData("EqMarketCapmax"));
		
		ElementWait.isElementVisible(norm17Min);
		norm17Min.sendKeys(file.getAdminTestData("EqMarketCapMin"));

		ElementWait.isElementVisible(norm17Max);
		norm17Max.sendKeys(file.getAdminTestData("EqMarketCapmax"));
		
		ElementWait.isElementVisible(norm18Min);
		norm18Min.sendKeys(file.getAdminTestData("EqMarketCapMin"));

		ElementWait.isElementVisible(norm18Max);
		norm18Max.sendKeys(file.getAdminTestData("EqMarketCapmax"));
	
		//Debt Prudential Norms	
		ElementWait.scrollToFindElement(driver, norm24);
		
		ElementWait.isElementVisible(norm19);
		norm19.sendKeys(file.getAdminTestData("DebtPrudentialNormsVal"));

		ElementWait.isElementVisible(norm20);
		norm20.sendKeys(file.getAdminTestData("DebtPrudentialNormsVal"));
		
		ElementWait.isElementVisible(norm21);
		norm21.sendKeys(file.getAdminTestData("DebtPrudentialNormsVal"));
		
		ElementWait.isElementVisible(norm22);
		norm22.sendKeys(file.getAdminTestData("DebtPrudentialNormsVal"));
		
		ElementWait.isElementVisible(norm23);
		norm23.sendKeys(file.getAdminTestData("DebtPrudentialNormsVal"));
		
		//Portfolio Level Enter Value
		ElementWait.scrollToFindElement(driver, saveBtn);
		
		ElementWait.isElementVisible(norm24);
		norm24.sendKeys(file.getAdminTestData("PortfolioLevelVal"));
		
		ElementWait.isElementVisible(norm25);
		norm25.sendKeys(file.getAdminTestData("PortfolioLevelVal"));
		
		ElementWait.isElementVisible(norm26);
		norm26.sendKeys(file.getAdminTestData("PortfolioLevelVal"));
		
		ElementWait.isElementVisible(norm27);
		norm27.sendKeys(file.getAdminTestData("PortfolioLevelVal"));
		
		ElementWait.isElementVisible(norm28);
		norm28.sendKeys(file.getAdminTestData("PortfolioLevelVal"));
		
		ElementWait.isElementVisible(norm29);
		norm29.sendKeys(file.getAdminTestData("PortfolioLevelVal"));
		
		ElementWait.isElementVisible(saveBtn);
		//saveBtn.click();
		
		try {
			alert=driver.switchTo().alert();
			System.out.println("Client IPS Mapping : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
