package pack.pageAcions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.BackwardFeatureElmnts;


public class BackwardFeatureAction {
	
	 BackwardFeatureElmnts elmnt;
	 Actions action = new Actions(SetupDriver.chromeDriver);
		JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
		
	public 	BackwardFeatureAction() {
		 this.elmnt = new  BackwardFeatureElmnts();
		   PageFactory.initElements(SetupDriver.chromeDriver, elmnt);
	}
		
		public void sideBanner() throws Exception {
			Thread.sleep(2000);
			action.moveToElement(elmnt.sidebarbtn).build().perform();
			elmnt.sidebarbtn.click();
		}
		public void signUpBtn() throws Exception {
			Thread.sleep(2000);
			elmnt.signupbtn.click();
		}
		
		public String getLoginPage() throws Exception {
			  for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
					SetupDriver.chromeDriver.switchTo().window(winHandle);
			   }
			  Thread.sleep(2000);
			String loginPage =  SetupDriver.chromeDriver.getCurrentUrl();
			  return loginPage;
			
		}
		public void nevigatebackward() throws Exception {
			Thread.sleep(2000);
			SetupDriver.chromeDriver.navigate().back();
		}
		public String backToHomepage() throws Exception {
			Thread.sleep(2000);
			String pageTitle = SetupDriver.chromeDriver.getTitle();
			   return pageTitle;
		   }
			
		
		

}
