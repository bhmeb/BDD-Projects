Feature: Search and place the order for product

  @PlaceOrder
  Scenario Outline: Search Experience for product search in both home and offer page
    Given User is on greenCart Landing page
    When User searched with short name <Name> and Extracted actual name of product
    And Added "3" items of the selected product to cart
    Then User proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
      |Name  |
      |Tom   |

