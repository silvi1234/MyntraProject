package pack.pageAcions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pack.Utilities.SetupDriver;
import pack.pageElements.MyntraPageElements;

public class MyntraPageActions {
	
	MyntraPageElements elements;
   
	
	public MyntraPageActions () {
		
		
		this.elements = new MyntraPageElements ();
		PageFactory.initElements(SetupDriver.chromeDriver, elements);
		
	}
	
	public void getMyntrahomepage() {
		

		SetupDriver.chromeDriver.get("https://www.myntra.com");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		
	}
	public void getsearchbutton(String str) throws Exception {
		Thread.sleep(2000);
		elements.searchbutton.clear();
		elements.searchbutton.sendKeys(str);
	}
	public void Entersearchbutton() throws Exception {
		Thread.sleep(2000);
	  
		elements.searchbutton.sendKeys(Keys.ENTER);
		
	}
	public String displaydsearchItem () throws Exception {
		Thread.sleep(2000);

	
	String HomePageTitle =  SetupDriver.chromeDriver.getTitle();
	return HomePageTitle;
 }


}
