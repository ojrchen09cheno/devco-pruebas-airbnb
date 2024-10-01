@DONE
Feature: Filter homes

  Scenario: Filter by allows pets

    Given Santiago opens the airbnb homepage
    When Santiago searches for a place to stay in "Cartagena"
    And Santiago filters by the "Booking options" "Allows pets"
    Then Santiago should see stays that offer "Pets allowed"