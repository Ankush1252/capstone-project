Feature: User Registration

  Scenario Outline: New User Registration is Successful
    Given User navigates to the Automation Exercise website
    When User clicks on Login button
    And User enters "<Name>" and "<Email>" and click Signup button
    And User enters "<password>" and "<firstName>" and "<lastName>" and "<Address>"and "<State>" and "<City>" and "<Zipcode>" and "<mobileNumber>"
    Then User clicks on Create Account
    Then User validtes that Account Created message is displayed
    And User clicks on Continue button
    And User logs out

    Examples: 
      | Name      | Email          | password | firstName | lastName | Address    | State       | City | Zipcode | mobileNumber |
      | User Name | test@gmail.com |  1231233 | john      | doe      | House No 2 | Maharashtra | Pune |  412123 |   9876543234 |

  Scenario Outline: New User Registration is Failute
    Given User navigates to the Automation Exercise website
    When User clicks on Login button
    And User enters "<Name>" and "<Email>" and click Signup button
    Then User validates the error message Email Address already exist is displyed

    Examples: 
      | Name      | Email          |
      | User Name | test@gmail.com |
