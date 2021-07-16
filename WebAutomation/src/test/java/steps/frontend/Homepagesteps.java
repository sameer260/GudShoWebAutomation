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
import Pageobjects.frontend.commonlocatorsandmethods;
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
	    

	    @Given("^Click on sho card from any row and verify its redirected to correct sho detail page$")
	   	    public void click_on_sho_card_from_any_row_and_verify_its_redirected_to_correct_sho_detail_page() throws Throwable {
	   	        Actions a =new Actions(driver);
	   	        a.moveToElement(homepage.MultipleRowShocards.get(0)).build().perform();
	   	        wait.until(ExpectedConditions.visibilityOf(homepage.MultipleRowShoNamesonShocards.get(0)));
	   	    	String shonameoncard=homepage.MultipleRowShoNamesonShocards.get(0).getText();
	   	    	homepage.MultipleRowShocards.get(0).click();
	   	    	wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShoNameonShoDetailPage));
	   	        String shoname=shodetailpage.ShoNameonShoDetailPage.getText();
	   	        assertEquals(shoname,shonameoncard);
	   	    }
	   	    @Given("^Click on studio card from studio row and verify its redirected to correct studio detail page$")
	   	    public void click_on_studio_card_from_studio_row_and_verify_its_redirected_to_correct_studio_detail_page() throws Throwable {
	   	    	commonlocatorsandmethods.scrolldownm();
	   	    	String studionameoncard=homepage.RowStudioNameonCard.get(0).getText();
	   	    	homepage.StudioCards.get(0).click();
	   	    	wait.until(ExpectedConditions.visibilityOf(studiodetailpage.StudioNameInStudioPage));
	   	        String studioname=studiodetailpage.StudioNameInStudioPage.getText();
	   	        assertEquals(studioname,studionameoncard);
	   	    }

	    String bannerShoName;
	    
	    @Given("^Select fist card from home banner$")
	    public void select_fist_card_from_home_banner() throws Throwable {
	    	Actions a = new Actions(driver);
	    	wait.until(ExpectedConditions.visibilityOfAllElements(homepage.allBanners));
	    	String bannerShoName = homepage.allBanners.get(1).getText();
	    	log.info("Redirecting to this sho: "+bannerShoName);
	    	a.moveToElement(homepage.allBanners.get(1)).build().perform();
	    	Thread.sleep(3000);
	    	homepage.allBanners.get(1).click();
	      
	    }

	    @Then("^verify redirection of home banner$")
	    public void verify_redirection_of_home_banner() throws Throwable {
	    	String shoName = shodetailpage.ShoNameonShoDetailPage.getAttribute("alt");
	    	assertTrue(shoName.equalsIgnoreCase(bannerShoName));
	        
	    }


}
