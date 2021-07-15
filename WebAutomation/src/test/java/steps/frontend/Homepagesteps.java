package steps.frontend;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.frontend.SignUp;
import Pageobjects.frontend.ToastandErrormessages;
import Pageobjects.frontend.audioplayer;
import Pageobjects.frontend.homepage;
import Pageobjects.frontend.shodetailpage;
import Pageobjects.frontend.studiodetailpage;
import Pageobjects.frontend.videoplayer;
import Resources.BaseSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homepagesteps extends BaseSetup {
	
	public static Logger log=Logger.getLogger(Homepagesteps.class.getName());
	  SignUp sign=new SignUp();
	  shodetailpage shodetail= new shodetailpage();	
	  homepage home=new homepage();
	  videoplayer video=new videoplayer();
	  ToastandErrormessages toaster=new ToastandErrormessages();
	  audioplayer audio=new audioplayer();
	  studiodetailpage studio=new studiodetailpage();
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  
	  @Given("^verify notification tab$")
	    public void verify_notification_tab() throws Throwable {
			Thread.sleep(2000);

			WebElement notify=wait.until(ExpectedConditions.elementToBeClickable(homepage.clicknotification));
	   	executor.executeScript("arguments[0].click();", notify);
	    	Thread.sleep(2000);
	    	}
		@Then("^verify notification page redirected to correct page$")
	    public void verify_notification_page_redirected_to_correct_page() throws Throwable {
			
			homepage.notificationtext.isDisplayed();
			
			}
		

	    @Given("^verify user profile icon$")
	    public void verify_user_profile_icon() throws Throwable {
	    	Thread.sleep(3000);
	    	WebElement picon=wait.until(ExpectedConditions.elementToBeClickable(homepage.profileicon));
	    	homepage.profileicon.click();
	    	executor.executeScript("arguments[0].click();", picon);
	    }
	    @Then("^verify profile icon page$")
	    public void verify_profile_icon_page() throws Throwable {
	    	homepage.accountsettings.isDisplayed();
	    	homepage.friends.isDisplayed();
	    	homepage.support.isDisplayed();
	    }

}
