package pack.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetupDriver {
	
	
	public static WebDriver driver;

	public static void setupChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}

	public static WebDriver getChromeDriver() {
		
		return driver;
		
	}

	public static void tearDownChromeDriver() {
		driver.quit();
	}


}
