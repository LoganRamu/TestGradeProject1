Feature: AlertDemo Automation
  This feature deals with the AlertDemo

  Scenario: Verify Alert
    Given I Launch URL
    And I Test Alert with OK
    And I Test Alert with OK and Cancel
    Then I Test Prompt box
