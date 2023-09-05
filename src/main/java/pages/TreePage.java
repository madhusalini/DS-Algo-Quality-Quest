package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {
	private WebDriver driver;
	
	//Get Started
	 @FindBy(xpath = "//h5[text()='Tree']/../a") WebElement GetStartedTree;
	
//PageLinks expected
	 @FindBy(linkText= "Tree") WebElement TreePage;
	 @FindBy(linkText = "Overview of Trees") WebElement OverviewofTrees ;
	 @FindBy(linkText= "Terminologies") WebElement Terminologies;
	 @FindBy(linkText= "Types of Trees") WebElement TypesOfTrees;
	 @FindBy(linkText= "Tree Traversals") WebElement TreeTraversals;
	 @FindBy(linkText= "Traversals-Illustration") WebElement TraversalIllustration;
	 @FindBy(linkText= "Binary Trees") WebElement BinaryTrees;
	 @FindBy(linkText= "Types of Binary Trees") WebElement TypesofBinaryTrees ;
	 @FindBy(linkText= "Implementation in Python") WebElement ImplementationinPython ;
	 @FindBy(linkText= "Binary Tree Traversals") WebElement BinaryTreTraversals ;
	 @FindBy(linkText= "Implementation of Binary Trees") WebElement ImplementationofBinaryTrees ;
	 @FindBy(linkText= "Applications of Binary trees") WebElement ApplicationsofBinarytrees ;
	 @FindBy(linkText= "Binary Search Trees") WebElement BinaSearchTree ;
	 @FindBy(linkText= "Implementation Of BST") WebElement ImplementationOfBST ;
	 @FindBy(linkText= "Practice Questions") WebElement PractQues ;
	
	 
	 //Heading displayed
	 @FindBy(xpath = "// p [text()='Overview of Trees']")WebElement headingOverviewofTrees;
	 @FindBy(xpath ="// p [text()='Terminologies']" )WebElement headingTerminologies;
	 @FindBy(xpath ="// p [text()='Types of Trees']" )WebElement headingTypesofTrees;
	 @FindBy(xpath ="// p [text()='Tree Traversals']" )WebElement headingTreeTraversals;
	 @FindBy(xpath ="// p [text()='Traversals-Illustration']" )WebElement headingTraversalsIllustration;
	 @FindBy(xpath ="// p [text()='Binary Trees']" )WebElement headingBinaryTrees;
	 @FindBy(xpath ="// p [text()='Types of Binary Trees']" )WebElement headingTypesofBinaryTrees;
	 @FindBy(xpath ="// p [text()='Implementation in Python']" )WebElement headingImplementationinPython;
	 @FindBy(xpath ="// p [text()='Binary Tree Traversals']" )WebElement headingBinaryTreeTraversals;
	 @FindBy(xpath ="// p [text()='Implementation of Binary Trees']" )WebElement headingImplementationofBinaryTrees;
	 @FindBy(xpath ="// p [text()='Applications of Binary trees']" )WebElement headingApplicationsofBinarytrees;
	 @FindBy(xpath ="// p [text()='Binary Search Trees']" )WebElement headingBinarySearchTrees;
	 @FindBy(xpath ="// p [text()='Implementation Of BST']" )WebElement headingImplementationOfBST;
	
	
	// Constructor for Tree Page
	 
	 public TreePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);	        
	    }
	 

	//Methods of clicking link 
	 public void clickGetStartedTree() {
		 GetStartedTree.click();
	 }
			
	public void clickOverviewofTrees()	{
		OverviewofTrees.click();
	}
	public void clickTerminologies() {
		Terminologies.click();
	}
	public void clickTypesOfTrees() {
		TypesOfTrees.click();
	}
	public void clickTreeTraversals() {
		TreeTraversals.click();
	}
	public void clickTraversalIllustration() {
		TraversalIllustration.click();
	}
	 public void clickBinaryTrees() {
		 BinaryTrees.click();
	 }
	 public void clickTypesofBinaryTrees() {
		 TypesofBinaryTrees.click();
	 }
	 public void clickImplementationinPython() {
		 ImplementationinPython.click();
	 }
	 public void clickBinaryTreTraversals() {
		 BinaryTreTraversals.click(); 
	 }
	 public void clickImplementationofBinaryTrees() {
		 ImplementationofBinaryTrees.click();
	 }
	 public void clickApplicationsofBinarytrees() {
		 ApplicationsofBinarytrees.click();
	 }
	 public void ClickBinarySearchtrees() {
		 BinaSearchTree.click();
	 }
	 public void clickImplementationOfBST() {
		 ImplementationOfBST.click();
	 }
	 public void clickPractQues() {
		 PractQues.click();
	 }
	
	 
		//Methods for verifying pages
	 public void verifyTreePage() {
		 String displayedPageheadingtext= GetStartedTree.getText();
		 String ExpectedPageheadingtext= TreePage.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 
	 public void verifyOverviewofTrees() {
		 String displayedPageheadingtext= headingOverviewofTrees.getText();
		 String ExpectedPageheadingtext= OverviewofTrees.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect page displayed";
	 }
	 public void verifyTerminologies() {
		 String displayedPageheadingtext= headingTerminologies.getText();
		 String ExpectedPageheadingtext= Terminologies.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifytypesoftrees() {
		 String displayedPageheadingtext=headingTypesofTrees .getText();
		 String ExpectedPageheadingtext= TypesOfTrees.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifytreetraversals() {
		 String displayedPageheadingtext= headingTreeTraversals.getText();
		 String ExpectedPageheadingtext= TreeTraversals.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifytaversalillustration() {
		 String displayedPageheadingtext=headingTraversalsIllustration .getText();
		 String ExpectedPageheadingtext= TraversalIllustration.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifybinarytrees() {
		 String displayedPageheadingtext= headingBinaryTrees.getText();
		 String ExpectedPageheadingtext= BinaryTrees.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifytypesofbinarytree() {
		 String displayedPageheadingtext=headingTypesofBinaryTrees.getText();
		 String ExpectedPageheadingtext= TypesofBinaryTrees.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifyimplementationinpython() {
		 String displayedPageheadingtext=headingImplementationinPython.getText();
		 String ExpectedPageheadingtext= ImplementationinPython.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifybinarytreetraversals() {
		 String displayedPageheadingtext=headingBinaryTreeTraversals .getText();
		 String ExpectedPageheadingtext=BinaryTreTraversals.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifyimplementationofbinarytree() {
		 String displayedPageheadingtext= headingImplementationofBinaryTrees.getText();
		 String ExpectedPageheadingtext= ImplementationofBinaryTrees.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifyapplicationsofbinarytree() {
		 String displayedPageheadingtext=headingApplicationsofBinarytrees .getText();
		 String ExpectedPageheadingtext= ApplicationsofBinarytrees.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void  vreifyBinarysearchtree() {
		 String displayedPageheadingtext= headingBinarySearchTrees.getText();
		 String ExpectedPageheadingtext=BinaSearchTree.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 public void verifyimplementationofBST() {
		 String displayedPageheadingtext=headingImplementationOfBST .getText();
		 String ExpectedPageheadingtext= ImplementationOfBST.getText();
		 assert displayedPageheadingtext.equals(ExpectedPageheadingtext):"Incorrect Page Displayed";
	 }
	 
	 
	 
		
}
