package pack.DriverUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsShippingDriver {

	public WebDriver getChromeDriver () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\silvi\\Desktop\\seleniumxpath\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
