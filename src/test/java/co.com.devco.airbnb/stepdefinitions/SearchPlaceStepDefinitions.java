package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.PlaceResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

public class SearchPlaceStepDefinitions {

    @Then("{actor} should find at least {int} location")
    public void shouldFindAtLeastLocation(Actor actor, int validationNumber) {
        System.out.println(PlaceResultsPage.PLACES_CARD);
        Ensure.that(PlaceResultsPage.PLACES_CARD);
    }

}
