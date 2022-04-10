Feature: Search and place the order for product

  Scenario: Search Experience for product search in both home and offer page
    Given User is on greenCart Landing page
    When User searched with short name "Tom" and Extracted actual name of product
    Then User searched for "Tom" shortname in offer page
    And Validate product name in offer page matches with Landing Page

