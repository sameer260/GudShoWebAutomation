package Pageobjects.frontend;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseSetup;

public class shodetailpage extends BaseSetup
{
	public shodetailpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='bookmark static sho-detail flex align-items-center justify-content-center cursor relative-signUp add-to-list ng-star-inserted']")
    public static WebElement WatchListButton;
	
	@FindBy(xpath="//body[@id='body']/app-root/div/app-sho-details/main/section/div/div[3]/h1")
	public static WebElement ShoNameonShoDetailPage;
	
	@FindBy(xpath="//div[@class='sign-popup ng-star-inserted']")
	public static WebElement SignInPopUp;
	
	@FindBy(xpath="//div[@class='content-wrapper']/h5")
	public static WebElement SignInPopUpHeadderText;
	
	@FindBy(xpath="//div[@class='content-wrapper']/span")
	public static WebElement SignInPopUpDescriptionText;
	
	@FindBy(xpath="//div[@class='content-wrapper']/button[2]")
	public static WebElement PopUpSignInButton;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[2]/app-watch-later[1]/div[1]")
	public static WebElement HeaderWatchlistButton;
	
	@FindBy(xpath="//li[@class='ng-star-inserted']/button")
	public static WebElement WatchFreeButton;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/app-gud-play-button[1]/ul[1]/li[1]/button[1]")
	public static WebElement HeaderWatchFreeButton;
	
	@FindBy(xpath="//div[@class='share-play']")
	public static WebElement BuyButton;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/app-gud-play-button[1]/ul[1]/li[2]/div[1]/div[1]")
	public static WebElement HeaderBuyButton;
	
	@FindBy(xpath="//div[@id='seriesInfo']/div/mat-form-field/div")
	public static WebElement SeasonDropDownButton;
	
	@FindBy(xpath="//div[@class='ng-scroll-content']/mat-option")
	public static List<WebElement> SeasonNamesinDropdownText;
	
	@FindBy(xpath="//div[@class='card-main promo-card-content episode-card-content']")
	public static List<WebElement> EntireEpisodeCards;
	
	@FindBy(xpath="//app-gud-card[@class='swiper-wrapper episode-wrapper']/div/div/div[1]")
	public static List<WebElement> EpisodeCards;
	
	@FindBy(xpath="//div[@class='card-left']/h4")
	public static List<WebElement> EpisodeNames;
	
	@FindBy(xpath="//p[@class='episode-description text-control-three']")
	public static List<WebElement> EpisodeDescription;
	
	@FindBy(xpath="//h2[text()='Musical Tracks']")
	public static WebElement MusicalTracksTitle;
	
	@FindBy(xpath="//div[@class='card-left box-promo']/h4")
	public static List<WebElement> PromoNamesText;
	
	@FindBy(xpath="//div[@class='mat-ripple card-img']")
	public static List<WebElement> PromoCards;
	
	
}
