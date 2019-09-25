package ustTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class UstRunner {
@RunWith(Cucumber.class)
	
	@CucumberOptions(

			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucmber-report.html/",
					"json:target/cucumber-reports/cucumber-report.json/","junit:target/cucumber-reports/junit-report.xml"},
			dryRun=false,
			features ={"src/test/resources/features"},
			glue ="ustdefinition",
			monochrome=true)
	
	public class edgeopsApiTestRunner extends AbstractTestNGCucumberTests {


	}
		

	}



