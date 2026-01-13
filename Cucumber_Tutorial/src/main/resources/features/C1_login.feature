@qa
Feature: Login functionality

  @regression
  Scenario Outline: Valid login
    When user enters valid username as "<username>" and password as "<password>"
    And clicks on login button
    Then user should be navigated to home page
    And user clicks assign leave

    Examples: 
      | username | password         |
      | Admin    | admin@123        |
      | admin123 | admin@3245342347 |
      | Admin    | admin123         |
