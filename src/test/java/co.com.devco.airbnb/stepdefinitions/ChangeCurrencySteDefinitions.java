package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirbnbHomePage;
import co.com.devco.airbnb.page.PlaceResultsPage;
import co.com.devco.airbnb.task.ChangeCurrency;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import java.util.regex.Matcher;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChangeCurrencySteDefinitions {

    @When("{actor} tries to change his currency from {string} to {string}")
    public void alexTriesToChangeHisCurrencyFromCOPToUSD(Actor actor, String prevCurrencyTemp, String currency) {
        actor.attemptsTo(
                ChangeCurrency.to(currency)
        );
    }

    @Then("{actor} should see the prices are in {string}")
    public void alexShouldSeeThePricesAreIn(Actor actor, String currency) {
        actor.attemptsTo(
                WaitUntil.the(PlaceResultsPage.DISPLAYED_CURRENCY, isVisible()),
                Ensure.that(PlaceResultsPage.DISPLAYED_CURRENCY).text().contains(currency)
        );
    }
}
