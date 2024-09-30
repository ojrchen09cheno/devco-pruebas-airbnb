package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.task.Filter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;


public class FilterStepDefinitions {

    @When("{actor} filter for {string}")
    public void filterFor(Actor actor, String filterType) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
                Filter.byCategory(filterType)
                //Click.on(PlaceResultsPage.CATEGORY_BOX.of(filterType))
        );
    }

    @Then("{actor} should see that the first {int} results should have a {string} in {string}")
    public void validateServiceDetails(Actor actor, Integer validationAmount, String wantedFilter, String servicesLocation) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
//                VerDetalle
//                Buscaralgo
//                xd
        );
    }

}
