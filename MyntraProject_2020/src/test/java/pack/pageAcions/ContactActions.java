package pack.pageAcions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pack.Utilities.SetupDriver;
import pack.pageElements.ContactElements;

public class ContactActions {
	ContactElements Elements;
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
	
	
	public ContactActions() {
		this.Elements = new ContactElements();
		PageFactory.initElements(SetupDriver.chromeDriver, Elements);
	}

	
	public void contactus() throws Exception {
		
		 ((JavascriptExecutor) SetupDriver.chromeDriver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 action.moveToElement(Elements.contactus).build().perform();
		Thread.sleep(4000);
		Elements.contactus.click();
		Thread.sleep(4000);
	}
	public void frequentlyasked() throws Exception {
		 for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
				SetupDriver.chromeDriver.switchTo().window(winHandle);
		   }
		Thread.sleep(2000);
		action.moveToElement(Elements.frequentlyasked).build().perform();
		Elements.frequentlyasked.click();
	}

    public void verificationquestion() throws Exception {
    	 ((JavascriptExecutor) SetupDriver.chromeDriver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	
    	Thread.sleep(2000);
    	action.moveToElement(Elements.verificationquestion).build().perform();
    	Thread.sleep(1000);
    	Elements.verificationquestion.click();
    	Thread.sleep(2000);
    }
    
   public void textdisplay() throws Exception{
    	Thread.sleep(2000);
    	Elements.textdisplay.click();
    	Thread.sleep(2000);
    }
    
 
   
	

}
