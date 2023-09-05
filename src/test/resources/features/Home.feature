 Feature: Home Page 
 
 Scenario: Verifying Register link in Home page
  Given The user is on the Home page
  When The user clicks on the register link on the signin page
  Then The user is redirected to the Registration page from the signin page
  
Scenario: Verifying Signin link in Home page
   Given The user is on the Home page
  When The user clicks sigin link
  Then The user is redirected to the Login page from the Home page
 
 
Scenario Outline: Verifying error message on clicking each dropdown value on Home Page
  Given The user is on the Home page
  When The user clicks dropdown
  And The user clicks dropdown Array in dropdown
  Then Error message is displayed: You are not logged in
  
  
  Scenario: Verifying error message on clicking Get Started buttons without signing in
  Given The user is on the Home page 
  When The user clicks on each Get Started button on the page
  Then Error message is displayed: You are not logged in