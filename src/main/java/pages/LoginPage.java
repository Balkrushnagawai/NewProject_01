package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy (xpath = "//input[@name='email']") 
	private WebElement userName;
	
	@FindBy (xpath = "//input[@type='password']") 
	private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']") 
	private WebElement loginButton;
	
	@FindBy (xpath="//a[text()='Messenger']") 
	private WebElement messenger;
	
	//Initiation
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	//Use
	public void senduserName() {
		userName.sendKeys("9511744095");
	}
	
	public void sendPassword() {
		password.sendKeys("krishna12346");
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void clickmessenger() {
		messenger.click();
	}
	
	//or 
	
	public void loginFacebook() {
		userName.sendKeys("");
		password.sendKeys("12346");
		loginButton.click();
		messenger.click();
	}
	
	
	
	
	
}
