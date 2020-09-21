package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FormySteps {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("User open form")
	public void user_open_form() {
		System.getProperty("webdriver.chrome.driver", "/Users/fitri.manurung/Workspace/Tools/chromedriver");
        driver.get("https://formy-project.herokuapp.com/checkbox");
	}

	@Then("User test Checkbox")
	public void user_test_checkbox() {
		WebElement cb1 = driver.findElement(By.cssSelector("#checkbox-1"));
        cb1.click();

        WebElement cb2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        cb2.click();

        WebElement cb3 = driver.findElement(By.id("checkbox-3"));
        cb3.click();
        
        driver.quit();
	}
}
