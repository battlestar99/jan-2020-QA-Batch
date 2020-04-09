#Author: your.email@your.domain.com

 Feature: Yahoo sign up page data
 
 @regression
 Scenario: validating the sign up page of yahoo
    
    Given User is on the yahoo sign up page 
    When user enters first name "Michael" yahoo page
    And user enters last name "Johnson" yahoo page
    And user enters email address "john@test.com" yahoo page
    And user enters password "dskjfdfh++"
    And user enters mobile number "87987987"
    And user enters birth month "February"
    And user enters birth day "14"
    And user enters birth year "1990"
    Then user should be able to click the continue button
    And user should have a new Yahoo account 
    And user should close the browser