package steps.frontend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.frontend.SignUp;
import Pageobjects.frontend.commonlocatorsandmethods;
import Pageobjects.frontend.homepage;
import Pageobjects.frontend.shodetailpage;
import Resources.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class paywallsteps extends BaseSetup {
      
	public static Logger log=Logger.getLogger(paywallsteps.class.getName());
	  SignUp sign=new SignUp();
	  shodetailpage shodetail= new shodetailpage();	
	  homepage home=new homepage();
	  WebDriverWait wait=new WebDriverWait(driver,20);
	
	 @Given("^Search (.+) click on watchlist button$")
	    public void search_click_on_watchlist_button(String shoseries) throws Throwable {
		   homepage.HomePageSearch.sendKeys(shoseries);
		   log.info("Sent Text in the Home Page is "+shoseries);
	       homepage.autosuggestivenamesm(shoseries); 
	       wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShoNameonShoDetailPage));
	       assertEquals(shoseries, shodetailpage.ShoNameonShoDetailPage.getText());
	       log.info("Page Redirected to the  "+shoseries +"detail page");
		   shodetailpage.WatchListButton.click();
		   log.info("Clicked on the watch list button");
		   
		   log.info("Step Passed");
	    }
	 @Then("^Signin popup should open and verify the text$")
	    public void signin_popup_should_open_and_verify_the_text() throws Throwable {
		   wait.until(ExpectedConditions.visibilityOf(shodetailpage.SignInPopUp));
	       assertTrue(shodetailpage.SignInPopUp.isDisplayed());
	       log.info("Signin popup is displayed");
	       assertEquals(shodetailpage.WatchlistPopUpHeadderText.getText(),"Want to save & watch later?");
	       log.info(shodetailpage.WatchlistPopUpHeadderText.getText());
	       assertEquals(shodetailpage.WatchlistPopUpDescriptionText.getText(),"Sign In to save this video & watch again later");
	       log.info(shodetailpage.WatchlistPopUpDescriptionText.getText());
	    }
	 @And("^click on signin button and it should redirect to the login page$")
	    public void click_on_signin_button_and_it_should_rdirect_to_the_login_page() throws Throwable {
		 shodetailpage.PopUpSignInButton.click();
		 log.info("Clicked on Signin Button");
		 wait.until(ExpectedConditions.visibilityOf(SignUp.HelloThereText));
		 assertTrue(SignUp.HelloThereText.isDisplayed());
		 log.info("Its redirected to the Login page and Step Passed");
		 
	    }
	 @Given("^Search (.+) click on watchlist button from header$")
	    public void search_click_on_watchlist_button_from_header(String shoseries) throws Throwable {
		 homepage.HomePageSearch.sendKeys(shoseries);
		   log.info("Sent Text in the Home Page is "+shoseries);
	       homepage.autosuggestivenamesm(shoseries); 
	       wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShoNameonShoDetailPage));
	       assertEquals(shoseries, shodetailpage.ShoNameonShoDetailPage.getText());
	       log.info("Page Redirected to the  "+shoseries +"detail page");
	       commonlocatorsandmethods.scrolldownm();
	       wait.until(ExpectedConditions.visibilityOf(shodetailpage.HeaderWatchlistButton));
		   shodetailpage.HeaderWatchlistButton.click();
		   log.info("Clicked on the watch list button");
		   log.info("Step Passed");
	    }
	
	
}
