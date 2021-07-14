package Pageobjects.frontend;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]")
	public static WebElement ShareButton;
	
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
	
	@FindBy(xpath="//li[@class='ng-star-inserted']/button")
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
	
	
	@FindBy(xpath="//span[text()=' Full Episodes ']")
	public static WebElement FullEpisodesLink;
	
	@FindBy(xpath="//h2[@class='see-category episodes-sho-title']")
	public static WebElement AllEpisodesText;
	
	@FindBy(xpath="//h2[@class='text-control']/span")
	public static List<WebElement> EpisodeNamesInEpisodePage;
	
	@FindBy(xpath="//mat-form-field[@appearance='outline']")
	public static WebElement SeasonDropdownInEpisodePage;
	
	@FindBy(xpath="//div[@class='swiper-slide ng-star-inserted']")
	public static List<WebElement> AudioSongsRowsList;
	
	@FindBy(xpath="//h4[@class='card-title text-control']/span")
	public static List<WebElement> SongsNamesText;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[1]/div[3]/div[3]/div[1]/p[1]")
	public static WebElement FeelersText;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[1]/div[2]/a[1]")
	public static WebElement StudioLink;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[1]/div[2]/a[1]/div[2]/h6")
	public static WebElement StudionameinStudioLink;
	
	
	//Promo Cards
	
	@FindBy(xpath="//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-free-mode']/app-gud-card/div/div/div[2]/h4")
	public static List<WebElement> PromoNamesofPromoCards;
	
	@FindBy(xpath="//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-free-mode']/app-gud-card/div/div/div[2]/div/p")
	public static List<WebElement> ViewCountofPromos;
	
	@FindBy(xpath="//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-free-mode']/app-gud-card/div/div/div[2]/div/span")
	public static List<WebElement> GudCountofPromos;
	
	@FindBy(xpath="//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-free-mode']/app-gud-card/div/div/div[1]")
	public static List<WebElement> PromoCards;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/div[2]/section[1]/div[1]/app-gud-slider[1]/div[1]/div[2]/swiper[1]/div[1]/app-gud-card[1]/div[1]/div[1]/div[1]/div[3]")
	public static List<WebElement> PromoShareIcon;
	
	public static String PromoCardClick(String promoname)
	{
		Actions a =new Actions(driver);
		String promonameoncard = null;
		for(int i=0;i<PromoNamesofPromoCards.size();i++)
		{
			
			if(PromoNamesofPromoCards.get(i).getText().equalsIgnoreCase(promoname))
			{
				promonameoncard=PromoNamesofPromoCards.get(i).getText();
				a.moveToElement(PromoCards.get(i)).click().build().perform();
			}
		}
		return promonameoncard;
	}
	public static String PromoCardShare(String promoname)
	{
		Actions a =new Actions(driver);
		String promonameoncard = null;
		for(int i=0;i<PromoNamesofPromoCards.size();i++)
		{
			if(PromoNamesofPromoCards.get(i).getText().equalsIgnoreCase(promoname))
			{
				promonameoncard=PromoNamesofPromoCards.get(i).getText();
				a.moveToElement(PromoCards.get(i)).build().perform();
				PromoShareIcon.get(i).click();
				
			}
		}
		return promonameoncard;
	}
	
	
	
	
	
	
}
