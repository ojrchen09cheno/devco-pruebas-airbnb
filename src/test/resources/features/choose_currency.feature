Feature: Choose currency

  Scenario: Redeem gift card with wrong PIN

    Given Alex opens the airbnb homepage
    When Alex tries to change his currency from COP to USD
    Then Alex should see the stay prices in USD
