Feature: saucedemo Automation
  This feature deals with the saucedemo page automation

  Scenario: Login as valid user
    Given I navigate to the login page
    And I enter the username and password
    And I Click on login button
    Then I should see the product page
