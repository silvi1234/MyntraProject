package UpsShipping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpsShippingTest {

	WebDriver driver;

	@BeforeClass
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ups.com/ship/guided/origin?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button")).click();
	}

	@Test
	public void UpsShipping() {

		WebElement country = driver.findElement(By.xpath("//*[@id=\"origincountry\"]"));
		country.sendKeys("United States");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"originname\"]"));
		name.sendKeys("silvi");
		WebElement contactname = driver.findElement(By.xpath("//*[@id=\"origincontactName\"]"));
		contactname.sendKeys("SY");
		WebElement address1 = driver.findElement(By.xpath("//*[@id=\"originaddress1\"]"));
		address1.sendKeys("463 E 9th street");
		WebElement address2 = driver.findElement(By.xpath("//*[@id=\"originaddress2\"]"));
		address2.sendKeys("none");
		WebElement address3 = driver.findElement(By.xpath("//*[@id=\"originaddress3\"]"));
		address3.sendKeys("none");
		WebElement city = driver.findElement(By.xpath("//*[@id=\"origincity\"]"));
		city.sendKeys("Brooklyn");
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"originpostal\"]"));
		zipcode.sendKeys("11218");
		;
		WebElement state = driver.findElement(By.xpath("//*[@id=\"originstate\"]"));
		state.sendKeys("New York");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"originemail\"]"));
		email.sendKeys("Silviy@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"originphone\"]"));
		phone.sendKeys("7037894281");
		WebElement extension = driver.findElement(By.xpath("//*[@id=\"originextension\"]"));
		extension.sendKeys("9866");
		WebElement checkbox = driver.findElement(By.cssSelector(
				"#ups-main > div.ups-form_wrap.ups-wrap.ups-application_wrapper.ups-app_nbs > app > ng-component > div > div > div > div > ng-component > section > origin > agent > section > div:nth-child(2) > common-checkbox > div > div > label"));
		checkbox.click();
		WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"nbsBackForwardNavigationContinueButton\"]"));
		continuebutton.click();
	}

	@AfterClass
	public void afterTest() {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.close();

	}

}
