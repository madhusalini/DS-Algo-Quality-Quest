Feature: Queue Page

#Implementation of Queue in Python link

    Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Implementation of Queue in Python link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
     
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Implementation of Queue in Python page
     Given The user is on the Queue Introduction after logged in
    When The user clicks Implementation of Queue in Python link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Implementation using collections.deque link

    Scenario: The user is able to navigate to Implementation using collections.deque link page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Implementation using collections.deque link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
       
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Implementation using collections.deque page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Implementation using collections.deque link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Implementation using array link

Scenario: The user is able to navigate to Implementation using array link page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Implementation using arraylink
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
       
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Implementation using array page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Implementation using arraylink
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Queue Operations

    Scenario: The user is able to navigate to Queue Operations link page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Queue Operations link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
      
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Queue Operations page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Queue Operations link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message

#Practice Page    

    Scenario: The user is able to navigate to Practice page
    Given The user is on the Queue Introduction after logged in
    When The user clicks Queue Operations link
    And The user clicks Practice Questions link
    Then The user should be redirected to Practice page of Queue
