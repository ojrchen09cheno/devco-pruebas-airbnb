Feature: Change language

  Scenario: Change language

    Given Daniel opens the airbnb homepage
    When Daniel changes the language to "Español", "Colombia"
    Then the app should display the colombian localization
