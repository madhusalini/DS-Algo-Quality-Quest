package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

private WebDriver driver;

	//1.Locators- login page 
         String loginUrl= "https://dsportalapp.herokuapp.com/login";
	     @FindBy(id = "id_username") WebElement loginusername;
		 @FindBy(id = "id_password") WebElement loginpassword;
		 @FindBy(xpath = "//input[@value='Login']") WebElement loginbtn;
		 @FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]") WebElement loginErrMsg;
		 
		 
	//2. Constructor for Login Page
		 public LoginPage(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);	        
		    }
		 
		 
	//3.Page Actions
		  
		 public void openLoginPage() {
				driver.get(loginUrl);	 
			 }
			 public void enterLoginUsername(String username) {
				loginusername.sendKeys(username);	 
			 }
	 
			 public void enterLoginPassword(String password) {
				 loginpassword.sendKeys(password);	 
			 }
			 
			 public void clickLoginBtn() {
				 loginbtn.click();	 
			 }
		
			
	
			 public void verifyLoginPage() {
				 String currentUrl= driver.getCurrentUrl();
				 String expectedUrl= loginUrl;	 			
				 assert currentUrl.equals(expectedUrl): "Incorrect page displayed";
			 } 
			 
			public void usernameFieldValidationMsg() {	
				 String displayedErrMsg= loginusername.getAttribute("validationMessage");
				 String expectedErrMsg= "Please fill out this field.";	 			
				 assert displayedErrMsg.equals(expectedErrMsg): "Incorrect page displayed";			
				 }
			
			public void passwordFieldValidationMsg() {	
				 String displayedErrMsg= loginpassword.getAttribute("validationMessage");
				 String expectedErrMsg= "Please fill out this field.";	 			
				 assert displayedErrMsg.equals(expectedErrMsg): "Incorrect page displayed";			
				 }
			
			 public void loginErrMsgUsername() {	
				 String displayedErrMsg= loginErrMsg.getText();
				 String expectedErrMsg= " Please check your user id";	 			
				 assert displayedErrMsg.equals(expectedErrMsg): "Incorrect page displayed";			  
				 }
			 
			 public void loginErrMsgPassword() {	
				 String displayedErrMsg= loginErrMsg.getText();
				 String expectedErrMsg= " Please check your password";	 			
				 assert displayedErrMsg.equals(expectedErrMsg): "Incorrect page displayed";			  
				 }
			 
			 public void userLogin(String username, String password) {	
				 driver.get(loginUrl);
				 loginusername.sendKeys(username);	
				 loginpassword.sendKeys(password);
				 loginbtn.click();	 
				 }
			 			 
}
