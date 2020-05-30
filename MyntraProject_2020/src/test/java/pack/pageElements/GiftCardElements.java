package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardElements {
	@FindBy (xpath ="//span[contains(text(),'Profile')]")
	public WebElement  profilebtn;
	@FindBy (xpath ="//div[contains(text(),'Gift Cards')]")
	public WebElement giftcardbtn;
	@FindBy (xpath ="//body/div[@id='mountRoot']/div[@class='index-base']/div[contains(@class,'styles-page')]/div[@class='styles-receive styles-actionsCard']/div[1]/div[1]")
    public WebElement cradframe;
	@FindBy (xpath ="//input[@id='cardNumber']")
	public WebElement inputcardno;
	@FindBy (xpath ="//input[@id='pin']")
	public WebElement inputpin;
	@FindBy (xpath="//body/div[@id='mountRoot']/div[@class='index-base']/div[contains(@class,'styles-page')]/div[@class='styles-receive styles-actionsCard']/div/div/div[5]")
	public WebElement checkframe;
	@FindBy (xpath ="//button[@class='checkbalance-balanceGo checkbalance-balance']")
	public WebElement checkblnc;

}
