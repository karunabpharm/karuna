@basket
Feature: Basket
  As a end user
  I want to search for a product
  So that i can give respective results

  Background:
    Given I enter the product "<product>"
    When I select any product
    And I add product to trolley
    And I go to trolley

  @rk1 @smoke
  Scenario Outline: Product added to  the basket
    Then It should be added to the basket
    Examples:
      | product   |
      | nike      |
      | puma      |
      | sofa      |

  @regression
  Scenario: Remove product from Basket
    And I remove a product from trolley
    Then I should see product remove from trolley

  Scenario: Increase quantity
    And I increase the quantity of a product
    Then I should see that price has be increased