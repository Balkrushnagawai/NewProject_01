package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomPage {
	//Declaration
	@FindBy (xpath=" //a[text()=' Return to messenger.com '] ") 
	private WebElement returnButton;
	
	@FindBy (xpath = "//a[text()=' Visit our help center '] ") 
	private WebElement visitHelpCenter;
	
	//Initiation
	public RoomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//use
	
	public void clickreturnButton() {
		returnButton.click();
	}
	
	public void clickvisitHelpCenter() {
		visitHelpCenter.click();
	}
	
	
}
