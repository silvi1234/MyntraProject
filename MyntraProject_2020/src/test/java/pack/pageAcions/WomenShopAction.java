package pack.pageAcions;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import pack.Utilities.SetupDriver;
import pack.pageElements.WomenShopElements;

public class WomenShopAction {

	WomenShopElements pageelements;
	
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
	
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
	public void shrugTab()  {
		pageelements.shrugTab.click();
	}

public void brandsection() {
	    action.moveToElement(pageelements.brandTab).build().perform();
	}
public void brandclick() throws Exception {
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", pageelements.selectbrand); 
	//pageelements.selectbrand.click();
	
}
public void randomitemclicked() throws Exception  {

    Thread.sleep(2000);
	action.moveToElement(pageelements.imagesection).build().perform();
	js.executeScript("arguments[0].click();", pageelements.imageTab); 
	//pageelements.imageTab.click();
	
	}
public String newpagedisplayed()  {
	
	String getpagetitle = SetupDriver.chromeDriver.getTitle();
	return getpagetitle;
	}

public void size() {
	
	for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
		SetupDriver.chromeDriver.switchTo().window(winHandle);
	}
	pageelements.sizebtn.click();
	
}

public void AddtoBag() throws Exception {
	Thread.sleep(2000);
	//pageelements.addtobagbtn.click();
	 js.executeScript("arguments[0].click();", pageelements.addtobagbtn); 
}
public void mouseOver() throws Exception {
	  Thread.sleep(4000);
    action.moveToElement(pageelements.bagbtn).build().perform();
    pageelements.bagbtn.click();
}
public void cartPageApplyCoupon() throws Exception {
	Thread.sleep(4000);
	for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
		SetupDriver.chromeDriver.switchTo().window(winHandle);
	}
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	action.moveToElement(pageelements.applycoupn).build().perform();
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	pageelements.applycoupn.click();

}
public void couponTextbox() throws Exception {
	action.moveToElement(pageelements.textbox).build().perform();
	Thread.sleep(3000);
	pageelements.inputtext.clear();
	pageelements.inputtext.sendKeys("wzcq1234nm");
	Thread.sleep(4000);
	
}
public void clickApplyBtn() {
	//action.moveToElement(pageelements.clickapply).build().perform();
	pageelements.clickapply.click();
}
public void errorMsg() throws Exception {
 // return pageelements.errormsg.getText();		
	String getMsg = pageelements.errormsg.getText();
	System.out.println("Warning messsge:" +  getMsg);
	Thread.sleep(2000);
	
	TakesScreenshot scrShot =((TakesScreenshot)SetupDriver.chromeDriver);
	File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
	Path srcFilePath = Paths.get(scrFile.getAbsolutePath());
	Path destDir = Paths.get("C:\\Users\\silvi\\git\\repository\\MyntraProject_2020\\WarningMsg.png");
	Files.copy(srcFilePath, destDir, StandardCopyOption.REPLACE_EXISTING);
	
}
public void closeButton() throws Exception {
	Thread.sleep(2000);
	pageelements.applyBtn.click();
	
//	File srcFile = ((TakesScreenshot)SetupDriver.chromeDriver).getScreenshotAs(OutputType.FILE);   
//	File destDir= new File("c:\\Users\\silvi\\ErrorMasgscreenshot.png");
//	try {
//		
//		FileUtils.copyFile(srcFile, destDir);
//	
//	} 
//	catch(IOException e) {
//		System.out.println("Screenshot unable");
//	}		
//	Thread.sleep(5000);
//		   pageelements.applyBtn.click();
		 
}
}



