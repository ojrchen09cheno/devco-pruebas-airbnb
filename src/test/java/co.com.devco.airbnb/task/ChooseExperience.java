package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirbnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ChooseExperience {

    public static Performable with(String location) {
        return Task.where("choose place at " + location,
                Click.on(AirbnbHomePage.EXPERIENCES_BUTTON),
                Enter.theValue(location).into(AirbnbHomePage.PLACE_INPUT),
                Click.on(AirbnbHomePage.SEARCH_BUTTON)
        );

    }
}
