package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	
	WebDriver driver; 
	
	String username = "demo@techfios.com";
	String password = "abc123";
	
	public LoginPage(WebDriver driver) {//here the driver is from LoginTestand passing it to LoginPage
		//making relationship between 
		//driver(loginPage)and driver(loginTest)
		//with the keyword 'this'
		this.driver = driver;
		
	}
	
	//elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")WebElement SIGNIN_BUTTON_ELEMENT; 
    //@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement DASHBOARD_HEADER_ELEMENT;
	//interactable methods
	//we can keep the interactable methods/ corresponding methods to the elements separately
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);	
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
	
	
	//or we can keep all the interactable methods in one method.
	
	public void performLogin(String username,String password) {
		USERNAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
}
