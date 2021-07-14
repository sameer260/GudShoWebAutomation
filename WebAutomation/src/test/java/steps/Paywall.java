package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Pageobjects.frontend.homepage;
import Pageobjects.frontend.shodetailpage;
import Resources.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.reactivex.rxjava3.functions.Action;

public class Paywall extends BaseSetup {
	
	homepage home = new homepage();
	shodetailpage shodetail = new shodetailpage();

	@Given("^Open the Chrome and launch the application$")
	public void open_the_chrome_and_launch_the_application() throws Throwable {
		BaseSetup.intiliazedriver();

	}

	  @When("^From sho detail page click on add to watchlist$")
	    public void from_sho_detail_page_click_on_add_to_watchlist() throws Throwable {
		 // Actions action = new Actions(driver);
		  //action.moveToElement(shodetailpage.WatchListButton).click().build().perform();
		  Thread.sleep(2000);
		  shodetailpage.WatchListButton.click();
	       
	    }

	    @Then("^Validate the minipopup$")
	    public void validate_the_minipopup() throws Throwable {
	    	shodetailpage.SignInPopUp.isDisplayed();
	    	shodetailpage.SignInPopUpDescriptionText.isDisplayed();
	    	shodetailpage.SignInPopUpHeadderText.isDisplayed();
	    	shodetailpage.PopUpSignInButton.click();
	    	driver.findElement(By.xpath("//h1")).isDisplayed();
	       
	    }

	    @And("^Search any sho (.+)$")
	    public void search_any_sho(String shoname) throws Throwable {
	    	homepage.HomePageSearch(shoname);
	       
	    }
}
