package Pageobjects.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseSetup;

public class ToastandErrormessages extends BaseSetup
{

	public ToastandErrormessages()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@id='toast-container']//div//div")
	public static WebElement ToastMessageText;
	
	@FindBy(xpath="//div[@id='toast-container']//div//button")
	public static WebElement ToastMessageClose;
	
}
