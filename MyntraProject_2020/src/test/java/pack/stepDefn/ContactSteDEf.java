package pack.stepDefn;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.ContactActions;

public class ContactSteDEf {

	ContactActions stepdf = new ContactActions();
	
	@When("^click on contact us$")
	public void click_on_contact_us() throws Exception {
	   stepdf.contactus();
	  
	}

	@Then("^click on frequently asked questions$")
	public void click_on_frequently_asked_questions() throws Exception {
	   
	  stepdf.frequentlyasked();
	}

	@Then("^customer scrolled down and click to view Email verification policy$")
	public void customer_scrolled_down_and_click_to_view_Email_verification_policy() throws Exception {
	   
	  stepdf.verificationquestion();
	}

	@Then("^customer should be able to view the policy message\\.$")
	public void customer_should_be_able_to_view_the_policy_message() throws Exception {
	   
	  stepdf.textdisplay();
	}

}
