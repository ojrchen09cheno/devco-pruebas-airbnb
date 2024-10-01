package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.ExperiencesResultsPage;
import co.com.devco.airbnb.page.PlaceDetailsPage;
import co.com.devco.airbnb.task.CheckResultWithReviews;
import com.google.common.base.CharMatcher;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SortReviewsStepDefinitions {

    @And("{actor} checks the first result reviews and sorts them by highest rating")
    public void checkFirstStayWithReviews(Actor actor) {
        actor.attemptsTo(
                CheckResultWithReviews.andSortBy("Highest rated")
        );
    }

    @Then("{actor} should see that the first reviews are {string} stars")
    public void checkReviewsStars(Actor actor, String starsToCheck) {

        WebElementFacade element = PlaceDetailsPage.REVIEWS_STARS.resolveFor(actor);
        String stars = element.getTextContent();
        System.out.println(stars);
        stars = CharMatcher.inRange('0', '9').retainFrom(stars);

        actor.attemptsTo(
                Ensure.that(stars).isEqualTo(starsToCheck)
        );
    }
}
