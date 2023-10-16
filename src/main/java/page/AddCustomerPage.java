package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// element
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using =  "//*[@id=\"account\"]") WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using =  "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using =  "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	
				
	
	
public void verifyAddCustomerPage(String  Addcustomer) throws InterruptedException {
	Thread.sleep(2000);
	Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(),Addcustomer );
}
	public void insertFullName(String fullname) {
		//generateRandomNum(999);
		//concatenating random number with full name 
		FULLNAME_ELEMENT.sendKeys(fullname+generateRandomNum(999));
		
	}
	//the following method will be shifted to BasePage as a common method 
	//and then private needs to be changed into public in BasePage.
	
	/*private int generateRandomNum(int boundaryNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundaryNum);
		return generatedNum;*/
	
	public void insertCompany(String company) {
		//pass the following two to lines to the public void selectFromDropdown
	Select sel = new Select(COMPANY_ELEMENT);
		sel.selectByVisibleText(company);
		
	selectFromDropdown(COMPANY_ELEMENT, company);
	}
	
		
		
		
//		private void selectFromDropdown(WebElement COMPANY_ELEMENY, String company) {
//		
//		}
		//Make the method public
		//public void selectFromDropdown(WebElement COMPANY_ELEMENT, String company) {
//			public void selectFromDropdown(WebElement element, String VisibleText ) {
//			Select sel = new Select(element);
//			sel.selectByVisibleText(VisibleText);	
		
	
		public void insertEmail(String email) {
			generateRandomNum(999);
			EMAIL_ELEMENT.sendKeys(generateRandomNum(999) + email);	
		}
		

			
		}
	


