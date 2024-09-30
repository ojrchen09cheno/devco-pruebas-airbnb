package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.PlaceResultsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeeDetails {

    public static Performable byCategory(String filterType) {
        return Task.where("filter places by " + filterType,
                Click.on(PlaceResultsPage.PLACES_CARD)
        );

    }
}
