package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchingOutLineScenerioElements {
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[3]/input")
	public WebElement SearchBox;
	
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/div[3]/a/span")
	public WebElement SeacrhIcon;

}
