package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
		
	private WebDriver driver;
	
	 
	 // Linked List page Elements
	 @FindBy(xpath = "//h5[text()='Linked List']/../a") WebElement linkedListGetStartedbtn;
	 
	 //Links in Linkedlist Pages
	 @FindBy(xpath ="//a[text()='Introduction']") WebElement introductionLink;
	 @FindBy(xpath ="//a[text()='Creating Linked LIst']") WebElement creatingLinkedListLink;
	 @FindBy(xpath ="//a[text()='Types of Linked List']") WebElement typesOfLinkedListLink;
	 @FindBy(xpath ="//a[text()='Implement Linked List in Python']") WebElement implementLinkedListInPythonLink;
	 @FindBy(xpath ="//a[text()='Traversal']") WebElement traversalLink;
	 @FindBy(xpath ="//a[text()='Insertion']") WebElement InsertionLink;
	 @FindBy(xpath ="//a[text()='Deletion']") WebElement deletionLink;
	 
	 //Headings in Linked Link Pages
	 @FindBy(xpath="//h4[text()='Linked List']") WebElement linkedListDisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Introduction']") WebElement introductiondisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Creating Linked LIst']") WebElement creatingLinkedListdisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Types of Linked List']") WebElement typesOfLinkedListdisplayedPageheading;
	 @FindBy(xpath = "//p[text()='Implement Linked List in Python']") WebElement implementLinkedListInPythondislayedPageheading;
	 @FindBy(xpath="//p[text()='Traversal']") WebElement transversalDisplayedPageheading;
	 @FindBy(xpath="//p[text()='Insertion']") WebElement insertionDisplayedPageheading;
	 @FindBy(xpath="//p[text()='Deletion']") WebElement deletionDisplayedPageheading;
	 
	 
	//2. Constructor for Array Page
		 public LinkedListPage(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);	        
		    }
		 
		 public void clicklinkedListGetStartedbtn()	{
			 linkedListGetStartedbtn.click();
			}
		 public void clickintroductionLink()	{
			 introductionLink.click();
			}
		 public void clickcreatingLinkedListLink()	{
			 creatingLinkedListLink.click();
			}
		 public void clicktypesOfLinkedListLink()	{
			 typesOfLinkedListLink.click();
			}
		 public void clickimplementLinkedListInPythonLink()	{
			 implementLinkedListInPythonLink.click();
			}
		 public void clicktraversalLink()	{
			 traversalLink.click();
			}
		 public void clickInsertionLink()	{
			 InsertionLink.click();
			}
		 public void clickdeletionLink()	{
			 deletionLink.click();
			}
		 
		 public void verifylinkedListGetStartedbtn() {
			 String displayedPageheadingtext= linkedListDisplayedPageheading.getText();
			 String ExpectedPageheadingtext= linkedListGetStartedbtn.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifyintroductionLink() {
			 String displayedPageheadingtext= introductiondisplayedPageheading.getText();
			 String ExpectedPageheadingtext= introductionLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifycreatingLinkedListLink() {
			 String displayedPageheadingtext= creatingLinkedListdisplayedPageheading.getText();
			 String ExpectedPageheadingtext= creatingLinkedListLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifytypesOfLinkedListLink() {
			 String displayedPageheadingtext= typesOfLinkedListdisplayedPageheading.getText();
			 String ExpectedPageheadingtext= typesOfLinkedListLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifyimplementLinkedListInPythonLink() {
			 String displayedPageheadingtext= implementLinkedListInPythondislayedPageheading.getText();
			 String ExpectedPageheadingtext= implementLinkedListInPythonLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifytraversalLink() {
			 String displayedPageheadingtext= transversalDisplayedPageheading.getText();
			 String ExpectedPageheadingtext= traversalLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifyInsertionLink() {
			 String displayedPageheadingtext= insertionDisplayedPageheading.getText();
			 String ExpectedPageheadingtext= InsertionLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 public void verifydeletionLink() {
			 String displayedPageheadingtext= deletionDisplayedPageheading.getText();
			 String ExpectedPageheadingtext= deletionLink.getText();
			 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
		 }
		 
		 
}
