package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactElements {

	@FindBy (xpath ="//div[@class='desktop-usefulLinks']//a[1]")
	public WebElement contactus;
	
	@FindBy (xpath ="//div[@class='sideBar-queryText']")
	public WebElement frequentlyasked;
	
	@FindBy (xpath ="//div[contains(text(),\"What is Myntra's E-mail verification policy?\")]")
	public WebElement verificationquestion;
	
	@FindBy (xpath ="//p[contains(text(),'We always strive hard to provide the best experien')]")
	public WebElement textdisplay;

}
