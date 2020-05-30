package pack.stepDefn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pack.pageAcions.TshirtActionPage;

public class MyntraTshirtStepDef {
TshirtActionPage StepElement=new TshirtActionPage();
	
	
	
	
	@Given("^Myntra homepage launched$")
	public void myntra_homepage_launched() throws Throwable {
		StepElement.getHomePage();
		
		
		
		
		
	    
	}

	@When("^Customer mouse over the men link$")
	public void customer_mouse_over_the_men_link() throws Throwable {
		StepElement.MenLink();
	    
	}

	@When("^Customer click the T-shirt$")
	public void customer_click_the_T_shirt() throws Throwable {
		StepElement.Tshirt();
	    
	}

	@When("^Customer Click the roadster brand$")
	public void customer_Click_the_roadster_brand() throws Throwable {
		StepElement.Brand();
	    
	}

	@When("^Customer Click the brushprint tshirt$")
	public void customer_Click_the_brushprint_tshirt() throws Throwable {
		StepElement.style();
	   
	}

	@When("^Customer click the large size$")
	public void customer_click_the_large_size() throws Throwable {
		StepElement.size();
	   
	}

	@When("^Customer click the add to bag$")
	public void customer_click_the_add_to_bag() throws Throwable {
		StepElement.AddBag();
	   
	}

	@When("^Customer click the Go to bag$")
	public void customer_click_the_Go_to_bag() throws Throwable {
		StepElement.GoToBag();
	   
	}

	@When("^Customer Click the Place order$")
	public void customer_Click_the_Place_order() throws Throwable {
		StepElement.PlaceOrder();
	    
	}

	@When("^Customer will be ask for the mobile number$")
	public void customer_will_be_ask_for_the_mobile_number() throws Throwable {
		
		StepElement.Verification();
	}


}
