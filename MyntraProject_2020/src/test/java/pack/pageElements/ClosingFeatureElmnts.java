package pack.pageElements;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClosingFeatureElmnts {

	@FindBy (xpath ="//a[@class='desktop-main'][contains(text(),'Kids')]")
	public WebElement kidsmenutab;
	
	@FindBy (xpath ="//a[contains(text(),'H&M')]")
	public WebElement kidsbrand;
	
	@FindBy(className = "common-checkboxIndicator")
	public List<WebElement> sweatshirtt;
	
	@FindBy(xpath ="//div[@class='categories-more']")
	public WebElement morelink;
	
	@FindBy (xpath ="//html//body//div//div//div//main//div//div//section//div//div//div//div//ul//li//label[contains(text(),'Sweatshirts')]//div")
	public WebElement sweetshrtbtn;
	
	@FindBy (xpath ="//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")
	public WebElement closebtn;
	@FindBy (xpath ="//h1[@class='title-title']")
	public WebElement textitem;
}