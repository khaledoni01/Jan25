
Feature: Login Feature will be tested here

  @login
  Scenario: Login with invalid creds
    Given user provides username "admin" and password "abc123"
    When user clicks on login button
    Then user should see error message


  Scenario Outline: Login with multiple sets
    Given user provides username "<username>" and password "<password>"
    When user clicks on login button
    Then user should see error message
    Examples:
      | username | password |
      |admin     |admin     |
      |test      |abc123    |


