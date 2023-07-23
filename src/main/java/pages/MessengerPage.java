package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
	@FindBy (xpath="//a[text()='Rooms']" )
	private WebElement roomButton;
	
	@FindBy (xpath="//a[text()='Features']" )
	private WebElement featuresButton;
	
	public MessengerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickroomButton() {
		roomButton.click();
	}
		
	public void clickfeatures() {
		featuresButton.click();
	}
		
	}


