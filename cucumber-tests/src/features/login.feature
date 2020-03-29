#Author: Kazi Anik
#Test type :this is a login test
# action and behaviour
Feature: validating the login functionalities

 Background: user should be in the login page
    Given user is on the login page 
 
  Scenario: login with valid credentials
     
    When user enters valid username in username text box
    And user enters valid password in the password text box
    And user clicks the login button
    Then user should be able to login
    Then user should close the browser
    
    
    Scenario: login with invalid credentials
    
  
    When user enters invalid username in the text box
    And user enters invalid password in the text box
    And user clicks the login button
    Then user should not be able to login
    Then user should close the browser 
    
    
    
