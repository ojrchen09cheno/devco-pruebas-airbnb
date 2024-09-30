Feature: Sort reviews

  Scenario: Sort reviews by highest rating

    Given Pablo opens the airbnb homepage
    When Pablo searches for a place to stay
    And Pablo checks the first results reviews and sorts them by highest rating
    Then Pablo should see that the first reviews are 5 stars