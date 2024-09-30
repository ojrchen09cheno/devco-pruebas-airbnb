Feature: Filter experiences

  Scenario: Filter experiences by price

    Given Maria opens the airbnb homepage
    When Maria searches for an experience
    And Maria filters by minPrice and maxPrice
    Then The results should be within the price range