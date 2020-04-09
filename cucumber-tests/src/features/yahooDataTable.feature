#Author: your.email@your.domain.com
Feature: Yahoo sign up page data
@uat
  Scenario Outline: validating the sign up page of yahoo
    Given User is on the yahoo sign up page
    When user enters firstname "<Firstname>"  yahoo page data
    And user enters lastname "<lastname>"  yahoo page data
    And user enters email address"<Emailaddress>"  yahoo page data
    Then user should be able to click the continue button
    And user should have a new Yahoo account
    And user should close the browser

    Examples: 
      | Firstname | lastname | Emailaddress   |
      | Michael   | John     | john@test.com  |
      | BOb       | Vance    | vance@test.com |
      | John      | Krugman  | krug@gmail.com |
      | Meredith  | Palmar   | mer@gmail.com  |
      | Jim       | Palmar   | jim@gmail.com  |
