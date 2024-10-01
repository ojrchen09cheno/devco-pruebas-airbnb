package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.task.CheckAmenities;
import co.com.devco.airbnb.task.Filter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;


public class FilterStayStepDefinitions {

    @And("{actor} filters by the {string} {string}")
    public void filterByPets(Actor actor, String filterTitle, String filterType) {
        actor.attemptsTo(
                Filter.byBookingOptions(filterTitle, filterType)
        );
    }

    @Then("{actor} should see stays that offer {string}")
    public void ensureStayAllowsPets(Actor actor, String filterValidation) {
        actor.attemptsTo(
                CheckAmenities.with(actor, filterValidation)
        );
    }
}
