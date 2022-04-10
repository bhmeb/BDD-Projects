Feature: Search and place the order for product

  @OffersPage
  Scenario Outline: Search Experience for product search in both home and offer page

    Given User is on greenCart Landing page
    When User searched with short name <Name> and Extracted actual name of product
    Then User searched for <Name> shortname in offer page
    And Validate product name in offer page matches with Landing Page
    Examples:
      |Name  |
      |Tom   |

