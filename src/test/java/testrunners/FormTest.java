package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/CucumberEssential/linkedincourse/cucumber/features/Formy.feature",
		glue = "stepdefinitions",
		tags = "@Checkbox",
		plugin = {"pretty", 
				"html:target/SystemTestReports/html",
				"json:target/SystemTestReports/json/report.json",
				"junit:target/SystemTestReports/junit/report.xml"},
		monochrome = true,
		dryRun = false
		)
public class FormTest {

}
