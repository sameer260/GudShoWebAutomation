package steps.frontend;


import Pageobjects.frontend.SignUpLoginPage;

import Resources.BaseSetup;
import io.cucumber.java.en.Given;

public class SignupLoginSteps extends BaseSetup
{
	SignUpLoginPage sl=new SignUpLoginPage();
	@Given("^Navigate to the url and click on Signin button$")
    public void navigate_to_the_url_and_click_on_signin_button() throws Throwable {
		SignUpLoginPage.HomePageSignInButton.click();
    }
	 @Given("^Click on Signuplink and enter (.+)$")
	 public void click_on_signuplink_and_enter(String mobilenumber) throws Throwable {
		 SignUpLoginPage.SignInLink.click();
		 SignUpLoginPage.SignUpPhoneNumberField.sendKeys(mobilenumber); 
		 
	}

}
