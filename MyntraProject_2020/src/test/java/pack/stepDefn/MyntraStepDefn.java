package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.MyntraPageActions;

public class MyntraStepDefn {

	MyntraPageActions action = new MyntraPageActions();

	@Given("^Myntra Homepage is launched\\.$")
	public void myntra_Homepage_is_launched() throws Exception {
		action.getMyntrahomepage();
	}

	@When("^Customer types \"([^\"]*)\" on search text box$")
	public void customer_types_on_search_text_box(String Searchbox) throws Exception {
		action.getsearchbutton(Searchbox);
	}

	@Then("^Customer press enter button$")
	public void customer_click_on_enter_button() throws Exception {

		action.Entersearchbutton();
	}

	@Then("^Customer should be able to see searched items successfully\\.$")
	public void customer_should_be_able_to_see_searched_items_successfully() throws Exception {

		//String expectedTitle = "T-shirts For Men & women";
		
		String expectedTitle = action.displaydsearchItem();
		//Assert.assertEquals(actualTitle, expectedTitle);

		System.out.println("page title is :" + expectedTitle);

	}

	@When("^Customer types random items in the \"([^\"]*)\"$")
	public void customer_types_random_items_in_the(String Searchbox) throws Exception {

		action.getsearchbutton(Searchbox);
	}

	@When("^Customer press enter$")
	public void customer_press_enter() throws Exception {

		action.Entersearchbutton();
	}

}
