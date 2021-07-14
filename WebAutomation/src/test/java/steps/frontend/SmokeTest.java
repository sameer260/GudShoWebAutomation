package steps.frontend;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pageobjects.frontend.ShareFeature;
import Pageobjects.frontend.ToastandErrormessages;
import Pageobjects.frontend.commonlocatorsandmethods;
import Pageobjects.frontend.homepage;
import Pageobjects.frontend.paymentpage;
import Pageobjects.frontend.shodetailpage;
import Pageobjects.frontend.studiodetailpage;
import Pageobjects.frontend.videoplayer;
import Resources.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest extends BaseSetup {
	homepage home = new homepage();
	shodetailpage detailpage = new shodetailpage();
	paymentpage payment = new paymentpage();
	ToastandErrormessages toaster = new ToastandErrormessages();
	commonlocatorsandmethods cm = new commonlocatorsandmethods();
	ShareFeature share = new ShareFeature();
	public static Logger log = Logger.getLogger(SmokeTest.class.getName());
	videoplayer video = new videoplayer();
	WebDriverWait wait = new WebDriverWait(driver, 30);

	@Given("^Search any (.+) and verfiy its redirected to correct page$")
	public void search_any_and_verfiy_its_redirected_to_correct_page(String shoname) throws Throwable {
		homepage.HomePageSearch(shoname);
		wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShoNameonShoDetailPage));
		String shonameonshodetailpage = shodetailpage.ShoNameonShoDetailPage.getText();
		log.info(shonameonshodetailpage);
		assertEquals(shonameonshodetailpage, shoname);
	}

	@When("^Buy the sho using (.+) with (.+)$")
	public void buy_the_sho_using_with(String paymentgateway, String paymentscenario) throws Throwable {
		shodetailpage.BuyButton.click();
		Thread.sleep(2000);
		paymentpage.PopupContinueButton.click();
		Thread.sleep(4000);
		/*
		 * paymentpage.SelectPaymentMethod(paymentgateway);
		 * if(paymentgateway.equalsIgnoreCase("Razorpay")) {
		 * paymentpage.RazorpaypaymentScenario(paymentscenario); } else
		 * if(paymentgateway.equalsIgnoreCase("Paytm")) {
		 * paymentpage.PaytmPaymentScenario(paymentscenario); } else
		 * if(paymentgateway.equalsIgnoreCase("UPI")) { Thread.sleep(5000); }
		 */
	}

	@Then("^Verify after payment (.+) is playing and close the player$")
	public void verify_after_payment_is_playing_and_close_the_player(String shoname) throws Throwable {
		Actions a = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(ToastandErrormessages.ToastMessageText));
		log.info(ToastandErrormessages.ToastMessageText.getText());
		assertEquals(ToastandErrormessages.ToastMessageText.getText(), "Payment Processed");
		Thread.sleep(2000);
		a.moveToElement(videoplayer.HoverOnPlayer).build().perform();
		wait.until(ExpectedConditions.visibilityOf(videoplayer.ShoNameOnPlayer));
		String ShonameonPlayer = videoplayer.ShoNameOnPlayer.getText();
		assertEquals(ShonameonPlayer, shoname);
		videoplayer.CloseButton.click();
	}

	@When("^Add (.+) in to watchlist and check the toaster message$")
	public void add_in_to_watchlist_and_check_the_toaster_message(String shoname) throws Throwable {
		shodetailpage.WatchListButton.click();
		wait.until(ExpectedConditions.visibilityOf(ToastandErrormessages.ToastMessageText));
		String Toastmessage = ToastandErrormessages.ToastMessageText.getText();
		assertEquals(Toastmessage, shoname + " has been added to watchlist");
	}

	@Then("^On home page check the added watchlist (.+)$")
	public void on_home_page_check_the_added_watchlist(String shoname) throws Throwable {
		homepage.HeaderLogo.click();
		commonlocatorsandmethods.scrolldownm();
		String str = commonlocatorsandmethods.shocardwatchlistShoName(shoname);
		log.info(str);
		assertEquals(shoname, str);

	}

	@When("^Click on Share button$")
	public void click_on_share_button() throws Throwable {
		shodetailpage.ShareButton.click();
	}

	@Then("^Share the sho using all social icons$")
	public void share_the_sho_using_all_social_icons() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(ShareFeature.SharePopup));
		ShareFeature.FacebookShareIcon.click();
		ShareFeature.facebookwindowhandle();
		ShareFeature.TwitterShare.click();
		ShareFeature.twitterwindowhandle();
		ShareFeature.WhatsappShare.click();
		ShareFeature.whatsappswindowhandle();
		ShareFeature.CopyLinkShare.click();
		ShareFeature.copylinkwindowhandle();

	}

	/*
	 * Paywall scripting for sanity by santhosh
	 */

	@Given("^Open the Chrome and launch the application$")
	public void open_the_chrome_and_launch_the_application() throws Throwable {
		BaseSetup.intiliazedriver();
		log.info("Browser and App launched");

	}

	@When("^From sho detail page click on add to watchlist$")
	public void from_sho_detail_page_click_on_add_to_watchlist() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(shodetailpage.WatchListButton));
		log.info("Clicking on the add to watchlist button");
		shodetailpage.WatchListButton.click();

	}

	@When("^Validate the minipopup add to watchlist$")
	public void validate_the_minipopup_add_to_watchlist() throws Throwable {
		shodetailpage.SignInPopUp.isDisplayed();
		shodetailpage.SignInPopUpHeadderText.isDisplayed();
		assertEquals("Want to save & watch later?", shodetailpage.SignInPopUpHeadderText.getText());
		shodetailpage.SignInPopUpDescriptionText.isDisplayed();
		assertEquals("Sign In to save this video & watch again later",
				shodetailpage.SignInPopUpDescriptionText.getText());
		log.info("All minipopup elements are displaying");
		shodetailpage.PopUpSignInButton.click();
		driver.findElement(By.xpath("//h1")).isDisplayed();

	}

	@Then("^Validate the minipopup Create gud$")
	public void validate_the_minipopup_create_gud() throws Throwable {
		shodetailpage.SignInPopUp.isDisplayed();
		shodetailpage.SignInPopUpHeadderText.isDisplayed();
		assertEquals("Like this Promo?", shodetailpage.SignInPopUpHeadderText.getText());
		shodetailpage.SignInPopUpDescriptionText.isDisplayed();
		assertEquals("Sign in now to rate this promo 'Gud'", shodetailpage.SignInPopUpDescriptionText.getText());
		log.info("All minipopup elements are displaying");
		shodetailpage.PopUpSignInButton.click();
		driver.findElement(By.xpath("//h1")).isDisplayed();

	}

	@When("^Validate the minipopup follow button$")
	public void validate_the_minipopup_follow_button() throws Throwable {
		shodetailpage.SignInPopUp.isDisplayed();
		shodetailpage.SignInPopUpHeadderText.isDisplayed();
		assertEquals("Follow this Studio?", shodetailpage.SignInPopUpHeadderText.getText());
		shodetailpage.SignInPopUpDescriptionText.isDisplayed();
		assertEquals("Sign In to follow this studio & enter into the world of entertainment",
				shodetailpage.SignInPopUpDescriptionText.getText());
		log.info("All minipopup elements are displaying");
		shodetailpage.PopUpSignInButton.click();
		driver.findElement(By.xpath("//h1")).isDisplayed();

	}

	@And("^Search any sho (.+)$")
	public void search_any_sho(String shoname) throws Throwable {
		homepage.HomePageSearch(shoname);
		wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShoNameonShoDetailPage));
		shodetailpage.ShoNameonShoDetailPage.isDisplayed();
		String shoName = driver
				.findElement(
						By.xpath("//body[@id='body']/app-root/div/app-sho-details/main/section/div/div[3]/h1/div/img"))
				.getAttribute("alt");
		log.info("Printing the sho name:" + shoName);
		if (shoname.equalsIgnoreCase(shoName))
			;

	}

	@When("^while playing click on greate gud button$")
	public void while_playing_click_on_greate_gud_button() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElements(videoplayer.PlayerGudICon));
		videoplayer.PlayerGudICon.click();
	}

	@And("^From sho detail page click on any promo$")
	public void from_sho_detail_page_click_on_any_promo() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElements(shodetailpage.PromoCards));
		shodetailpage.PromoCards.get(1).click();

	}

	@Then("^Validate Home page redirection$")
	public void validate_home_page_redirection() throws Throwable {
		driver.findElement(By.xpath("//h1")).isDisplayed();
	}

	@And("^From sho detail page click on Buy button$")
	public void from_sho_detail_page_click_on_buy_button() throws Throwable {
		shodetailpage.BuyButton.click();

	}

	@And("^From studio detail page click on follow button$")
	public void from_studio_detail_page_click_on_follow_button() throws Throwable {
		studiodetailpage.FollowButton.click();

	}

}
