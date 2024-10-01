package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.task.Filter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class FilterExperienceStepDefinitions {

    @And("{actor} filters by price between {int} and {int}")
    public void mariaFiltersByMinPriceAndMaxPrice(Actor actor, String minPrice, String maxPrice) {
        actor.attemptsTo(
                Filter.byPrice(minPrice, maxPrice)
        );
    }

    @Then("The results should be within {int} and {int}")
    public void theResultsShouldBeWithinThePriceRange(int minPrice, int maxPrice) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(

        );
    }

}
