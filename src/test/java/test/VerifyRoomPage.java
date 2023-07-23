package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomPage;

public class VerifyRoomPage {
	private LoginPage loginPage;
	private WebDriver driver;
	private RoomPage roomPage;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniun\\chromedriver_win32 (1)\\chromedriver.exe");
		/*WebDriver*/ driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		LoginPage loginPage =new LoginPage(driver);
		loginPage.clickmessenger();
		
		MessengerPage messenger = new MessengerPage(driver);
		messenger.clickroomButton();
	
		Thread.sleep(5000);
		/*RoomPage*/ roomPage = new RoomPage(driver);
	}
	@Test
	public void test1 () {
		System.out.println("Test1");
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
		
	}
	@Test
	public void test2 () {
		System.out.println("Test2");
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
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		System.out.println("LOGOUT");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.close();
	}

}
