package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	//@FindBy (xpath="//a[@aria-current='page']")
	//private WebElement homeLogo;
	
	@FindBy (xpath="//a[@aria-label='Friends']") 
	private WebElement frndLogo;
	
	@FindBy (xpath = "//a[@aria-label='Groups']") 
	private WebElement groupLogo;
	
	@FindBy (xpath = "//a[@aria-label='More']") 
	private WebElement moreLogo;
	
	@FindBy (xpath="//div[@aria-label='Create']") 
	private WebElement crtLogo;
	
	@FindBy (xpath = "//div[@aria-label='Messenger']") 
	private WebElement msgLogo;
	
	@FindBy (xpath = "//a[@aria-label='Notifications, 3 unread']") 
	private WebElement noticeLogo;
	
	@FindBy (xpath = "//span[text()='Welcome to Facebook, Krishna']") 
	private WebElement welcomeText;
	
	@FindBy (xpath="//span[text()='Add Picture']") 
	private WebElement addfrnd;
	
	//Initiation
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Use 
	//public void clickhomelogo() {
		//homeLogo.click();
	//}
	
	public void clickfrndLogo() {
		frndLogo.click();
	}
	
	public void clickgroupLogo() {
		groupLogo.click();
	}
	
	public void clickmoreLogo() {
		moreLogo.click();
	}
	
	public void clickcrtLogo() {
		crtLogo.click();
	}
	public void clickmsgLogo() {
		msgLogo.click();
	}
	
	public void clicknoticelogo() {
		noticeLogo.click();
	}
	
	public void homePage() {
		//homeLogo.click();
		frndLogo.click();
		groupLogo.click();
		moreLogo.click();
		crtLogo.click();
		msgLogo.click();
		noticeLogo.click();
		
	}
}
	
	
	



	
	




