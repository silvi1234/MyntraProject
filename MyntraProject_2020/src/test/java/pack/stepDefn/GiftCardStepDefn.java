package pack.stepDefn;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.Utilities.SetupDriver;
import pack.pageAcions.GiftCardActions;

public class GiftCardStepDefn {
	GiftCardActions actn = new GiftCardActions();
	
	
	
	@When("^Customer mouse hover to profile icon$")
	public void customer_mouse_hover_to_profile_icon() throws Exception  {
	   actn.profileBtn();
	   
	}

	@When("^Customer clicks on Gift cards$")
	public void customer_clicks_on_Gift_cards() throws Exception  {
	   
	   actn.giftCardBtn();
	}

	@When("^Customer scroll down and enters Card no and Pin number$")
	public void customer_scroll_down_and_enters_Card_no_and_Pin_number() throws Exception  {
	   actn.inputCardnPinNo();
	   
	}

	@When("^Customer clicks on check balance$")
	public void customer_clicks_on_check_balance() throws Exception  {
	   
	   actn.checkBlnce();
	}

	@Then("^Customer should be able to see a new window$")
	public void customer_should_be_able_to_see_a_new_window() throws Exception  {
		String expectedTitle = actn.newWindow();
		System.out.println("Page title is :" +  expectedTitle);
		Thread.sleep(2000);
		SetupDriver.chromeDriver.navigate().back();
	}


}
