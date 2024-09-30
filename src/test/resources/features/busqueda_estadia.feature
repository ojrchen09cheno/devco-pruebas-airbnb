Feature: Search airbnb simple

  Scenario: Search 'Jardin, Antioquia' next week, 1 week stay and 2 people
    Given Jia search an airbnb for "jardin, antioquia", for 5 days and 2 "Adults"
    Then Jia should find at least 1 location

  Scenario: Filters
    Given Jia search an airbnb for "jardin, antioquia", for 5 days and 2 "Adults"
    When Jia filter for "Amazing pools"
    Then Jia should see that the first 5 results should have a "pool" in "Parking and facilities"

