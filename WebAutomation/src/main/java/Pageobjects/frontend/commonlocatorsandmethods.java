package Pageobjects.frontend;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import Resources.BaseSetup;

public class commonlocatorsandmethods extends BaseSetup {
	
	
	
	//Home Page- Watch List Elements and Methods-start
	static By ShoCradShareButton=By.xpath("//div[@class='slider-content hovered']/swiper/div/app-gud-card/div/div/div[2]/div/div/div/div[2]"); 
	static By WatchListRow=By.xpath("//app-gud-shocial[@class='ng-star-inserted']/div/div/app-gud-slider[2]/div/div[2]/swiper/div/app-gud-card");
	static By WatchListRowShoCard=By.xpath("//app-gud-shocial[@class='ng-star-inserted']/div/div/app-gud-slider[2]/div/div[2]/swiper/div/app-gud-card/div");
	static By ShoNameonShoCard=By.xpath("//div[@class='slider-content hovered']/swiper/div/app-gud-card/div/div/div[2]/div/div/h5");
	static By ShoCardWatchListButton=By.xpath("//div[@class='slider-content hovered']/swiper/div/app-gud-card/div/div/div[2]/div/div/div/div[1]");
	
	
	public static void shocardwatchlist(String shoname) throws InterruptedException
	{
		WebElement watchlist=driver.findElement(WatchListRow);
		for(int i=0;i<watchlist.findElements(WatchListRowShoCard).size();i++)
		{
			Actions a =new Actions(driver);
			a.moveToElement(driver.findElements(WatchListRowShoCard).get(i)).build().perform();
			Thread.sleep(500);
			if(watchlist.findElement(ShoNameonShoCard).getText().equalsIgnoreCase(shoname))
			{
				watchlist.findElement(ShoCardWatchListButton).click();
				break;
			}
			
		}
	}	
		
		public static String shocardwatchlistShoName(String shoname) throws InterruptedException
		{
			String Shonameonshocard = null;
			WebElement watchlist=driver.findElement(WatchListRow);
			for(int i=0;i<watchlist.findElements(WatchListRowShoCard).size();i++)
			{
				Actions a =new Actions(driver);
				a.moveToElement(driver.findElements(WatchListRowShoCard).get(i)).build().perform();
				Thread.sleep(500);
				if(watchlist.findElement(ShoNameonShoCard).getText().equalsIgnoreCase(shoname))
				{
					Shonameonshocard= watchlist.findElement(ShoNameonShoCard).getText();
					break;
				}
				
			}
			return Shonameonshocard;
	}
	
	//Home Page-Watch List Elements and Methods -End
	
	
  
	
	
	
	public static void scrolldownm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Object lastHeight = js.executeScript("return document.body.scrollHeight");
			while (true) {
				js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);
				Object newHeight = js.executeScript("return document.body.scrollHeight");
				if (newHeight.equals(lastHeight)) {
					break;
				}
				lastHeight = newHeight;
			       }
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
