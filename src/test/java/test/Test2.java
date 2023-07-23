package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomPage;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickmessenger();
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.clickroomButton();
		
		RoomPage roomPage = new RoomPage(driver);
		roomPage.clickreturnButton();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://www.messenger.com/") &&  title.equals("Messenger")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
