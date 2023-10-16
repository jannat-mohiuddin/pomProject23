package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	//in the below, we are returning WebDriver so that when init method will be called,
	//in LoginTest class driver will be evoked also in the class LoginTest
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
	} 
	
	public static void tearDown() throws InterruptedException {
		driver.close();
		driver.quit();
		Thread.sleep(2000);
	}
}
