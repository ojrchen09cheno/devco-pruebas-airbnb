package co.com.devco.airbnb.task;

import co.com.devco.airbnb.interaction.CloseTranslations;
import co.com.devco.airbnb.interaction.Wait;
import co.com.devco.airbnb.page.PlaceDetailsPage;
import co.com.devco.airbnb.page.PlaceResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CheckAmenities {
    public static Performable with(Actor actor, String filterType) {
        return Task.where("check amenities",
                Click.on(PlaceResultsPage.PLACES_CARD),
                Wait.theSeconds(3),
                Switch.toNewWindow(),
                CloseTranslations.conditional(),
                Wait.theSeconds(1),
                Scroll.to(PlaceDetailsPage.SHOW_ALL_AMENITIES),
                Wait.theSeconds(1),
                JavaScriptClick.on(PlaceDetailsPage.SHOW_ALL_AMENITIES),
                Wait.theSeconds(1),
                Scroll.to(PlaceDetailsPage.OFFERED_AMENITIES.of(filterType)),
                Wait.theSeconds(1),
                Ensure.that(PlaceDetailsPage.OFFERED_AMENITIES.of(filterType)).isEnabled()
        );
    }
}
