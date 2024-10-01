package co.com.devco.airbnb.task;

import co.com.devco.airbnb.interaction.CloseTranslations;
import co.com.devco.airbnb.interaction.Wait;
import co.com.devco.airbnb.page.PlaceDetailsPage;
import co.com.devco.airbnb.page.PlaceResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CheckResultWithReviews {
    public static Performable andSortBy(String filterType) {
        return Task.where("check amenities",
                Scroll.to(PlaceResultsPage.FIRST_PLACE_WITH_REVIEWS),
                Click.on(PlaceResultsPage.FIRST_PLACE_WITH_REVIEWS),
                Wait.theSeconds(3),
                Switch.toNewWindow(),
                CloseTranslations.conditional(),
                Wait.theSeconds(1),
                Scroll.to(PlaceDetailsPage.REVIEW_BUTTON),
                Wait.theSeconds(1),
                JavaScriptClick.on(PlaceDetailsPage.REVIEW_BUTTON),
                Wait.theSeconds(1),
                Click.on(PlaceDetailsPage.SORT_REVIEWS_BUTTON),
                Wait.theSeconds(1),
                Click.on(PlaceDetailsPage.SORT_HIGHEST_RATED),
                Wait.theSeconds(1)
        );
    }
}


