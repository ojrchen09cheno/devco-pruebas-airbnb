package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com/")
public class PlaceResultsPage extends PageObject {
    public static final Target PLACES_CARD =  Target.the("results places cards").locatedBy("(//div[@data-testid='card-container'])[1]");
    public static final Target PLACES_CARD_FIRST_RESULT =  Target.the("first result of the places to stay search").locatedBy("(//div[@data-testid='card-container'])[1]");
    public static final Target CATEGORY_BOX =  Target.the("category box").locatedBy("//div[@data-testid='category-item--{0}--unchecked']");
    public static final Target FILTERS_BUTTON = Target.the("filters button").locatedBy("//button[@data-testid='category-bar-filter-button']");
    public static final Target FILTER_BY_PETS = Target.the("allow pets button").locatedBy("//button[@id='filter-item-pets']");
    public static final Target SHOW_PLACES_BUTTON = Target.the("show places button").locatedBy("//a[contains(text(), 'Show') and contains(text(),'place')]");
    public static final Target CHANGE_LANGUAGE_CURRENCY_BUTTON = Target.the("change language and currency button").locatedBy("//button[@aria-label='Choose a language and currency']");
    public static final Target DISPLAYED_CURRENCY = Target.the("displayed currency").locatedBy("//div[@data-testid='price-availability-row']//span[1]/span");
    public static final Target FILTER_BY_BOOKING_OPTION_TYPE = Target.the("filter by {0}").locatedBy("//span[text()='{0}']/..]");
    public static final Target FILTER_TITLE = Target.the("filter type title").locatedBy("//h2[@id][text()='Booking options']");
    public static final Target FIRST_PLACE_WITH_REVIEWS = Target.the("first place with reviews").locatedBy("(//div[@data-testid='card-container' and .//*[contains(text(), 'reviews')]])[1]");
}
