package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com/")
public class AirbnbHomePage extends PageObject {
    public static final Target PLACE_INPUT =  Target.the("place input").locatedBy("//input[@id='bigsearch-query-location-input']");
    public static final Target CHECKIN_DATE_BOX =  Target.the("check in date bot").locatedBy("//div[@data-testid='structured-search-input-field-split-dates-0']");
    public static final Target CHECKOUT_DATE_BOX =  Target.the("checkout date box").locatedBy("//div[@data-testid='structured-search-input-field-split-dates-1']");
    public static final Target CHECKIN_DATE_INPUT =  Target.the("checkin date input").locatedBy("//div[@data-testid='09/15/2024']");
    public static final Target CHECKOUT_DATE_INPUT =  Target.the("checkout date input").locatedBy("//div[@data-testid='09/22/2024']");
    public static final Target GUESTS_BOX =  Target.the("number of guests box").locatedBy("//div[@data-testid='structured-search-input-field-guests-button']");
    public static final Target ADD_ADULT_BUTTON =  Target.the("add an adult button").locatedBy("//button[@data-testid='stepper-adults-increase-button']");
    public static final Target CHANGE_LANGUAGE_CURRENCY_BUTTON = Target.the("change language and currency button").locatedBy("//button[@aria-label='Choose a language and currency']");
    public static final Target EXPERIENCES_BUTTON = Target.the("experiences button").locatedBy("//span[@data-content='Experiences']");
    public static final Target EXPERIENCES_DATES_BUTTON = Target.the("experiences dates").locatedBy("//div[@data-testid='structured-search-input-field-dates-button']");


    public static Target BOTON_TODOS_SERVICIOS = Target.the("boton ver todos los servicios").locatedBy("//div[@data-section-id='AMENITIES_DEFAULT']//button[contains(text(), 'servicios')]");
}
