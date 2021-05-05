package steps.frontend;


import Pageobjects.frontend.SignUp;
import Resources.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SignupSteps extends BaseSetup
{
	SignUp sl=new SignUp();
	@Given("^Navigate to the url and click on Signin button$")
    public void navigate_to_the_url_and_click_on_signin_button() throws Throwable {
		
		SignUp.HomePageSignInButton.click();
    }
	@Given("^Click on Signuplink and enter (.+)$")
	public void click_on_signuplink_and_enter(String mobilenumber) throws Throwable {
		 SignUp.SignInLink.click();
		 SignUp.SignUpPhoneNumberField.sendKeys(mobilenumber); 
	}
	@And("^verify otp$")
    public void verify_otp() throws Throwable {
		SignUp.SignUpOTPButton.click();
		
	    for(int i=0;i<SignUp.OTPFields.size();i++)
	    {
	    	SignUp.OTPFields.get(i).sendKeys("1");
	    }
    }


}
