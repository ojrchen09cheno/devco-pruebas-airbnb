@DONE
Feature: Sort reviews

  Scenario: Sort reviews by highest rating

    Given Pablo opens the airbnb homepage
    When Pablo searches for a place to stay in "Cartagena"
    And Pablo checks the first result reviews and sorts them by highest rating
    Then Pablo should see that the first reviews are "5" stars