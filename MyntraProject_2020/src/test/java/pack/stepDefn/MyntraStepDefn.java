package pack.stepDefn;



import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.MyntraPageActions;

public class MyntraStepDefn {
	
	MyntraPageActions action = new MyntraPageActions ();
	
	@Given("^Myntra Homepage is launched\\.$")
	public void myntra_Homepage_is_launched()  {
	    action.getMyntrahomepage();
	    action.HomepagePageTitle();
	  
	}
	
	@When("^Customer types Shirts on search text button$")
	public void customer_types_Shirts_on_search_text_button()   {
	       
	       action.getsearchbutton();
	}

	@Then("^Customer press enter button$")
	public void customer_click_on_enter_button() {
		
		
	       action.Entersearchbutton();
	       
	}

	@Then("^Customer should be able to see searched items successfully\\.$")
	public void customer_should_be_able_to_see_searched_items_successfully()   {
		
		
		String displayMessage = action.displaydsearchItem();
		System.out.println(displayMessage);
		boolean bool = false;
		if(displayMessage.equalsIgnoreCase("T-shirts For Men & women")) {
			bool = true;
		}
		Assert.assertEquals(bool, true);
	       
	}


}
