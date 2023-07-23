package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomPage;

public class RepeatedCode_if_else {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");		
		
		LoginPage loginPage =new LoginPage(driver);
		loginPage.clickmessenger();
		
		MessengerPage messenger = new MessengerPage(driver);
		messenger.clickroomButton();
	
		Thread.sleep(5000);
		RoomPage roomPage = new RoomPage(driver);
		roomPage.clickvisitHelpCenter();
		
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		if(url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre")) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("false");
		}
		
		/*LoginPage loginPage =new LoginPage(driver);
		loginPage.clickmessenger();
		
		MessengerPage messenger = new MessengerPage(driver);
		messenger.clickroomButton();
	
		Thread.sleep(5000);
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
		
		driver.close();*/
		
	}

}
