#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Signup feature

  Scenario: validating the sign up page 
  
    Given user is on the sign up page
    When user enters firstName
    And user enters lastname
    And user enter phone number
    And user enters email address
    And user clicks the signup button 
    Then user should have a new account
    And user should see the account dashboard 
    Then user should close the browser
    

 
