package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import CucumberEssential.linkedincourse.cucumber.RestaurantMenuItem;
import CucumberEssential.linkedincourse.cucumber.RestaurantMenu;


public class MenuManagement {
	
	RestaurantMenuItem restaurantMenuitem;
	RestaurantMenu menu = new RestaurantMenu();
	
	@Given("I have menu item with name {string} with price {int}")
	public void i_have_menu_item_with_name_with_price(String newMenuname, int price) {
	    restaurantMenuitem = new RestaurantMenuItem(newMenuname, "", price);
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
	   menu.addMenuItem(restaurantMenuitem);
	}

	@Then("menu item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
	    boolean exist = menu.DoesItemExist(restaurantMenuitem);
	    System.out.println("Menu Exist : "+exist);
	}
	
}
