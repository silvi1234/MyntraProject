package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenShopElements {
	@FindBy (xpath ="//a[contains(text(),'Women')]")
	 public WebElement womenTab;
	@FindBy (xpath ="//a[contains(text(),'Shrugs')]")
	 public WebElement shrugTab;
	@FindBy (xpath ="//div[@class='vertical-filters-filters brand-container']")
	 public WebElement brandTab;
	@FindBy (xpath = "//label[contains(text(),'FOREVER 21')]")
	public WebElement selectbrand;
	@FindBy (xpath ="//div[@class='search-searchProductsContainer row-base']")
	public WebElement imagesection;
	@FindBy (xpath ="//li[1]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	public WebElement imageTab;
//	@FindBy (xpath ="//div[@class='pdp-details common-clearfix']")
//	public WebElement sizesection;
	@FindBy (xpath ="//div[@class='size-buttons-size-buttons']//div[2]//div[1]//button[1]")
	public WebElement sizebtn;
	@FindBy (xpath ="//div[contains(text(),'ADD TO BAG')]")
	public WebElement addtobagbtn;
	@FindBy (xpath = "//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
	public WebElement bagIcon;

}
