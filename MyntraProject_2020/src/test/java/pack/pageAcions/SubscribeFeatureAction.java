package pack.pageAcions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.SubscribeFeatureElemnts;

public class SubscribeFeatureAction {
	
	SubscribeFeatureElemnts elem;
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
	
 public SubscribeFeatureAction() {
	 this.elem = new SubscribeFeatureElemnts() ;
		PageFactory.initElements(SetupDriver.chromeDriver, elem);
}
 public void blogButton() throws Exception {
	 ((JavascriptExecutor) SetupDriver.chromeDriver)
     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 action.moveToElement(elem.blogbtn).build().perform();
	Thread.sleep(2000);
	elem.blogbtn.click();
	
	 
 }
 public void inputEmail() throws Exception {
	 Thread.sleep(200);
	 
	 for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
			SetupDriver.chromeDriver.switchTo().window(winHandle);
	   }
	Thread.sleep(3000);
	 js.executeScript("arguments[0].scrollIntoView();", elem.inputemail);
	elem.inputemail.sendKeys("silvisnigdha09@gmail.com");	 
 }
 public void subscribeBtn () throws Exception {
	 Thread.sleep(2000);
	 
	 js.executeScript("arguments[0].scrollIntoView();", elem.subscribebtn);
	 Thread.sleep(2000);
	 elem.subscribebtn.click();
 }
 public void confirmationMsg() throws Exception {
	 
	 for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
			SetupDriver.chromeDriver.switchTo().window(winHandle);
	   }
	 Thread.sleep(2000);
	 elem.confirmsg.getText();
 }
 
 
 
 
 
 
}