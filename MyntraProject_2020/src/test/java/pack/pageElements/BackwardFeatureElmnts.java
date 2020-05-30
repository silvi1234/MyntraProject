package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackwardFeatureElmnts {
	@FindBy (xpath = "//p[@class='FreeShippingBanner-sidebar-content']")
	public WebElement sidebarbtn;
	
	@FindBy (xpath = "//div[@class='FreeShippingBanner-text']")
	public WebElement signupbtn;
	
	//@FindBy ()
	//public WebElement

}