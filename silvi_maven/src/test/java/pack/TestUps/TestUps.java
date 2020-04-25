package pack.TestUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pack.ActionsUps.UpsActions;
import pack.DriverUps.UpsShippingDriver;

public class TestUps  extends UpsShippingDriver {

	WebDriver driver = getChromeDriver();
	UpsActions actions = new UpsActions (this.driver);
	final String URL ="https://www.ups.com/ship/guided/origin?";
	@BeforeMethod
	public void beforeMethod () {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button")).click();
	}
	@Test 
	public void ShippingTest () {
		actions.inputCountryName("United States");
		actions.inputName("Silvi yeasmin");
		actions.inputContactName("SY");
		actions.inputAddress1("463 E 9th street");
		actions.inputAddress2("same");
		actions.inputAddress3("same");
		actions.inputCity("Brooklyn");
		actions.inputZipcode("11218");
		actions.inputState("New York");
		actions.inputEmail("silvi.yasmin@yahoo.com");
		actions.inputPhone("7037894281");
		actions.inputExtension("9866");
		actions.inputCheckbox();
		actions.inputContinueButton();
	}
	
	@AfterMethod 
	public void afterMethod () {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.close();
	}
}
