package Pageobjects.frontend;

import java.util.List;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	 
	@FindBy(xpath="//div[@class='home-banner-slider']")
	public static WebElement HomePageBanners;
	
	@FindBy(xpath="//div[@class='home-banner-pagination swiper-pagination-clickable swiper-pagination-bullets']/span")
	public static List<WebElement> HomePageBannerSliderButtons;
	
	@FindBy(xpath="//h3[@class='ng-star-inserted']")
	public static List<WebElement> ShoNamesOnBannerText;
	 
	@FindBy(xpath="//div[@class='gs-coins-btn']/button")
	public static WebElement CoinsButton;
	
	@FindBy(xpath="//div[@class='user-navigation']/button")
    public static WebElement HomePageSignInButton;
	

	@FindBy(id="home-search-icon")
	public static WebElement SearchICon;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public static WebElement HomePageSearch;
	
	@FindBy(xpath="//div[@class='ng-scroll-content']/ul/li/span/span")
	public static List<WebElement> AutoSuggestiveDropdown;
	
	@FindBy(xpath="//span[@class='cursor']")
	public static WebElement CookieClose;
	
	@FindBy(xpath="button is-default blue-stroke small mat-button mat-button-base")
	public static WebElement CookieGotItButton;
	
	@FindBy(xpath="//div[@class='footer']")
	public static WebElement FooterSection;
	
	@FindBy(xpath="//div[@class='slider-header flex justify-content-between']/h4")
	public static List<WebElement> RowsTitleText;
	
	@FindBy(xpath="//div[@class='header-logo flex align-items-center']/a[1]")
	public static WebElement HeaderLogo;
	
	@FindBy(xpath="//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal']/app-gud-card/div")
	public static List<WebElement> WatchlistCards;
	
	@FindBy(xpath="//span[contains(text(),'Notifications')]")
	public static WebElement clicknotification;
	
	@FindBy(xpath="//a[@class='fill-profile']")
	public static WebElement profileicon;
	
	@FindBy(xpath="//li[@contains(text(),'Account & Settings']")
	public static WebElement accountsettings;
	
	@FindBy(xpath="//li[@contains(text(),'Friends']")
	public static WebElement friends;
	
	@FindBy(xpath="//li[@contains(text(),'Support']")
	public static WebElement support;
	
	@FindBy(xpath="//p[contains(text(),'Manage your Email, SMS, In-app and push notificati')]")
	public static WebElement notificationtext;
	
	public static void HomePageSearch(String shoseriesorstudioname) throws InterruptedException {
		
		homepage.CookieClose.click();
		homepage.SearchICon.click();
		homepage.HomePageSearch.sendKeys(shoseriesorstudioname);
		log.info("Sent Text in the Home Page is "+shoseriesorstudioname);
		Thread.sleep(3000);
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
