package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	
	private WebDriver driver;
	
     //queue page start 	
	 @FindBy(xpath = "//*[@href='queue' and @class='align-self-end btn btn-lg btn-block btn-primary']") WebElement quegetstartbtn;
	 
	 //queue page verify
	 @FindBy(xpath = "//h5[text()='Queue']/../a") WebElement queuetextabovegetstartbutton;
	 @FindBy(xpath = "//h4[text()='Queue']") WebElement queueheading;
	 
	 // Queue Page heading Links
	 
	 @FindBy(linkText = "Implementation of Queue in Python") WebElement implementofqueueinpythonlink;
	 @FindBy(linkText = "Implementation using collections.deque") WebElement implementusingcollqueuelink;
	 @FindBy(linkText = "Implementation using array") WebElement implementationusingarraylink;
	 @FindBy(linkText = "Queue Operations") WebElement queueoperationslink;
	 @FindBy(linkText = "Practice Questions") WebElement practicequestionslink;
	 
	 //Queue page heading text
	 
	 @FindBy(xpath = "//p[text()='Implementation of Queue in Python']") WebElement implemofqueueinpythonpageheading;
	 @FindBy(xpath = "//p[text()='Implementation using collections.deque']") WebElement implemusingcollectpageheading;
	 @FindBy(xpath = "//p[text()='Implementation using array']") WebElement implemusingarrpageheading;
	 @FindBy(xpath = "//p[text()='Queue Operations']") WebElement queoperationspageheading;   
	 
	//2. Constructor for queue Page
	 public QueuePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);	
	        
	    }
	  	 
	 
	 public void clkqueuegetstartbutton() {
		 quegetstartbtn.click();
	 }
	 public void clkimplementqueueinpython() {
		 implementofqueueinpythonlink.click();
	 }
	 public void clkimplementusingcollqueue() {
		 implementusingcollqueuelink.click();
	 }
	 public void clkimplemqueueusearray() {
		 implementationusingarraylink.click();
	 }
	 public void clkqueueoperations() {
		 queueoperationslink.click();
	 }
	 public void clkpracticequestions() {
		 practicequestionslink.click();
	 }
	
	
	  
	  public void verifyqueuepage() {
			 
			 String disqueuepage=queueheading.getText();
			 String expquepage=queuetextabovegetstartbutton.getText();
			 assert disqueuepage.equals(expquepage):"incorrect page displayed";
			 		 
		 }
	 public void verifypageofimplementofqueueinpython() {
		 
		 String displayqueue=implemofqueueinpythonpageheading.getText();
		 String expquep=implementofqueueinpythonlink.getText();
		 assert displayqueue.equals(expquep):"incorrect page displayed";
		 		 
	 }
    public void verifypageimplemcollect() {
		 
		 String dispquecollect=implemusingcollectpageheading.getText();
		 String collectexp=implementusingcollqueuelink.getText();
		 assert dispquecollect.equals(collectexp):"incorrect page displayed";
		 		 
	 }
    public void verifypagequeueoper() {
		 
		 String dispqueope=queoperationspageheading.getText();
		 String expusearr=queueoperationslink.getText();
		 assert dispqueope.equals(expusearr):"incorrect page displayed";
		 		 
	 }
    public void verifypageimplemusingarray() {
		 
		 String disusearr=implemusingarrpageheading.getText();
		 String expqueop=implementationusingarraylink.getText();
		 assert disusearr.equals(expqueop):"incorrect page displayed";
		 		 
	 }
     
    	 

}

