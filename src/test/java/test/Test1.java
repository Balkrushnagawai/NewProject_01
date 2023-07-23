package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomPage;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		
		LoginPage loginPage =new LoginPage(driver);
		loginPage.clickmessenger();
		
		MessengerPage messenger = new MessengerPage(driver);
		messenger.clickroomButton();
	
		Thread.sleep(5000);
		RoomPage roomPage = new RoomPage(driver);
		roomPage.clickvisitHelpCenter();
		
		
		System.out.println(driver.getCurrentUrl());
	
	}

}
