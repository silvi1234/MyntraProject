package pack.stepDefn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.WomenShopAction;

public class WomenShopStepDefn {
	
	
	WomenShopAction newaction = new WomenShopAction();
	
	
	@Given("^Myntra Home page is launched$")
	public void myntra_Home_page_is_launched()   {
		 newaction.getMyntraHomePage();
	     
	}

	@When("^User mouseover to the Women tab$")
	public void user_mouseover_to_the_Women_tab()   {
		 newaction.womenTab();
	     
	}

	@When("^User selects Shrug from the dropdown items$")
	public void user_selects_Shrug_from_the_dropdown_items()   {
	    
		 newaction.shrugTab();
	}


	@When("^User mouseover to brand section$")
	public void user_mouseover_to_brand_section()  {
		newaction.brandsection();
	    
	}

	@When("^clicks on FOREVER (\\d+) brand$")
	public void clicks_on_FOREVER_brand(int arg1)  {
	   newaction.brandclick();
	}


	@When("^User clicks on an item from the displayed item$")
	public void user_clicks_on_an_item_from_the_displayed_item() {
	 newaction.randomitemclicked();
	}
	@Then("^user lands on a new page$")
	public void user_lands_on_a_new_page()   {
		 newaction.newpagedisplayed();
	     
	}

	@Then("^User selects the size M$")
	public void user_selects_the_size_M ()   {
	    
		 newaction.size();
	}
	@Then("^clicks on ADD TO BAG$")
	public void clicks_on_ADD_TO_BAG() {
	    newaction.AddtoBag();
	}


	@Then("^User  mouseover to Bag and clicks on Bag$")
	public void user_mouseover_to_Bag_and_clicks_on_Bag()   {
		 newaction.gotoBag();
	     
	}

	@Then("^User lands to a new page$")
	public void user_lands_to_a_new_page()   {
	    
		 newaction.placeorderpage();
	}


}
