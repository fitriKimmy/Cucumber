package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/CucumberEssential/linkedincourse/cucumber/features/MenuManagement.feature",
		glue = "stepdefinitions",
		tags= "not @NightlyBuild",
		plugin = "pretty"
		)
public class MenuManagementTest {

}
