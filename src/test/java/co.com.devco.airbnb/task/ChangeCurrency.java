package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirbnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChangeCurrency {

    public static Performable to(String currency) {
        return Task.where("change currency to " + currency,
                Click.on(AirbnbHomePage.CHANGE_LANGUAGE_CURRENCY_BUTTON),
                Click.on(AirbnbHomePage.CURRENCY_TAB),
                Click.on(AirbnbHomePage.CURRENCY_CHOICE_BUTTON.of(currency))
        );
    }

}
