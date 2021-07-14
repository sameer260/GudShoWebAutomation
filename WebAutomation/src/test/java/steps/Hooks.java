package steps;



import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Pageobjects.frontend.SignUp;
import Pageobjects.frontend.ToastandErrormessages;
import Pageobjects.frontend.homepage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;



import Resources.BaseSetup;


public class Hooks extends BaseSetup {
	 
	
	
	@Before(order=0)
	public void launchdriverandapplication() throws InterruptedException, IOException
	{
		
		BaseSetup.intiliazedriver();
		
	}	
	@Before("not @Signup")
	public void loginapplication() throws InterruptedException, IOException
	{
		
		System.out.println("This Before Hook for not applicable to Paywall concept and Signup and Login");
		SignUp sl=new SignUp();
		ToastandErrormessages ts=new ToastandErrormessages();
		SignUp.HomePageSignInButton.click();
		SignUp.PhoneEmailIdField.sendKeys("6379039922");
		SignUp.PasswordField.sendKeys("Test@123");
		SignUp.LoginPageSignInButton.click();
		ToastandErrormessages.ToastMessageClose.click();
		
		
		
	}
	@After()
	public void teardown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
		  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	       scenario.attach(screenshot, "image/png", "image");
	       
		}
		driver.close();
	}

}
