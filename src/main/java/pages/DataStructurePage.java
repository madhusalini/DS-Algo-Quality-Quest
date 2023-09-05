package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DataStructurePage {
	
	
	private WebDriver driver;
	
	// Data Structure page Elements
			 @FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a") WebElement dataStructuresGetStartedbtn;
			 @FindBy(xpath = "//[text()='Data Structures-Introduction']/../a") WebElement dataStructuresGetStartedbtn1;
			 @FindBy(xpath = "//a[text()='Time Complexity']") WebElement timeComplexitylink;
			 
			 
			 //links in Data Structure Page
			 
			 @FindBy(linkText = "Data Structures-Introduction") WebElement dataStructuresheadinglink;
			 @FindBy(xpath = "//p[text()='Time Complexity']") WebElement timeComplexitypageheading;
			 
			 
			 
			//2. Constructor for Array Page
			 public DataStructurePage(WebDriver driver) {
			        this.driver = driver;
			        PageFactory.initElements(driver, this);	        
			    }
			 
			 
			 public void clickdataStructuresGetStartedbtn()	{
				 dataStructuresGetStartedbtn.click();
				}
			 
			 
			 public void clicktimeComplexitylink()	{
				 timeComplexitylink.click();
				}
			 
			 public void verifytimeComplexitylink() {
				 String displayedPageheadingtext= timeComplexitypageheading.getText();
				 String ExpectedPageheadingtext= timeComplexitylink.getText();
				 Assert.assertEquals( displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
			 }
			 

			 public void verifyDataStructureHeadingIntro() {
				 String displayedPageheadingtext= dataStructuresGetStartedbtn.getText();
				 String ExpectedPageheadingtext= dataStructuresheadinglink.getText();
				 Assert.assertEquals( displayedPageheadingtext,ExpectedPageheadingtext,"Incorrect page displayed");
			 }
}
