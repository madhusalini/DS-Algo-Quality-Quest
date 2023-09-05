Feature: Array Page

#Arrays In Python Page

    Scenario: User is able to navigate to Arrays in Python page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the Arrays in Python link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result 
          
          
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
    Given The user is logged in to the DS Algo portal
    When The user clicks on the Arrays in Python link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result 
  
 
 #Arrays Using List Page
    
    Scenario: The user is able to navigate to Arrays Using List page
    Given The user is logged in to the DS Algo portal
    When The user clicks Arrays Using List link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
  
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Arrays Using List page
     Given The user is logged in to the DS Algo portal
    When The user clicks Arrays Using List link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
  
#Basic Operations in List Page 
      
    Scenario: The user is able to navigate to Basic Operations in Lists page
    Given The user is logged in to the DS Algo portal
    When The user clicks Basic Operations in Lists link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
  
   
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Basic Operations in Lists page
     Given The user is logged in to the DS Algo portal
    When The user clicks Basic Operations in Lists link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
  
   

#Applications Of Array Page 
    
    Scenario: The user is able to navigate to Applications of Array page
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
       
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
     Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    
        

#Practice Page    
      
# Question 1-Search the array link 
    
    Scenario: The user is able to navigate to Practice page
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Search the array link
    And The user enter valid python "code" in tryEditor from sheet for search the array question
    And The user clicks on run button
    Then The user should be presented with Run result
      
     Scenario: The user is able to submit code in tryEditor for search the array Ones
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Search the array link
    And The user enter valid python "code" in tryEditor from sheet for search the array question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message
    
    
    Scenario: The user is presented with error message for invalid code in tryEditor for search the array
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Search the array link
    And The user enter python "code" with invalid syntax in tryEditor from sheet for search the array question
    And The user clicks on run button
    Then The user should be presented with Run result
   

# Question 2-Max Consecutive Ones link  
   
    Scenario: The user is able to navigate to Question page of Max Consecutive Ones
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Max Consecutive Ones link
    And The user enter valid python "code" in tryEditor from sheet for search the array question
    And The user clicks on run button
    Then The user should be presented with Run result
      
    Scenario: The user is able to submit code in tryEditor for Max Consecutive Ones
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Max Consecutive Ones link
    And The user enter valid python "code" in tryEditor from sheet for max consecutive ones question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message
    
    Scenario: The user is presented with error message for invalid code in tryEditor for Max Consecutive Ones
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Max Consecutive Ones link
    When The user enter python "code" with invalid syntax in tryEditor from sheet for max consecutive ones question
    And The user clicks on run button
    Then The user should be presented with error message
 
 # Question 3- Even Numbers link 
   
    Scenario: The user is able to navigate to Question page from Find Numbers with Even Number of Digits
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Find Numbers with Even Number of Digits link
    And The user enter valid python "code" in tryEditor from sheet for search the array question
    And The user clicks on run button
    Then The user should be presented with Run result
    
    
    Scenario: The user is able to submit code in tryEditor for Find Numbers with Even Number of Digits
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Find Numbers with Even Number of Digits link
    And The user enter valid python "code" in tryEditor from sheet for even number question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Find Numbers with Even Number of Digits link
    And The user enter python "code" with invalid syntax in tryEditor from sheet for even number question
    And The user clicks on run button
    Then The user should be presented with error message
    
 # Question 4- Squares Of Sorted Array link     
 
    Scenario: The user is able to navigate to Question page from Squares of a Sorted Array
   Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Squares of a Sorted Array link
    And The user enter valid python "code" in tryEditor from sheet for search the array question
    And The user clicks on run button
    Then The user should be presented with Run result
   
    
    Scenario: The user is able to submit code in tryEditor for Squares of a Sorted Array
   Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Squares of a Sorted Array link
    And The user enter python "code" with valid syntax in tryEditor from sheet for the Square sorted array question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array
    Given The user is logged in to the DS Algo portal
    When The user clicks Applications of Array link
    And The user clicks Practice Questions link
    And The user clicks the Squares of a Sorted Array link
    And The user enter python "code" with invalid syntax in tryEditor from sheet for the Square sorted array question
    And The user clicks on run button
    Then The user should be presented with error message
    
    

    
    
    
   