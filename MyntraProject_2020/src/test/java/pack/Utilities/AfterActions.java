package pack.Utilities;


import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;

public class AfterActions {

	
	@After
	public void afterActions() {
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.tearDownChromeDriver();
	}

}
