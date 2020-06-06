package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscribeFeatureElemnts {
   @FindBy(xpath="//a[text()='Blog']")
     public WebElement blogbtn;
   
   @FindBy(xpath="//input[@placeholder='Your Email']")
	public WebElement inputemail;
	   
	@FindBy(xpath ="//input[@id='es_subscription_form_submit_1574939129']")
	 public WebElement subscribebtn;
	@FindBy(xpath ="//span[@id='es_subscription_message_1574939129']")
	 public WebElement confirmsg;
}
