package pack.stepDefn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.SearchingOutlineScenerioAction;


public class SearchingOutlineStepDef {
SearchingOutlineScenerioAction element=new SearchingOutlineScenerioAction();
	
	
	@Given("^Myntra homapage launched$")
	public void myntra_homapage_launched() throws Throwable {
		element.getHomePage();
	   
	}

	@When("^Customer click in searching box$")
	public void customer_click_in_searching_box() throws Throwable {
		element.SearchBox();
	    
	}

	@When("^Customer enter \"([^\"]*)\" in searching box$")
	public void customer_enter_in_searching_box(String ProductName) throws Throwable {
		element.Product(ProductName);
		
	    
	}

	@Then("^Customer click the search icon and land in the product page$")
	public void customer_click_the_search_icon_and_land_in_the_product_page() throws Throwable {
		element.searchicon();
	    
	}

}
