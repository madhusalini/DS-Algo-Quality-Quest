Feature: Graph Page

#Graph Link

    Scenario: The user is able to navigate to Graph link page
    Given The user is on the Graph Introduction after logged in
    When The user clicks Graph link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
   Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Graph page
    Given The user is on the Graph Introduction after logged in
    When The user clicks Graph link
    And The user clicks Try Here button 
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message
    
 #Graph Representations Link     
 
 Scenario: The user is able to navigate to Graph Representations link page
    Given The user is on the Graph Introduction after logged in
    When The user clicks Graph Representations link
    And The user clicks Try Here button 
    And The user enter valid python "code" in tryEditor from sheet
    And The user clicks on run button
    Then The user should be presented with Run result
    
    Scenario: The user is presented with error message for code with invalid syntax in tryEditor for Graph Representations page
    Given The user is on the Graph Introduction after logged in
    When The user clicks Graph Representations link
    And The user clicks Try Here button
    And The user enter python "code" with invalid syntax in tryEditor from sheet
    And The user clicks on run button
    Then  The user should be presented with error message
    
#Practice Page    

    Scenario: The user is able to navigate to Practice page
    Given The user is on the Graph Introduction after logged in
    When The user clicks Graph Representations link
    And The user clicks Practice Questions link
    Then The user should be redirected to Practice page of Graph