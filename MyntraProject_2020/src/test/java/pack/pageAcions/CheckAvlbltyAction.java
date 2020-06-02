package pack.pageAcions;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.CheckAvlbltyElemnts;


public class CheckAvlbltyAction {
	 CheckAvlbltyElemnts  chkelemn;
	 Actions action = new Actions(SetupDriver.chromeDriver);
		JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
		
	public CheckAvlbltyAction() {
		this.chkelemn = new CheckAvlbltyElemnts ();
		PageFactory.initElements(SetupDriver.chromeDriver, chkelemn);
	}
	public void cliclExpandbtn() throws Exception {
		Thread.sleep(2000);
		action.moveToElement(chkelemn.expandbtn).build().perform();
		chkelemn.expandbtn.click();
	   }
	
	public void inputTextbox() throws Exception {
		  for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
				SetupDriver.chromeDriver.switchTo().window(winHandle);
		   }
		  Thread.sleep(2000);
		  action.moveToElement(chkelemn.pincodebtn).build().perform();
		  chkelemn.pincodebtn.sendKeys("1234567");	  
	}
	public void checkBtn() throws Exception {
		Thread.sleep(2000);
		action.moveToElement(chkelemn.checkbtn).build().perform();
		js.executeScript("arguments[0].click();",  chkelemn.checkbtn);
		
		  //chkelemn.checkbtn.click();
	}
	public void warningMsg() throws Exception {
		Thread.sleep(2000);
		
		String getMsg = chkelemn.getwarningTxt.getText();
		System.out.println("Warning messsge:" +  getMsg);
		Thread.sleep(2000);
		
		TakesScreenshot scrShot =((TakesScreenshot)SetupDriver.chromeDriver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		Path srcFilePath = Paths.get(scrFile.getAbsolutePath());
		Path destDir = Paths.get("C:\\Users\\silvi\\git\\repository\\MyntraProject_2020\\WarningMsg.png");
		Files.copy(srcFilePath, destDir, StandardCopyOption.REPLACE_EXISTING);
	
		
	}
public void continueBtn() throws Exception {
	Thread.sleep(2000);
	action.moveToElement(chkelemn.continuebrowsing).build().perform();
	  chkelemn.continuebrowsing.click();
		
	}
	
	
	

}
