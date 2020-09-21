package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantSystemHooks {
	@Before("@SmokeTest")
	public void beforeDisplayMethod(Scenario sc) {
		System.out.println("Before "+ sc.getName());
	}

	@After("@SmokeTest")
	public void afterDisplayMethod() {
		System.out.println("After");			
	}
}
