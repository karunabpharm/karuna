Feature:

  @rk
  Scenario: Filter By review
    Given I enter the product "puma"
    When I set filer review to "4"
    Then I should see product rating above "4"