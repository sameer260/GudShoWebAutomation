package Pageobjects.frontend;

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
	public static WebElement WatchlistPopUpHeadderText;
	
	@FindBy(xpath="//div[@class='content-wrapper']/span")
	public static WebElement WatchlistPopUpDescriptionText;
	
	@FindBy(xpath="//div[@class='content-wrapper']/button[2]")
	public static WebElement PopUpSignInButton;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-sho-details[1]/main[1]/section[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[2]/app-watch-later[1]/div[1]")
	public static WebElement HeaderWatchlistButton;
}
