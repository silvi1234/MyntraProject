package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPageElement {
	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a")	
	public WebElement MenSec;

	@FindBy(xpath="//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a")
	public WebElement Tshirt;
	@FindBy(xpath="//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[3]")
	public WebElement BrandCont;
	@FindBy(xpath="//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label/div")
	public WebElement Roadster;
	@FindBy(xpath="//*[@id='desktopSearchResults']/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")
	public WebElement Roundneck;
	@FindBy(xpath="//*[@id='sizeButtonsContainer']/div[2]")
	public WebElement SizeCont;
	@FindBy(xpath="//*[@id='sizeButtonsContainer']/div[2]/div[3]/div[1]/button/p")
	public WebElement Largesize;
	@FindBy(xpath="//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")
	public WebElement Addtobag;
	@FindBy(xpath="//*[@id='mountRoot']/div/div/div/main/div[2]/div[2]/div[3]/div/a/span[1]")
	public WebElement Gotobag;
	@FindBy(xpath="//*[@id='appContent']/div/div/div/div/div/div[2]")
	public WebElement orderCont;
	@FindBy(xpath="//*[@id='appContent']/div/div/div/div/div/div[2]/div[3]/a/div")
	public WebElement Placeorder;

	

}
