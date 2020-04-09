#Author: your.email@your.domain.com


Feature: Yahoo Sign up

@uat
  Scenario: validating the sign up page of yahoo
    
    Given User is on the yahoo sign up page 
    When user enters first name yahoo page
    And user enters last name yahoo page
    And user enters email address yahoo page
    And user enters password 
    And user enters mobile number
    And user enters birth month
    And user enters birth day
    And user enters birth year
    Then user should be able to click the continue button
    And user should have a new Yahoo account 
    And user should close the browser


 