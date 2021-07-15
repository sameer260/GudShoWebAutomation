package steps.frontend;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class studiodetailpagesteps  extends BaseSetup{
	
	homepage home=new homepage();
	shodetailpage detailpage=new shodetailpage();
	paymentpage payment=new paymentpage();
	ToastandErrormessages toaster=new ToastandErrormessages();
	commonlocatorsandmethods cm=new commonlocatorsandmethods();
	ShareFeature share=new ShareFeature();
	studiodetailpage studio=new studiodetailpage();
	public static Logger log=Logger.getLogger(studiodetailpagesteps.class.getName());
	videoplayer video=new videoplayer();
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	
	 @Then("^Share studio with all share icons$")
	    public void share_studio_with_all_share_icons() throws Throwable {
	        ShareFeature.Studioshare();
	    }
	 @When("^Play (.+) from banner and close the player$")
	    public void play_from_banner_and_close_the_player(String shotrailer) throws Throwable {
	       studiodetailpage.BannerImageClick(shotrailer);
	       Thread.sleep(3000);
	    }

	 @Then("^check redirection of (.+)$")
	    public void check_redirection_of(String shotrailer) throws Throwable {
	        Actions a=new Actions(driver);
	        a.moveToElement(videoplayer.HoverOnPlayer).build().perform();
	        String Shonameonplayer= videoplayer.ShoNameOnPlayer.getText();
	        assertEquals(shotrailer,Shonameonplayer);
	        
	    }

}
