@DONE
Feature: Change language

  Scenario: Change language
    Given Daniel opens the airbnb homepage
    When Daniel changes the language from "Español" to "United Kingdom"
    Then the app should display the localization "uk"
