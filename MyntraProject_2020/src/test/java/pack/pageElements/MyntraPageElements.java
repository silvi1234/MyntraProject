package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraPageElements {

	@FindBy (xpath = "//input[@placeholder='Search for products, brands and more']")
	public WebElement searchbutton;
	
	@FindBy (className ="title-title")
	public WebElement displayItem ;
	
}
