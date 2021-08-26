Feature: Sending user and password from feature file as string
  Scenario: Login to OrangeHRM with user and password from feature file as string
    When URL to be launched
    Given Username "user@phptravels.com" and password "demouser"
    Then User logged in