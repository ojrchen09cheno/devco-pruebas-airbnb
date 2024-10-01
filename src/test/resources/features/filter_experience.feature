@TODO
Feature: Filter experiences

  Scenario: Filter experiences by price

    Given Maria opens the airbnb homepage
    When Maria searches for an experience in "Cartagena"
    And Maria filters by price between 50000 and 200000
    Then The results should be within 50000 and 200000