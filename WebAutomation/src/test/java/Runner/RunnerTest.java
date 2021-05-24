package Runner;



import java.io.File;


import io.cucumber.junit.CucumberOptions;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.sorting.SortingMethod;






	
	@RunWith(Cucumber.class)
	@CucumberOptions(features= "src/test/resources/Features/frontend/SmokeTest.feature",
	glue={"steps"},
	tags="@test",		
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "pretty","json:target/cucumber-reports/Cucumber.json", 
			  "junit:target/cucumber-reports/Cucumber.xml",
			  "html:target/cucumber-reports/htmlreports.html"},
			   monochrome=true)

      
		
	public class RunnerTest 
	{	
		@BeforeClass
		public static void logger() {
			  PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/main/java/Resources/log4j.properties");

		}

		@AfterClass
		public static void JVMreports() {
			File reportOutputDirectory = new File("target/JVM");
			List<String> jsonFiles = new ArrayList<String>();
			jsonFiles.add("target/cucumber-reports/Cucumber.json");
			String buildNumber = "1";
			String project = "gudsho";
			Configuration configuration = new Configuration(reportOutputDirectory, project);
			configuration.setBuildNumber(buildNumber);
			configuration.addClassifications("Environment", "QA");
			configuration.addClassifications("Browser", "Chrome");
			configuration.addClassifications("Platform", "Windows 10");
			configuration.setSortingMethod(SortingMethod.NATURAL);
			ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
			reportBuilder.generateReports();
			
		}
		
	}


