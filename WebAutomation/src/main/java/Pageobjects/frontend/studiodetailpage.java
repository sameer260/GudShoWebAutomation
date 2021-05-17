package Pageobjects.frontend;

import java.util.List;

import org.openqa.selenium.WebElement;
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
	
	   
	

}
