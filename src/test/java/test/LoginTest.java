package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboard = "Dashboard";

	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		
		
		BrowserFactory.init();
		/*
		 * when we call the init method, driver from BroserFactory class will be //also
		 * called here and then we have to make a relation between the driver //of
		 * LoginTest and the driver of BrowserFactory. //First we have to save
		 * BrowserFactory.init() in a variable(WebDriver) then get rid of the local
		 * declaration.
		 */

		// WebDriver driver = BrowserFactory.init();
		driver = BrowserFactory.init();
		
		// in the below line, we are making object of LoginPage
		// evoking pageFactory.initElement as constructor
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage(dashboard);
		
		
		BrowserFactory.tearDown();

	}

}
