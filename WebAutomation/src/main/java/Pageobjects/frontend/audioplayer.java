package Pageobjects.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseSetup;

public class audioplayer extends BaseSetup
{
	public audioplayer()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='gudsho-trackTitle']")
	public static WebElement SongNameOnPlayer;
	
	@FindBy(xpath="//div[@class='player-logo']")
	public static WebElement GudShoLogoOnPlayer;
	
	@FindBy(xpath="//div[@class='center_left']/button")
	public static WebElement HeartIconButton;

}
