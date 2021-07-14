package Pageobjects.frontend;

import java.util.Iterator;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.BaseSetup;

public class paymentpage extends BaseSetup {
	
	public paymentpage()
	{
		 PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='continue-btn coins-temp-plan']/button")
	public static WebElement PopupContinueButton;
	
	@FindBy(xpath="//div[@class='mat-tab-labels']/div")
	public static List<WebElement> PaymentMethods;
	
	@FindBy(xpath="//div[@class='paytm-wrap']/div/button")
	public static WebElement PaymentviaPaytm;
	
	@FindBy(xpath="//div[@class='payment-type-methods white']/section[1]")
	public static WebElement PayTMDebitCardPayment;
	
	@FindBy(xpath="//div[@class='pos-r']/input")
	public static WebElement PayTmCardField;
	
	@FindBy(id="mm")
	public static WebElement PayTmCardExpiryMonth;
	
	@FindBy(id="yy")
	public static WebElement PayTmCardExpiryYear;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement PayTmCVVno;
	
	@FindBy(xpath="//body/div[@id='app']/main[1]/div[3]/div[4]/section[1]/section[1]/div[2]/section[1]/section[1]/div[1]/div[4]/section[1]/button[1]")
	public static WebElement PayButtonInPayTM;
	
	@FindBy(xpath="//div[@class='btn-grp']/button")
	public static List<WebElement> ChoosePaymentScenario;
	
	@FindBy(id="card-number")
	public static WebElement RazoarPayCardno;
	
	@FindBy(id="expires_at")
	public static WebElement RazoarPayCardnoExpiryDate;
	
	@FindBy(id="key_no")
	public static WebElement RazoarPayCardnoCVV;
	
	@FindBy(id="name")
	public static WebElement RazoarPayCardnoName;
	
	@FindBy(xpath="//div[@class='cards-info ng-star-inserted']/app-card-payments/form/button[1]")
	public static WebElement RazoarPayButton;
	
	@FindBy(id="virtualaddress")
	public static WebElement UPIField;
	
	@FindBy(xpath="//div[@class='cards-info ng-star-inserted']/app-upi-mode/form/button[1]")
	public static WebElement UPIPayButton;
	
	@FindBy(xpath="//button[text()='Success']")
	public static WebElement RazorPaySuccessButton;
	
	@FindBy(css=".danger")
	public static WebElement RazorPayFailureButton;
	
	
	//Razor Pay Standard Check out
	
	@FindBy(xpath="//div[@class='methods-block']/div/button")
	public static List<WebElement> RazorPayPaymentMethods; 
	
	@FindBy(xpath="//div[@id='add-card-container']/div[1]/div[1]")
	public static WebElement CardNum;
	
	@FindBy(xpath="//div[@id='add-card-container']/div[1]/div[2]")
	public static WebElement ExpiryField;
	
	@FindBy(xpath="//div[@id='add-card-container']/div[2]/div[1]")
	public static WebElement CardHolderName;
	
	@FindBy(xpath="//div[@id='add-card-container']/div[2]/div[2]")
	public static WebElement CVVNo;
	
	@FindBy(xpath="//div[@id='add-card-container']/div[3]/div/label/span")
	public static WebElement RememberCheckbox;
	
	@FindBy(id="footer")
	public static WebElement PayButton;
	
	@FindBy(id="vpa-upi")
	public static WebElement UPIIdField;
	
	@FindBy(id="bank-item-SBIN")
	public static WebElement SBIBankNetBanking;
	
	
	
}	


















































	/*
	
	public static void PayTmPaymentCreditCard()
	{
		PaymentviaPaytm.click();
		PayTMDebitCardPayment.click();
		PayTmCardField.sendKeys("4111111111111111");
		PayTmCardExpiryMonth.sendKeys("10");
		PayTmCardExpiryYear.sendKeys("25");
		PayTmCVVno.sendKeys("123");
		PayButtonInPayTM.click();
	}
	
	public static void PaymentviaRazorPay()
	{
		RazoarPayCardno.sendKeys("4111111111111111");
		RazoarPayCardnoExpiryDate.sendKeys("1025");
		RazoarPayCardnoCVV.sendKeys("123");
		RazoarPayCardnoName.sendKeys("sameer");
		RazoarPayButton.click();
	}
	
	public static void PaymentviaUpi()
	{
		UPIField.sendKeys("sameer@ybl");
		UPIPayButton.click();
		
	}
	
	public static void SelectPaymentMethod(String PaymentMethod) throws InterruptedException
	{
		if(PaymentMethod.equalsIgnoreCase("Razorpay"))
		{
			PaymentMethods.get(1).click();
			PaymentviaRazorPay();
			Thread.sleep(3000);
        }
		else if(PaymentMethod.equalsIgnoreCase("UPI"))
		{
			PaymentMethods.get(2).click();
			PaymentviaUpi();
			Thread.sleep(3000);
		}
		else if(PaymentMethod.equalsIgnoreCase("Paytm"))
		{
			PaymentMethods.get(0).click();
			PayTmPaymentCreditCard();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void PaytmPaymentScenario(String paymentscenario)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfAllElements(ChoosePaymentScenario));
		 Actions a=new Actions(driver);
		if(paymentscenario.equalsIgnoreCase("Success"))
		{
			a.moveToElement(ChoosePaymentScenario.get(0)).click().build().perform();
			//ChoosePaymentScenario.get(0).click();
		}
		else if(paymentscenario.equalsIgnoreCase("Failure"))
		{
			ChoosePaymentScenario.get(1).click();
		}
		else
		{
			System.out.println("No Payment Scenario");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void RazorpaypaymentScenario(String paymentScenario) throws InterruptedException {

		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				if (paymentScenario.equalsIgnoreCase("Success")) {
					RazorPaySuccessButton.click();

				} else if (paymentScenario.equalsIgnoreCase("Failure")) {

					RazorPayFailureButton.click();

				}

			}

		}
		driver.switchTo().window(MainWindow);
	}
	
	*/


