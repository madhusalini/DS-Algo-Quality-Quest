Feature: LinkedList Page 

#Introduction link

    Scenario: The user is able to navigate to Introduction link page
    Given The user is on the Linked List page after logged in
    When The user clicks Introduction link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Introduction Link page
   Given The user is on the Linked List page after logged in
    When The user clicks Introduction link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Creating Linked List Link

    Scenario: The user is able to navigate to Creating Linked List link page
    Given The user is on the Linked List page after logged in
    When The user clicks Creating Linked List link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Creating Linked List Link page
    Given The user is on the Linked List page after logged in
    When The user clicks Creating Linked List link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message


#Types of Linked List Link

    Scenario: The user is able to navigate to Types of Linked List link page
    Given The user is on the Linked List page after logged in
    When The user clicks Types of Linked List link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
   
   
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Types of Linked List Link page
    Given The user is on the Linked List page after logged in
    When The user clicks Types of Linked List link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message


#Implement Linked List in Python Link

    Scenario: The user is able to navigate to Implement Linked List in Python link page
    Given The user is on the Linked List page after logged in
    When The user clicks Implement Linked List in Python link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Implement Linked List in Python Link page
    Given The user is on the Linked List page after logged in
    When The user clicks Implement Linked List in Python link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message


#Traversal Link

    Scenario: The user is able to navigate to Traversal link page
    Given The user is on the Linked List page after logged in
    When The user clicks Traversal link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
  
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Traversal Link page
    Given The user is on the Linked List page after logged in
    When The user clicks Traversal link
    And The user clicks Try Here button
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message


#Insertion Link

    Scenario: The user is able to navigate to Insertion link page
    Given The user is on the Linked List page after logged in
    When The user clicks Insertion link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
   
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Insertion Link page
    Given The user is on the Linked List page after logged in
    When The user clicks Insertion link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message


#Deletion Link

    Scenario: The user is able to navigate to Deletion link page
    Given The user is on the Linked List page after logged in
    When The user clicks Deletion link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Deletion Link page
    Given The user is on the Linked List page after logged in
    When The user clicks Deletion link
    And The user clicks Try Here button 
    When The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Practice Page    

    Scenario: The user is able to navigate to Practice page
    Given The user is on the Linked List page after logged in
    When The user clicks Deletion link
    And The user clicks Practice Questions link
    Then The user should be redirected to Practice page of LinkedList




 