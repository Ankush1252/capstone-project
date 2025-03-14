Feature: Login

  Scenario Outline: Successful Login
    Given the user is on the login page
    When the user enters email "<Email>" and password "<Password>" and clicks the login button
    Then the user validates the message user is Logged in as "<userName>"

    Examples: 
      | Email                     | Password  | userName |
      | ankushawate1252@gmail.com | 123123123 | Ankush   |

  Scenario Outline: Login Failure
    Given the user is on the login page
    When user enters email "<Email>" and password "<Password>" and clicks the login button
    Then the user validates the error message

    Examples: 
      | Email            | Password  |
      | user@example.com | wrongPass |
