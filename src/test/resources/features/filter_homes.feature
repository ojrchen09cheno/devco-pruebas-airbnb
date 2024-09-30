Feature: Filter homes

  Scenario: Filter by allows pets

    Given Santiago opens the airbnb homepage
    When Santiago searches for a place to stay
    And Santiago filters by allows pets
    Then Santiago shoul see pet friendly stays