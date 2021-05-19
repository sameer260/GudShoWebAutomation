package Pageobjects.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseSetup;

public class videoplayer extends BaseSetup{
	
	public videoplayer()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='plyr__poster']")
	public static WebElement HoverOnPlayer;
	
	@FindBy(xpath="//div[@class='player-logo']")
	public static WebElement PlayerGudShoLogo;
	
	@FindBy(xpath="//div[@class='next-promo ng-star-inserted']/span")
	public static WebElement PromosandExtrasText;
	
	@FindBy(xpath="//div[@class='player-clap singup-pops-player']")
	public static WebElement PlayerGudICon;
	
	@FindBy(xpath="//div[@class='sign-popup ng-star-inserted']")
	public static WebElement SignInPopup;
	
	@FindBy(xpath="//div[@class='content-wrapper']/h5")
	public static WebElement SignUpHeadText;
	
	@FindBy(xpath="//div[@class='content-wrapper']/span")
	public static WebElement SignUpDescriptionText;
	
	@FindBy(xpath="//div[@class='content-wrapper']/button[2]")
	public static WebElement PopUpSignInButton;
	
	@FindBy(xpath="//div[@class='center_right']/button")
	public static WebElement FullScreenButton;
	
	@FindBy(xpath="//div[@id='inner-video']/button")
	public static WebElement CloseButton;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/app-watch[1]/app-player[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/h2[1]")
	public static WebElement ShoNameOnPlayer;

}
