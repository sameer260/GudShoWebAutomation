package Pageobjects.frontend;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseSetup;

public class studiodetailpage extends BaseSetup {
	
	public studiodetailpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='edit-title']")
	public static WebElement StudioNameInStudioPage;
	
	@FindBy(xpath="//div[@class='followers-btn']//app-follow-studios/button")
	public static WebElement FollowButton;
	
	@FindBy(xpath="//div[@class='follow-btn']//app-follow-studios/button")
	public static WebElement HeaderFollowButton;
	
	@FindBy(xpath="//div[@class='hover-sho-detail ng-star-inserted']/div/h5")
	public static List<WebElement> ShoNamesOnCards;
	
	@FindBy(xpath="//div[@class='mat-ripple card-img cursor auto-image']")
	public static List<WebElement> ShoCards;
	
	@FindBy(xpath="//div[@class='details-btns flex']/div[1]")
	public static List<WebElement> WatchListIcon;
	
	@FindBy(xpath="//h4[@class='card-title text-control']")
	public static List<WebElement> AudioNames;
	
	@FindBy(xpath="//div[@class='card-main audio-card-content']/div[1]")
	public static List<WebElement> AudioCards;
	
	@FindBy(xpath="//div[@class='swiper-slide ng-star-inserted swiper-slide-active']/div/div/div/h3/span[1]")
	public static WebElement ShoNamesOnStudioBanner;
	
	@FindBy(xpath="//div[@class='slider-content banner-slider-content ng-star-inserted']/swiper/div/div[1]")
	public static WebElement NextSliderButton;
	
	@FindBy(xpath="//div[@class='swiper-slide ng-star-inserted swiper-slide-active']/div/div/div/button")
	public static WebElement PlayTrailerButton;
	
	
	
	
	public static void BannerImageClick(String shoname) throws InterruptedException
	{
		 Actions a =new Actions(driver);
		 while(!(studiodetailpage.ShoNamesOnStudioBanner.getText().equalsIgnoreCase(shoname)))
		  {
			  a.moveToElement(studiodetailpage.NextSliderButton).click().build().perform();  
		  }
		 Thread.sleep(1000); 
	}
	
	

}
