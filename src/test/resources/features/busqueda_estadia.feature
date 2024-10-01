@TODO
Feature: Search airbnb simple

  Scenario: Search 'Jardin, Antioquia' next week, 1 week stay and 2 people
    Given Jia search an airbnb for "jardin, antioquia", for 5 days and 2 "Adults"
    Then Jia should find at least 1 location

