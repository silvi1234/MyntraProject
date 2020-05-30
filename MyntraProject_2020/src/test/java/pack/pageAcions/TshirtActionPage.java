package pack.pageAcions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pack.Utilities.SetupDriver;
import pack.pageElements.TshirtPageElement;

public class TshirtActionPage {
TshirtPageElement element;
	
	public TshirtActionPage()
	{ this.element=new TshirtPageElement();
	PageFactory.initElements(SetupDriver.chromeDriver, element);
	
	}
	Actions action=new Actions(SetupDriver.chromeDriver);
	public void getHomePage() {

		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
public void MenLink()
{ action.moveToElement(element.MenSec).build().perform();

}
public void Tshirt()

{
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	element.Tshirt.click();

}
public void Brand()
{
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	action.moveToElement(element.BrandCont).build().perform();
element.Roadster.click();
}
public void style()
{
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	element.Roundneck.click();

for(String winHandle : SetupDriver.chromeDriver.getWindowHandles())
{SetupDriver.chromeDriver.switchTo().window(winHandle);
}
}
public void size()
{ 
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	action.moveToElement(element.SizeCont).build().perform();
element.Largesize.click();
}
public void AddBag()
{
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	element.Addtobag.click();

}
 public void GoToBag()
 { 
	 SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 element.Gotobag.click();
 
 }
 public void PlaceOrder()
 { 
	 SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	 action.moveToElement(element.orderCont).build().perform();
 element.Placeorder.click();
 }
	public void Verification()
	{
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String expectedPageTitle="Myntra";
	String actualPageTitle=SetupDriver.chromeDriver.getTitle();
	Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}
	
	

}
