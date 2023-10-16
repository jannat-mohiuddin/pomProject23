package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomertTest {
	
	WebDriver driver;
	
	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboard = "Dashboard";
	String AddCustomer = "Add Contact";
	String fullname = "Selenium";
	String company = "Techfios";
	String email = "demo@techfios1.com";

	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage(dashboard);
		dashboardPage.clickOnCustomerButton();
		dashboardPage.clickOnAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddCustomerPage(AddCustomer);
		addCustomerPage.insertFullName(fullname);
		addCustomerPage.insertCompany(company);
		addCustomerPage.insertEmail(email);
	}

}
