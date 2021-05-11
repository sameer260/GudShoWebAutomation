package Pageobjects.frontend;

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

}
