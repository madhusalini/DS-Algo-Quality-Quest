package pages;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ArrayPage {
	
		private WebDriver driver;
	
	 @FindBy(xpath = "//h5[text()='Array']/../a") WebElement arrayGetStartedbtn;
	 @FindBy(xpath = "//a[text()='Array']") WebElement arrayDropdown;
	
	 
	 //Links in Array Pages
	
	 @FindBy(linkText="Arrays in Python") WebElement arrayInPythonLink;
	 @FindBy(linkText="Arrays Using List") WebElement arrayUsingList;
	 @FindBy(linkText="Basic Operations in Lists") WebElement basicOperationsinListLink;
	 @FindBy(linkText="Applications of Array") WebElement applicationsOfArrayLink;
	
	 
	 //Headings in Array Pages
	 @FindBy(xpath = "//p[text()='Array']") WebElement arrayPageHeading;
	 @FindBy(xpath="//p[text()='Arrays']") WebElement arraysDisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Arrays in Python']") WebElement arraysInPythondisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Arrays Using List']") WebElement arraysUsingListdisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Basic Operations in Lists']") WebElement basicOperationsInListsPageheading;
	 @FindBy(xpath = "//p[text()='Applications of Array']") WebElement applicationsOfArraydisplayedPageheading;
	 
	 // Practice Page 
	 @FindBy(linkText = "Search the array") WebElement searchTheArrayLink;
	 @FindBy(linkText = "Max Consecutive Ones") WebElement maxConsecutiveOnesLink;
	 @FindBy(linkText = "Find Numbers with Even Number of Digits") WebElement findEvenNumberDigitsLink;
	 @FindBy(xpath="//a[text()='Squares of  a Sorted Array']") WebElement squaresSortedArrayLink;
	 @FindBy(xpath="//pre[text()='Submission Successful']") WebElement submissionSuccessMsg;
	 
	//Practice Question Links
		 String practicepageurl= "https://dsportalapp.herokuapp.com/array/practice";
		 String question1Url= "https://dsportalapp.herokuapp.com/question/1";
		 String question2Url= "https://dsportalapp.herokuapp.com/question/2";
		 String question3Url= "https://dsportalapp.herokuapp.com/question/3";
		 String question4Url= "https://dsportalapp.herokuapp.com/question/4"; 
		 
	//Practice Page editor
			@FindBy(id ="editor") WebElement practicePageEditor;
			 @FindBy(xpath = "//button[text()='Run']") WebElement runBtn;
			  @FindBy(xpath = "//input[@value='Submit']") WebElement submitBtn;
			 	  
			
	//2. Constructor for Array Page
	 public ArrayPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);	        
	    }
	 
	 //3.Page Actions
	 public void clickarrayGetStartedbtn()	{
		 arrayGetStartedbtn.click();
		}
	 public void clickarrayDropdown()	{
		 arrayDropdown.click();
		}
	 public void clickarrayInPythonLink()	{
		 arrayInPythonLink.click();
		}
	 public void clickarrayUsingListLink()	{
		 arrayUsingList.click();
		}
	 public void clickbasicOperationsinListLink()	{
		 basicOperationsinListLink.click();
		}
	 public void clickapplicationsOfArrayLink()	{
		 applicationsOfArrayLink.click();
		}
	
	 public void clicksearchTheArrayLink()	{
		 searchTheArrayLink.click();
		}
	 
	 public void clickmaxConsecutiveOnesLink()	{
		 maxConsecutiveOnesLink.click();
		}
	 
	 public void clickfindEvenNumberDigitsLink()	{
		 findEvenNumberDigitsLink.click();
		}
	 
	 public void clicksquaresSortedArrayLink()	{
		 squaresSortedArrayLink.click();
		}
	 
	 public void clickSubmitBtn()	{
		  submitBtn.click();
			}
	 
	 public void enterPracticeEditorCode(String code)	 {
		 practicePageEditor.clear();
		  practicePageEditor.sendKeys(code);			
		  }
	 public void clearPracticeEditorCode()	 {
		  practicePageEditor.clear();			
		  }
	 
	 public void verifyPracticeEditorPage() {
		 assertTrue(runBtn.isDisplayed(), "Run button is not displayed on the website.");
		 assertTrue(submitBtn.isDisplayed(), "Submit button is not displayed on the website.");
	 }
	 
	 
	 public void verifyarrayPage() {
		 String displayedPageheadingtext= arraysDisplayedPageheading.getText();
		 String ExpectedPageheadingtext= arrayPageHeading.getText();
		 Assert.assertEquals(displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
	 }
	 
// Link Pages
	 
	 public void verifyArrayInPythonPage() {
		 String displayedPageheadingtext= arraysInPythondisplayedPageheading.getText();
		 String ExpectedPageheadingtext= arrayInPythonLink.getText();
		 Assert.assertEquals( displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
	 }
	 
	 public void verifyarrayUsingList() {
		 String displayedPageheadingtext= arraysUsingListdisplayedPageheading.getText();
		 String ExpectedPageheadingtext= arrayUsingList.getText();
		 Assert.assertEquals( displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
	 }
	 
	 public void verifybasicOperationsinListPage() {
		 String displayedPageheadingtext= basicOperationsInListsPageheading.getText();
		 String ExpectedPageheadingtext= basicOperationsinListLink.getText();
		 Assert.assertEquals( displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
	 }
	 
	 
	 public void verifyapplicationsOfArrayPage() {
		 String displayedPageheadingtext= applicationsOfArraydisplayedPageheading.getText();
		 String ExpectedPageheadingtext= applicationsOfArrayLink.getText();
		 Assert.assertEquals( displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
	 }
	 
	 
// Practice Question Pages
	 
	 public void veriyfPracticeQuesPage() {
		 String displayedurl= driver.getCurrentUrl();
		 String Expectedurl= practicepageurl ;
		 Assert.assertEquals(displayedurl,Expectedurl,"Incorrect page displayed");
	 }
	 
	 public void veriyfPracticeQuesPage1() {
		 String displayedurl= driver.getCurrentUrl();
		 String Expectedurl= question1Url ;
		 Assert.assertEquals(displayedurl,Expectedurl,"Incorrect page displayed");
	 }
	 
	 public void veriyfPracticeQuesPage2() {
		 String displayedurl= driver.getCurrentUrl();
		 String Expectedurl= question2Url ;
		 Assert.assertEquals(displayedurl,Expectedurl,"Incorrect page displayed");
	 }
	 
	 public void veriyfPracticeQuesPage3() {
		 String displayedurl= driver.getCurrentUrl();
		 String Expectedurl= question3Url ;
		 Assert.assertEquals(displayedurl,Expectedurl,"Incorrect page displayed");
	 }
	 
	 public void veriyfPracticeQuesPage4() {
		 String displayedurl= driver.getCurrentUrl();
		 String Expectedurl= question4Url ;
		 Assert.assertEquals(displayedurl,Expectedurl,"Incorrect page displayed");
	 }
	 
	 
	 

}
