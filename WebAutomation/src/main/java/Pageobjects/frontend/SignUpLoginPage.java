package Pageobjects.frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Resources.BaseSetup;




public class SignUpLoginPage extends BaseSetup
{
	
	public SignUpLoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//div[@class='user-navigation']/button")
	public static WebElement HomePageSignInButton;
	
	@FindBy(id="phoneEmail")
	public static WebElement PhoneEmailIdField;
	
	@FindBy(id="password")
	public static WebElement PasswordField;
	
	@FindBy(xpath="//div[@class='form-submit']/button")
	public static WebElement RequestOTPButton;
	
	@FindBy(xpath="//div[@class='login-via-otp']/button")
	public static WebElement LoginPageSignInButton;
	
	@FindBy(xpath="//span[@class='otp']")
	public static WebElement ForgotPasswordLink;
	
	@FindBy(xpath="//div[@class='user-page-logo']")
	public static WebElement LoginPageGudShoLogo;
	
	@FindBy(xpath="//div[@class='form-container sign-in']/h1")
	public static WebElement HelloThereText;
	
	@FindBy(xpath="//div[@class='form-container sign-in']/p")
	public static WebElement DescriptionText;
	
	@FindBy(xpath="//a[@class='sign-up']")
	public static WebElement SignInLink;
	
	@FindBy(xpath="//div[@class='ngx-mat-tel-input-container']/input")
	public static WebElement SignUpPhoneNumberField;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement SignUpOTPButton;
	
	
}
