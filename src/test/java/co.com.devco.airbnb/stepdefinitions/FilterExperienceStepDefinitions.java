package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.ExperiencesResultsPage;
import co.com.devco.airbnb.task.Filter;
import com.google.common.base.CharMatcher;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class FilterExperienceStepDefinitions {

    @And("{actor} filters by price between {string} and {string}")
    public void filterByPrice(Actor actor, String minPrice, String maxPrice) {
        actor.attemptsTo(
                Filter.byPrice(minPrice, maxPrice)
        );
    }

    @Then("The results should be within {int} and {int}")
    public void ensurePriceFilter(int minPrice, int maxPrice) {
        Actor actor = OnStage.theActorInTheSpotlight();

        WebElementFacade element = ExperiencesResultsPage.EXPERIENCE_PRICE.resolveFor(actor);
        String price = element.getTextContent();
        System.out.println(price);
        price = CharMatcher.inRange('0', '9').retainFrom(price);

        actor.attemptsTo(
                Ensure.that(Integer.parseInt(price)).isBetween(minPrice,maxPrice)
        );
    }

}
