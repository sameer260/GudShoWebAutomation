package steps.frontend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
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
	studiodetailpage studio = new studiodetailpage();
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

	@Given("^Search any (.+) and verify its redirected studio page$")
    public void search_any_and_verify_its_redirected_studio_page(String studioname) throws Throwable {

		homepage.HomePageSearch(studioname);
		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.StudioNameInStudioPage));
		String studionameonstudiodetailpage = studiodetailpage.StudioNameInStudioPage.getText();
		log.info(studionameonstudiodetailpage);
		assertTrue(studionameonstudiodetailpage.equalsIgnoreCase(studioname));
	}

	@When("^Click on Follow button$")
	public void click_on_follow_button() throws Throwable {

		studiodetailpage.FollowButton.click();
	}

	@Then("^check  toaster message and verify following text$")
	public void check_toaster_message_and_verify_following_text() throws Throwable {
		String followtext = ToastandErrormessages.ToastMessageText.getText();

		assertEquals(followtext, "You have started following this studio");
		System.out.println("the toaster message is: " + followtext);

		ToastandErrormessages.ToastMessageClose.click();
	}

	@When("^play trailer from banner section$")
	public void play_trailer_from_banner_section() throws Throwable {

		studiodetailpage.PlayTrailerButton.click();
	}

	@Then("^close the player")
	public void closeplayer() throws Throwable {
		studiodetailpage.closeplayer.click();
	}

	@When("^verfiy promo player$")
    public void verfiy_promo_player() throws Throwable {
		commonlocatorsandmethods.scrolldownm();

//		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.trendingpromos)).click();

		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.clickpromo)).click();
		Thread.sleep(18000);

		

	}

	@Then("^close player$")
	public void close_player() throws Throwable {

		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.closepromoplayer)).click();


	}

	@When("^click sho card and verify its redirected sho detail page$")
    public void click_sho_card_and_verify_its_redirected_sho_detail_page() throws Throwable {
		commonlocatorsandmethods.scrolldownm();
    	Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.shocard1)).click();
		Thread.sleep(8000);
		}

	@When("^click genre and verify sho card redirection$")
    public void click_genre_and_verify_sho_card_redirection() throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.selectgenre)).click();
       Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(studiodetailpage.selectshocardfromgenre)).click();
      Thread.sleep(3000);
	}

}
