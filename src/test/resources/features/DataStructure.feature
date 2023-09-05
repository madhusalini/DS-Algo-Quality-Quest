@DataStructureFeature
Feature: DataStructure Page

#Time Complexity Link
  
    Scenario: The user is able to navigate to Time Complexity page and run python code
    Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
     Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with error message
    
 #Practice Page    

    Scenario: The user is able to navigate to Practice page
     Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity link
    And The user clicks Practice Questions link
    Then The user should be redirected to Practice page of Data Structure