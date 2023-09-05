package pages;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommonCode {
	
	private WebDriver driver;
	
	//1. Locators for page elements
	
	// Practice Page Url
	String practiceUrlArray= "https://dsportalapp.herokuapp.com/array/practice";
	String practiceUrlDataStructure= "https://dsportalapp.herokuapp.com/data-structures-introduction/practice";
	String practiceUrlGraph= "https://dsportalapp.herokuapp.com/graph/practice";
	String practiceUrlLinkedList= "https://dsportalapp.herokuapp.com/linked-list/practice";
	String practiceUrlQueue= "https://dsportalapp.herokuapp.com/queue/practice";
	String practiceUrlStack= "https://dsportalapp.herokuapp.com/stack/practice";
	String practiceUrlTree= "https://dsportalapp.herokuapp.com/tree/practice";
	
	//Practice Question Link
	@FindBy(xpath = "//a [text()='Practice Questions']") WebElement practiceQuesLink;
	
	//Try Here
	 @FindBy(xpath = "//a [text()='Try here>>>']") WebElement tryHereBtn;
	 String tryHerepageUrl="https://dsportalapp.herokuapp.com/tryEditor";
	 @FindBy(id ="output") WebElement tryHereErrMsg;
	 
	 //Python Code Editor
	 @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement editor;
	 
	 //Run Button in Python Editor/Practice question
	 @FindBy(xpath = "//button[text()='Run']") WebElement runBtn;
	 
	 	  
	  
//2. Constructor for page 
	  public CommonCode(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);	        
	    }
	  
//3. Page actions	
	  
	  public void clickTryHereBtn()	{
		  tryHereBtn.click();
			}
	  
	  public void clickRunBtn()	{
		  runBtn.click();
			}
	  
	  public void clickPracticeQueLink()	{
		  practiceQuesLink.click();
			}
	  
	  public void enterEditorCode(String code)	 {
		  editor.sendKeys(code);			
		  }
	  
	 
	  
	  public void verifyTryHereEditorPage() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= tryHerepageUrl;
			 Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Try Here Editor page displayed");
			 assertTrue(runBtn.isDisplayed(), "Run button is not displayed on the website.");
		 }
	  
	  public void verifyEditorResult() {
		  assertTrue(tryHereErrMsg.isDisplayed(), "Editor result is not displayed on the website.");
		 }
	  
	  public void verifyEditorErrAlert() {
		  Alert alert = driver.switchTo().alert();
		  if(alert!= null) {
		  alert.accept();
		  }
		 }
	  
	  public void verifyPracticePageArray() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlArray;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Array Practice page displayed");
			 }
	  
	  
	  public void verifyPracticePageDataStructure() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlDataStructure;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Data structure Practice page displayed");
			 
		 }
	  
	  public void verifyPracticePageGraph() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlGraph;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Graph Practice page displayed");
		 }
	  
	  public void verifyPracticePageLinkedList() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlLinkedList;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Linked List Practice page displayed");
		 }
	  
	  public void verifyPracticePageQueue() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlQueue;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Queue Practice page displayed");
		 }
	  
	  public void verifyPracticePageStack() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlStack;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Stack Practice page displayed");
		 }
	  
	  public void verifyPracticePageTree() {
			 String displayedurl= driver.getCurrentUrl();
			 String ExpectedUrl= practiceUrlTree;
			Assert.assertEquals(displayedurl,ExpectedUrl,"Incorrect Tree Practice page displayed");
		 }
	  
	 
	  
	  public void navigateBack() {
		  driver.navigate().back();
		 }
	  
	  public void clearEditor() {
		  editor.sendKeys(Keys.CONTROL,"a");
		  editor.sendKeys(Keys.DELETE);
		 }
}
