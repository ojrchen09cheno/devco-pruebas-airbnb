@DONE
Feature: Choose currency

  Scenario: Choose currency

    Given Alex opens the airbnb homepage
    When Alex tries to change his currency from "COP" to "Australian dollar"
    And Alex searches for a place to stay in "Cartagena"
    Then Alex should see the prices are in "AUD"
