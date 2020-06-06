package pack.stepDefn;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.SubscribeFeatureAction;

public class SubscribeFeatureStepDefn {
	SubscribeFeatureAction actn= new SubscribeFeatureAction();
	
	@When("^Customer clicks on Blog$")
	public void customer_clicks_on_Blog() throws Exception {
	  actn.blogButton();
	    
	}

	@When("^Customer inputs Email address$")
	public void customer_inputs_Email_address() throws Exception {
	  
	    actn.inputEmail();
	}

	@When("^Customer clicks on Subscribe button$")
	public void customer_clicks_on_Subscribe_button() throws Exception {
		actn.subscribeBtn();
	}
	   


	@Then("^Customer can see confirmation message$")
	public void customer_can_see_confirmation_message() throws Exception  {
		actn.confirmationMsg();
	  
	}


}
