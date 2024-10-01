package co.com.devco.airbnb.task;

import co.com.devco.airbnb.interaction.Wait;
import co.com.devco.airbnb.page.ExperiencesResultsPage;
import co.com.devco.airbnb.page.PlaceResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Filter {

    public static Performable byCategory(String filterType) {
        return Task.where("filter places by " + filterType,
                Click.on(PlaceResultsPage.CATEGORY_BOX.of(filterType))
        );

    }

    public static Performable byPrice(String minPrice, String maxPrice) {
        return Task.where("filter by price between " + minPrice +" and " + maxPrice,
                Click.on(ExperiencesResultsPage.FILTER_PRICE_BUTTON),
                Enter.theValue(minPrice).into(ExperiencesResultsPage.FILTER_MIN_PRICE_INPUT),
                Enter.theValue(maxPrice).into(ExperiencesResultsPage.FILTER_MAX_PRICE_INPUT),
                Click.on(ExperiencesResultsPage.FILTER_SAVE_BUTTON)
                );
    }

    public static Performable byBookingOptions(String filterTitle, String filterType) {
        return Task.where("filter by booking option " + filterType,
                Click.on(PlaceResultsPage.FILTERS_BUTTON),
                Wait.theSeconds(3),
                Scroll.to(PlaceResultsPage.FILTER_TITLE.of(filterTitle)),
                Wait.theSeconds(1),
                JavaScriptClick.on("//button[@id='filter-item-pets']"),
                JavaScriptClick.on(PlaceResultsPage.SHOW_PLACES_BUTTON),
                Wait.theSeconds(1)
        );
    }
}
