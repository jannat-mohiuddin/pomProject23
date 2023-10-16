package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import util.BrowserFactory;

public class DashboardPage extends BasePage{

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// element
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_HEADER_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMER_MENU_ELEMENT;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_MENU_ELEMENT;
	// interactable method

	public void verifyDashboardPage(String dashboard) {
		
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboard);
	}

	public void clickOnCustomerButton() throws InterruptedException {
		Thread.sleep(1000);
		CUSTOMER_MENU_ELEMENT.click();
	}

	public void clickOnAddCustomerButton() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}

}
