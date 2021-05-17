package Pageobjects.frontend;

import java.util.List;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.BaseSetup;

public class homepage extends BaseSetup {

	public static Logger log=Logger.getLogger(homepage.class.getName());
	 public homepage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	@FindBy(xpath="//input[@placeholder='Search for Movies, Web Series, Studios, etc.']")
	public static WebElement HomePageSearch;
	
	@FindBy(xpath="//div[@class='ng-scroll-content']/ul/li/span")
	public static List<WebElement> AutoSuggestiveDropdown;
	
	@FindBy(xpath="//span[@class='cursor']")
	public static WebElement CookieClose;
	
	@FindBy(xpath="button is-default blue-stroke small mat-button mat-button-base")
	public static WebElement CookieGotItButton;
	
	
	
	public static void HomePageSearch(String shoseriesorstudioname) throws InterruptedException {
		homepage.CookieClose.click();
		homepage.HomePageSearch.sendKeys(shoseriesorstudioname);
		log.info("Sent Text in the Home Page is "+shoseriesorstudioname);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(AutoSuggestiveDropdown));
		for (int i = 0; i < AutoSuggestiveDropdown.size(); i++) {
			String str = AutoSuggestiveDropdown.get(i).getText();
			log.info("The Auto suggestive dropdown shows:"+str);
			if (str.equalsIgnoreCase(shoseriesorstudioname)) {
				AutoSuggestiveDropdown.get(i).click();
				break;
			}
		}
	}
}
