package Pageobjects.frontend;

import static org.junit.Assert.assertEquals;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.BaseSetup;

public class ShareFeature extends BaseSetup {
	
	    public ShareFeature()
	    {
		PageFactory.initElements(driver, this);
	    }
	
		@FindBy(xpath="//ul[@class='shocial-links ng-star-inserted']/li[1]")
		public static WebElement FacebookShareIcon;
		
		@FindBy(xpath="//ul[@class='shocial-links ng-star-inserted']/li[2]")
		public static WebElement TwitterShare;
		
		@FindBy(xpath="//ul[@class='shocial-links ng-star-inserted']/li[3]")
		public static WebElement WhatsappShare;
		
		@FindBy(xpath="//ul[@class='shocial-links ng-star-inserted']/li[4]")
		public static WebElement CopyLinkShare;
		
		@FindBy(id="email")
		private static  WebElement FacebookuserName;
		
		@FindBy(id="pass")
		private static  WebElement FacebookPassword;
		
		@FindBy(name="login")
		private static  WebElement FacebookLoginButton;
		
		@FindBy(name="__CONFIRM__")
		private static WebElement FacebookPostButton;
		
		@FindBy(xpath="//div[@class='cdk-overlay-pane delete-popup feeds-share']")
		public static WebElement SharePopup;
		
		@FindBy(name="session[username_or_email]")
		private static WebElement TwitterUserName;
		
		@FindBy(name="session[password]")
		private static WebElement TwitterPassword;
		
		@FindBy(xpath="//span[text()='Log in']")
		private static WebElement TwitterSignInButton;
		
		@FindBy(xpath="//span[contains(text(),'Tweet')]")
		private static WebElement TwitterTweetButton;
		
		@FindBy(id="action-button")
		private static WebElement WhatsappButton;
		
		@FindBy(className="_2y_4")
		private static WebElement Whatsapplinktext;
		
		
		
		
		
	public static void facebookwindowhandle() throws InterruptedException {

		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				FacebookuserName.clear();
				FacebookuserName.sendKeys("sameergudsho@gmail.com");
				FacebookPassword.clear();
				FacebookPassword.sendKeys("sameer1234");
				FacebookLoginButton.click();
				Thread.sleep(2000);
				FacebookPostButton.click();
				driver.close();

			}
		}
		driver.switchTo().window(MainWindow);
		Thread.sleep(1000);
	}

	public static void twitterwindowhandle() throws InterruptedException {

		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				Thread.sleep(2000);
				TwitterUserName.click();
				TwitterUserName.clear();
				TwitterUserName.sendKeys("sameer83144398");
				TwitterPassword.clear();
				TwitterPassword.sendKeys("sameer1234");
				TwitterSignInButton.click();
				driver.close();
			}

		}
		driver.switchTo().window(MainWindow);
		Thread.sleep(1000);
	}
	
	public static void whatsappswindowhandle() throws InterruptedException {
		String text = null;
		String linkinwhatsappfield=null;
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				WhatsappButton.isDisplayed();
				text = Whatsapplinktext.getText();
				linkinwhatsappfield=text.substring(text.lastIndexOf("https"));
				System.out.println(linkinwhatsappfield);
				Thread.sleep(1000);
				driver.close();

			}

		}
		driver.switchTo().window(MainWindow);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(linkinwhatsappfield);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShareButton));
		String currenttabtitle = driver.getTitle();
		String childurl = driver.getCurrentUrl();
		assertEquals(linkinwhatsappfield, childurl);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		String parenttabtitle = driver.getTitle();
		assertEquals(currenttabtitle, parenttabtitle);
		String parenturl = driver.getCurrentUrl();
		assertEquals(parenturl, childurl);
	}
	
	
	public static void copylinkwindowhandle()
			throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		CopyLinkShare.click();
		String Actual = ToastandErrormessages.ToastMessageText.getText();
		assertEquals(Actual, "Link Copied!");
		String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(myText);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(shodetailpage.ShareButton));
		String currenttabtitle = driver.getTitle();
		String childurl = driver.getCurrentUrl();
		assertEquals(myText, childurl);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		String parenttabtitle = driver.getTitle();
		assertEquals(currenttabtitle, parenttabtitle);
		String parenturl = driver.getCurrentUrl();
		assertEquals(parenturl, childurl);

	}
        

}
