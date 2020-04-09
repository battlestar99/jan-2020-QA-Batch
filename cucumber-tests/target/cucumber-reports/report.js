$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signup.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 4,
  "name": "Signup feature",
  "description": "",
  "id": "signup-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "validating the sign up page",
  "description": "",
  "id": "signup-feature;validating-the-sign-up-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on the sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enters firstName",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enters lastname",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter phone number",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters email address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks the signup button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should have a new account",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user should see the account dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_sign_up_page()"
});
formatter.result({
  "duration": 9328952400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_firstName()"
});
formatter.result({
  "duration": 1174528200,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_lastname()"
});
formatter.result({
  "duration": 1103831900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enter_phone_number()"
});
formatter.result({
  "duration": 1102800900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_email_address()"
});
formatter.result({
  "duration": 148642300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_clicks_the_signup_button()"
});
formatter.result({
  "duration": 40590000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_account()"
});
formatter.result({
  "duration": 17312000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_see_the_account_dashboard()"
});
formatter.result({
  "duration": 3000568100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 2963856200,
  "status": "passed"
});
formatter.uri("yahooDataTable.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 2,
  "name": "Yahoo sign up page data",
  "description": "",
  "id": "yahoo-sign-up-page-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters firstname \"\u003cFirstname\u003e\"  yahoo page data",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters lastname \"\u003clastname\u003e\"  yahoo page data",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters email address\"\u003cEmailaddress\u003e\"  yahoo page data",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;",
  "rows": [
    {
      "cells": [
        "Firstname",
        "lastname",
        "Emailaddress"
      ],
      "line": 14,
      "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;1"
    },
    {
      "cells": [
        "Michael",
        "John",
        "john@test.com"
      ],
      "line": 15,
      "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;2"
    },
    {
      "cells": [
        "BOb",
        "Vance",
        "vance@test.com"
      ],
      "line": 16,
      "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;3"
    },
    {
      "cells": [
        "John",
        "Krugman",
        "krug@gmail.com"
      ],
      "line": 17,
      "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;4"
    },
    {
      "cells": [
        "Meredith",
        "Palmar",
        "mer@gmail.com"
      ],
      "line": 18,
      "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;5"
    },
    {
      "cells": [
        "Jim",
        "Palmar",
        "jim@gmail.com"
      ],
      "line": 19,
      "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters firstname \"Michael\"  yahoo page data",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters lastname \"John\"  yahoo page data",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters email address\"john@test.com\"  yahoo page data",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 11396646700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Michael",
      "offset": 23
    }
  ],
  "location": "TestSteps.user_enters_firstname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 105139700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 22
    }
  ],
  "location": "TestSteps.user_enters_lastname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 111485300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "john@test.com",
      "offset": 26
    }
  ],
  "location": "TestSteps.user_enters_email_address_yahoo_page_data(String)"
});
formatter.result({
  "duration": 147227400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_be_able_to_click_the_continue_button()"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_Yahoo_account()"
});
formatter.result({
  "duration": 26600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 2863553000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters firstname \"BOb\"  yahoo page data",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters lastname \"Vance\"  yahoo page data",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters email address\"vance@test.com\"  yahoo page data",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 11134749500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BOb",
      "offset": 23
    }
  ],
  "location": "TestSteps.user_enters_firstname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 96714300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vance",
      "offset": 22
    }
  ],
  "location": "TestSteps.user_enters_lastname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 101751300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vance@test.com",
      "offset": 26
    }
  ],
  "location": "TestSteps.user_enters_email_address_yahoo_page_data(String)"
});
formatter.result({
  "duration": 144029000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_be_able_to_click_the_continue_button()"
});
formatter.result({
  "duration": 19300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_Yahoo_account()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 2808745800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters firstname \"John\"  yahoo page data",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters lastname \"Krugman\"  yahoo page data",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters email address\"krug@gmail.com\"  yahoo page data",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 11118060700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 23
    }
  ],
  "location": "TestSteps.user_enters_firstname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 108737500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krugman",
      "offset": 22
    }
  ],
  "location": "TestSteps.user_enters_lastname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 148365300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "krug@gmail.com",
      "offset": 26
    }
  ],
  "location": "TestSteps.user_enters_email_address_yahoo_page_data(String)"
});
formatter.result({
  "duration": 186873800,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_be_able_to_click_the_continue_button()"
});
formatter.result({
  "duration": 27900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_Yahoo_account()"
});
formatter.result({
  "duration": 31600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 2867938300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters firstname \"Meredith\"  yahoo page data",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters lastname \"Palmar\"  yahoo page data",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters email address\"mer@gmail.com\"  yahoo page data",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 11310904500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Meredith",
      "offset": 23
    }
  ],
  "location": "TestSteps.user_enters_firstname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 134284400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Palmar",
      "offset": 22
    }
  ],
  "location": "TestSteps.user_enters_lastname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 137021600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mer@gmail.com",
      "offset": 26
    }
  ],
  "location": "TestSteps.user_enters_email_address_yahoo_page_data(String)"
});
formatter.result({
  "duration": 164590000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_be_able_to_click_the_continue_button()"
});
formatter.result({
  "duration": 21300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_Yahoo_account()"
});
formatter.result({
  "duration": 16300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 3281153300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up-page-data;validating-the-sign-up-page-of-yahoo;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters firstname \"Jim\"  yahoo page data",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters lastname \"Palmar\"  yahoo page data",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters email address\"jim@gmail.com\"  yahoo page data",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 11228714800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jim",
      "offset": 23
    }
  ],
  "location": "TestSteps.user_enters_firstname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 115488900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Palmar",
      "offset": 22
    }
  ],
  "location": "TestSteps.user_enters_lastname_yahoo_page_data(String)"
});
formatter.result({
  "duration": 111857600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jim@gmail.com",
      "offset": 26
    }
  ],
  "location": "TestSteps.user_enters_email_address_yahoo_page_data(String)"
});
formatter.result({
  "duration": 153654600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_be_able_to_click_the_continue_button()"
});
formatter.result({
  "duration": 16300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_Yahoo_account()"
});
formatter.result({
  "duration": 19500,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 2864834300,
  "status": "passed"
});
formatter.uri("yahooTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 4,
  "name": "Yahoo Sign up",
  "description": "",
  "id": "yahoo-sign-up",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "validating the sign up page of yahoo",
  "description": "",
  "id": "yahoo-sign-up;validating-the-sign-up-page-of-yahoo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@uat"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enters first name yahoo page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters last name yahoo page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters email address yahoo page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters mobile number",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters birth month",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters birth day",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters birth year",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should be able to click the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user should have a new Yahoo account",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 11150431600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_first_name_yahoo_page()"
});
formatter.result({
  "duration": 119181700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_last_name_yahoo_page()"
});
formatter.result({
  "duration": 123674900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_email_address_yahoo_page()"
});
formatter.result({
  "duration": 21000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_password()"
});
formatter.result({
  "duration": 16100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_mobile_number()"
});
formatter.result({
  "duration": 13200,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_birth_month()"
});
formatter.result({
  "duration": 124931700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_birth_day()"
});
formatter.result({
  "duration": 32700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_birth_year()"
});
formatter.result({
  "duration": 31700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_be_able_to_click_the_continue_button()"
});
formatter.result({
  "duration": 31900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_have_a_new_Yahoo_account()"
});
formatter.result({
  "duration": 25300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_should_close_the_browser()"
});
formatter.result({
  "duration": 2854961000,
  "status": "passed"
});
});