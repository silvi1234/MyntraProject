package pack.pageAcions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.SearchingOutLineScenerioElements;

public class SearchingOutlineScenerioAction {

	SearchingOutLineScenerioElements elements;
	public  SearchingOutlineScenerioAction()
	{
		this.elements=new  SearchingOutLineScenerioElements();
		PageFactory.initElements(SetupDriver.chromeDriver, elements);
	}

	public void getHomePage() {

		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
public void SearchBox( )
{elements.SearchBox.click();

}
public void Product(String str)
{elements.SearchBox.sendKeys(str);
}

public void searchicon()
{elements.SeacrhIcon.click();

}
	

}
