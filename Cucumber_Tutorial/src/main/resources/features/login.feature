@qa
Feature: Login functionality

  Background: 
    Given user is on login page

  @smoke @title
  Scenario: verifying page title
    When user gets page title

  @sanity
  Scenario: verifying page url
    When user gets page url

  @regression
  Scenario Outline: Valid login
    When user enters valid username as "<username>" and password as "<password>"
    And clicks on login button

    #   Then user should be navigated to home page
    #    And user clicks assign leave
    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin    | admin    |
      | admin123 | admin123 |
      | admin123 | admin    |
      | admin    | admin123 |
