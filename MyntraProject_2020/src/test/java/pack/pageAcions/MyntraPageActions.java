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
		
		//WebDriver driver =SetupDriver.getChromeDriver();
		//MyntraPageActions actions = new MyntraPageActions (this.driver);
		this.elements = new MyntraPageElements ();
		PageFactory.initElements(SetupDriver.driver, elements);
		
	}
	
	public void getMyntrahomepage() {
		
		WebDriver driver =SetupDriver.getChromeDriver();
		SetupDriver.driver.get("https://www.myntra.com");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		
	}
	public void getsearchbutton() {
		elements.searchbutton.clear();
		elements.searchbutton.sendKeys("Tshirts");
	}
	public void Entersearchbutton() {
		
	  
		elements.searchbutton.sendKeys(Keys.ENTER);
		
	}
	public String displaydsearchItem () {
		String tshirttext = elements.displayItem.getText();
	    return tshirttext;
	}
	
	
	public String HomepagePageTitle(){
		String HomePageTitle =  SetupDriver.driver.getTitle();
		return HomePageTitle;
	}
	

}
