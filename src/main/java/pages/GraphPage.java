package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage {
	private WebDriver driver;
	 
	//Get Started
	 @FindBy(xpath = "//h5[text()='Graph']/../a") WebElement graphGetStartbtn;
	 
	 
	 //Links
	 @FindBy(linkText = "Graph") WebElement graphlink ;
	 @FindBy(linkText = "Graph Representations") WebElement graphRepresentationlink ;
	 	 	 
	 //Graph Headings
	 @FindBy(className = "list-group-item") WebElement graphPageHeading;
	 @FindBy(xpath = "//a [text()='Graph Representations']")WebElement graphRepresentationsHeading;
	 
	// Constructor for Graph Page
		 public GraphPage(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);	        
		    }
	
	
	 
	//Methods of clicking links
	 public void clickgetstartbtn() {
		 graphGetStartbtn.click();
	 }
	 public void clickGraphLink() {
		 graphlink.click();
	 }
	 public void clickgraphrepresentation() {
		 graphRepresentationlink.click();
	 }
	
	 
	//Methods for verifying pages
	
		 public void verifyGraphPage() {
			 String displayedPageheadingtext= graphlink.getText();
			 String ExpectedPageheadingtext= graphPageHeading.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
		 }
		 
		 public void verifyGraphlinkPage() {
		 String displayedPageheadingtext=graphPageHeading.getText();
		 String ExpectedPageheadingtext= graphlink.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
	 }
	 
	 public void verifyGraphRepresentationPage() {
		 String displayedPageheadingtext=graphRepresentationsHeading.getText();
		 String ExpectedPageheadingtext= graphRepresentationlink.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
	 }

	

}



