package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckAvlbltyElemnts {

@FindBy (xpath ="//img[@class='image-image undefined image-hand']")
public WebElement expandbtn;

@FindBy (xpath="//input[@placeholder='Enter Pincode']")
public WebElement pincodebtn;

@FindBy (xpath="//a[contains(@class,'check-delivery-availability-pinCodeSubmit')]")
public WebElement checkbtn;

@FindBy (xpath="//div[@class='check-delivery-availability-heading']")
public WebElement getwarningTxt;

@FindBy (xpath="//a[@class='check-delivery-availability-button']")
public WebElement continuebrowsing;



}
