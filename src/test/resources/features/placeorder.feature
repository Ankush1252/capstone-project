Feature: Place order

  Scenario Outline: Order Placed successfully
    Given User navigates to the Products section
    When User enters "<productName>" in the search box and clicks Search
    And User clicks on view product button
    And User clicks on add to cart button
    And User clicks on view cart button
    Then The View Cart page should be displayed correctly
    And User clicks on Proceed to checkout button and verify products displayed successfully
    And User clicks on place order button
    Then User enters "<nameOnCard>" and "<cardNumber>" and "<cvc>" and "<MM>" and "<YYYY>"
    And User clicks on Pay and Confirm Order button
    Then User verifies order confirmed message

    Examples: 
      | productName | nameOnCard | cardNumber  | cvc | MM | YYYY |
      | tshirt      | card user  | 12326542112 | 234 | 04 | 2029 |

  Scenario Outline: Order Placed Failed
    Given User navigates to the Products section
    When User enters "<productName>" in the search box and clicks Search
    And User clicks on view product button
    And User clicks on add to cart button
    And User clicks on view cart button
    Then The View Cart page should be displayed correctly
    And User clicks on Proceed to checkout button and verify products displayed successfully
    And User clicks on place order button
    Then User enters "<nameOnCard>" and "<cardNumber>" and "<cvc>" and "<MM>" and "<YYYY>"
    And User clicks on Pay and Confirm Order button
    Then user cannot verifies order confirmed message

    Examples: 
      | productName | nameOnCard | cardNumber  | cvc | MM | YYYY |
      | tshirt      | card user  | 12326542112 |     | 04 | 2029 |
