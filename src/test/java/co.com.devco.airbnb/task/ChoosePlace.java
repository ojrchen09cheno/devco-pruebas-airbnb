package co.com.devco.airbnb.task;

import co.com.devco.airbnb.page.AirbnbHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.openqa.selenium.support.ui.Wait;

public class ChoosePlace {

    public static Performable with(String location, Integer days, Integer numberGuests, String guests) {
        return Task.where("choose place at " + location + " for " + days + " days and " + numberGuests + " " + guests,
                Enter.theValue(location).into(AirbnbHomePage.PLACE_INPUT),
                Click.on(AirbnbHomePage.CHECKIN_DATE_BOX),
                Click.on(AirbnbHomePage.CHECKIN_DATE_INPUT),
                Click.on(AirbnbHomePage.CHECKOUT_DATE_BOX),
                Click.on(AirbnbHomePage.CHECKOUT_DATE_INPUT),
                Click.on(AirbnbHomePage.GUESTS_BOX),
                Click.on(AirbnbHomePage.ADD_ADULT_BUTTON)
                );

    }
}
