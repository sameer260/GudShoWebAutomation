package steps.frontend;


import Pageobjects.frontend.SignUp;

import static io.restassured.RestAssured.given;
import Resources.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class SignupSteps extends BaseSetup
{
	SignUp sl=new SignUp();
	@Given("^Navigate to the url and click on Signin button$")
    public void navigate_to_the_url_and_click_on_signin_button() throws Throwable {
		
		SignUp.HomePageSignInButton.click();
    }
	@Given("^Click on Signuplink and enter (.+)$")
	public void click_on_signuplink_and_enter(String mobilenumber) throws Throwable {
		/* SignUp.SignInLink.click();
		 SignUp.SignUpPhoneNumberField.sendKeys(mobilenumber); 
		 SignUp.SignUpOTPButton.click();
		 Thread.sleep(20000);*/
		
		
		
	}
	@And("^verify otp$")
    public void verify_otp() throws Throwable {
		
		 
		   
		
		
		
		
		
	  /*SignUp.OTPFields.get(0).sendKeys("1");
	  SignUp.OTPFields.get(1).sendKeys("1");
	  SignUp.OTPFields.get(2).sendKeys("1");
	  SignUp.OTPFields.get(3).sendKeys("1");
	  SignUp.OTPFields.get(4).sendKeys("1");
	  SignUp.OTPFields.get(5).sendKeys("1"); */	
	    
    }


}
