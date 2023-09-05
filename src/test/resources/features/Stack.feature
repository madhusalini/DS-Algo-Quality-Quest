Feature: Stack Page

#Operations in Stack link

    Scenario: The user is able to navigate to Operations in Stack link page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Operations in Stack link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
      
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Operations in Stack page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Operations in Stack link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Implementation Link

    Scenario: The user is able to navigate to Implementation link page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Implementation link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
       
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Implementation page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Implementation link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message
    
#Applications Link

    Scenario: The user is able to navigate to Applications link page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Applications link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
       
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Applications page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Applications link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message


 #Practice Page    

    Scenario: The user is able to navigate to Practice page
    Given The user is on the Stack Introduction after logged in
    When The user clicks Applications link
    And The user clicks Practice Questions link
    Then The user should be redirected to Practice page of Stack
   
