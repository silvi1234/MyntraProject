package pack.stepDefn;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.CheckAvlbltyAction;

public class CheckAvailabilityStepDefn {
	CheckAvlbltyAction actn = new CheckAvlbltyAction();
	
	@When("^Customer click on the expand sign of the homepage$")
	public void customer_click_on_the_expand_sign_of_the_homepage() throws Exception  {
	   actn.cliclExpandbtn();
	   
	}

	@When("^Customer inputs the pincode in the textbox$")
	public void customer_inputs_the_pincode_in_the_textbox() throws Exception  {
	   
	   actn.inputTextbox();
	}

	@When("^Customer clicks on CHECK button$")
	public void customer_clicks_on_CHECK_button() throws Exception  {
	   
	   actn.checkBtn();
	}

	@When("^Customer gets a warning message$")
	public void customer_gets_a_warning_message() throws Exception  {
	   
	   actn.warningMsg();
	   
	}

	@Then("^Customer clicks on CONTINUE BROWSING$")
	public void customer_clicks_on_CONTINUE_BROWSING() throws Exception  {
	  
	   actn.continueBtn();
	}


}
