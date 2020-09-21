package stepdefinitions;
import static org.junit.Assert.assertTrue;

import CucumberEssential.linkedincourse.cucumber.BillCalculationHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class ScenarioOutlineSteps {
	int initialBillAmount;
	double taxRate;
	
	@Given("I have Customer")
	public void i_have_customer() {
	}

	@Given("user enter initial amount as {int}")
	public void user_enter_initial_amount_as(Integer initialBillAmount) {
		this.initialBillAmount = initialBillAmount;
	}

	@Given("sales tax rate is {int} percent")
	public void sales_tax_rate_is_tax_rate_percent(Integer taxRate) {
		this.taxRate = taxRate;
		System.out.println("Tax Rate"+ this.taxRate);
	}
	
	@Then("final bill amount calculate is {int}")
	public void final_bill_amount_calculate_is(Integer expectedValue) {
		double systemCalculatedValue = BillCalculationHelper.CalculateBillForCustomer(this.initialBillAmount, this.taxRate);
		System.out.println("Expected Value "+expectedValue);
		System.out.println("System Value "+systemCalculatedValue);
		assertTrue(systemCalculatedValue == expectedValue);
	}

}
