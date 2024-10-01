package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.interaction.Wait;
import co.com.devco.airbnb.page.PlaceResultsPage;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SearchPlaceStepDefinitions {

    @Then("{actor} should find at least {int} location")
    public void shouldFindAtLeastLocation(Actor actor, int validationNumber) {
        actor.attemptsTo(
                Ensure.that(PlaceResultsPage.PLACES_CARD.resolveAllFor(actor)).hasSizeGreaterThan(1)
        );

        System.out.println(PlaceResultsPage.PLACES_CARD);
    }

}
