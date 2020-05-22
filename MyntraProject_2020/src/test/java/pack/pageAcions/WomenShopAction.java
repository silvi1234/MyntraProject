package pack.pageAcions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pack.Utilities.SetupDriver;
import pack.pageElements.WomenShopElements;

public class WomenShopAction {
	Actions action = new Actions(SetupDriver.chromeDriver);
	WomenShopElements pageelements;
	
	 public WomenShopAction () {
		 this.pageelements = new WomenShopElements();
		 PageFactory.initElements(SetupDriver.chromeDriver, pageelements);
	 }
		public void getMyntraHomePage() {
	
			SetupDriver.chromeDriver.get("https://www.myntra.com");
			SetupDriver.chromeDriver.manage().window().maximize();
			SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
	public void womenTab() {
	      action.moveToElement(pageelements.womenTab).build().perform();
	}
	public void shrugTab() {
		pageelements.shrugTab.click();
	}

public void brandsection() {
	    action.moveToElement(pageelements.brandTab).build().perform();
		
		
	}
public void brandclick() {
    
	pageelements.selectbrand.click();
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public void randomitemclicked() {
	
	action.moveToElement(pageelements.imagesection).build().perform();
	pageelements.imageTab.click();
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
public void newpagedisplayed() {
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	SetupDriver.chromeDriver.switchTo().window("Buy FOREVER 21 Women Brown Solid Open Front Longline Shrug  - Shrug for Women 11549282");
}

public void size() {
	
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//action.moveToElement(pageelements.sizebtn).build().perform();
	pageelements.sizebtn.click();


}
public void AddtoBag() {
	pageelements.addtobagbtn.click();

}
public void gotoBag() {
	action.moveToElement(pageelements.bagIcon).build().perform();
	pageelements.bagIcon.click();
}
public void placeorderpage() {
	
}
		
		
}
