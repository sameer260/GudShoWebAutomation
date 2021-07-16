package steps.frontend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
			WebElement notify=wait.until(ExpectedConditions.elementToBeClickable(homepage.clicknotification));
	   	executor.executeScript("arguments[0].click();", notify);
	    	Thread.sleep(2000);
	    	}
		@Then("^verify notification page redirected to correct page$")
	    public void verify_notification_page_redirected_to_correct_page() throws Throwable {
			homepage.notificationsettingbox.isDisplayed();
			String actual=homepage.NotificationSettingText.getText();
			assertEquals(actual,"Manage your Email, SMS, In-app and push notifications");
			}

	    @Given("^verify user profile icon$")
	    public void verify_user_profile_icon() throws Throwable {
	    	wait.until(ExpectedConditions.elementToBeClickable(homepage.Headderprofileicon));
	    	Actions a=new Actions(driver);
	    	a.moveToElement(homepage.Headderprofileicon).build().perform();
	    }
	    @Then("^verify profile icon page$")
	    public void verify_profile_icon_page() throws Throwable {
	    	assertTrue(homepage.accountsettings.isDisplayed());
	    	assertTrue(homepage.friends.isDisplayed());
	    	assertTrue(homepage.support.isDisplayed());
	    	assertTrue(homepage.ProfileUserPhoneNumber.isDisplayed());
	    	assertTrue(homepage.ProfileUserName.isDisplayed());
	    	assertTrue(homepage.Headderprofileicon.isDisplayed());
	    }

}
