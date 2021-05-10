package Pageobjects.frontend;

import java.util.List;


import org.openqa.selenium.JavascriptExecutor;


import Resources.BaseSetup;

public class commonlocatorsandmethods extends BaseSetup {
	
	
	
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
