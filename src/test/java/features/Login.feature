Feature: Login

  @Login
  Scenario: Verify login functionality
    Given User is on login page
    When User fill username and password
    And User click login button
    Then User navigate to homepage