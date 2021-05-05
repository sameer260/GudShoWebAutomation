package steps;



import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;



import Resources.BaseSetup;


public class Hooks extends BaseSetup {
	 
	@Before()
	public void loginapplication() throws InterruptedException, IOException
	{
		BaseSetup.intiliazedriver();
	}	
	@After()
	public void teardown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
		  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	       scenario.attach(screenshot, "image/png", "image");
	       
		}
		driver.close();
	}

}
