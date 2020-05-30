package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.BackwardFeatureAction;

public class BackwardFeatureStepDEfn {

	BackwardFeatureAction actn = new BackwardFeatureAction();
	
	@When("^Customer Clicks on Flat discount banner triangle icon$")
	public void customer_Clicks_on_Flat_discount_banner_triangle_icon() throws Exception {
	   actn.sideBanner();
	  
	}

	@When("^Customer clicks on sign up button$")
	public void customer_clicks_on_sign_up_button() throws Exception {
	   
	  actn.signUpBtn();
	}

	@When("^Customer lands to sign up page$")
	public void customer_lands_to_sign_up_page() throws Exception {
		actn.getLoginPage();
	   
	  
	}
	@When("^Customer nevigates to homepage$")
	public void customer_nevigates_to_homepage() throws Exception  {
		actn.nevigatebackward();
	   
	}

	@Then("^Customer susseccfully comes back to the homepage$")
	public void customer_susseccfully_comes_back_to_the_homepage() throws Exception  {
		String actualTitle = actn.backToHomepage();
		   String expectedTitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		   System.out.println("Items dispalyed successfully : " + expectedTitle);
		   Assert.assertEquals(actualTitle, expectedTitle);
	  
	}


}
