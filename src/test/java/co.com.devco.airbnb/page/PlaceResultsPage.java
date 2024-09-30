package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com/")
public class PlaceResultsPage extends PageObject {
    public static final Target PLACES_CARD =  Target.the("results places cards").locatedBy("//div[@data-testid='card-container']");
    public static final Target PLACES_CARD_FIRST_RESULT =  Target.the("first result of the places to stay search").locatedBy("(//div[@data-testid='card-container'])[1]");
    public static final Target CATEGORY_BOX =  Target.the("category box").locatedBy("//div[@data-testid='category-item--{0}--unchecked']");
    public static final Target FILTERS_BUTTON = Target.the("filters button").locatedBy("//button[@data-testid='category-bar-filter-button']");
    public static final Target FILTER_BY_PETS = Target.the("allow pets button").locatedBy("//button[@id='filter-item-pets']");
    public static final Target SHOW_PLACES_BUTTON = Target.the("show places button").locatedBy("//a[contains(text(), 'Show') and contains(text(),'place')]");
}
