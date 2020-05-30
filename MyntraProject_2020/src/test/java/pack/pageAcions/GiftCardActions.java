package pack.pageAcions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.GiftCardElements;

public class GiftCardActions {
	GiftCardElements elemnts;
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;

public 	GiftCardActions() {
	this.elemnts = new GiftCardElements();
	PageFactory.initElements(SetupDriver.chromeDriver, elemnts);
}
public void profileBtn() throws Exception {
	Thread.sleep(2000);
	action.moveToElement(elemnts.profilebtn).build().perform();
}
public void giftCardBtn() throws Exception {
	Thread.sleep(2000);
	elemnts.giftcardbtn.click();
}
public void inputCardnPinNo() throws Exception {
	for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
		SetupDriver.chromeDriver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView();", elemnts.cradframe);
	Thread.sleep(2000);
	elemnts.inputcardno.clear();
	elemnts.inputcardno.sendKeys("1234567890987654");
	Thread.sleep(2000);
	elemnts.inputpin.clear();
	elemnts.inputpin.sendKeys("123456");
	
}
public void checkBlnce() throws Exception {
	Thread.sleep(2000);
	
	 action.moveToElement(elemnts.checkblnc).build().perform();
	 elemnts.checkblnc.click();
	
}
public  String newWindow() throws Exception {
	for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
		SetupDriver.chromeDriver.switchTo().window(winHandle);
	}
	Thread.sleep(2000);
	String pageTitle = SetupDriver.chromeDriver.getTitle();
	   return pageTitle;
	   
	
}

	
		
	
	
	
	
	
	
}
