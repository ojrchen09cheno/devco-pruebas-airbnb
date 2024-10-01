package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirbnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChangeLanguage {

    public static Performable to(String country) {
        return Task.where("change language to " + country,
                Click.on(AirbnbHomePage.CHANGE_LANGUAGE_CURRENCY_BUTTON),
                Click.on(AirbnbHomePage.LANGUAGE_BUTTON.of(country))
        );
    }
}
