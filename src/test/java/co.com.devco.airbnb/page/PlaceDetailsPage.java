package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com/")
public class PlaceDetailsPage extends PageObject {
    public static final Target SHOW_ALL_AMENITIES =  Target.the("show all amenities button").locatedBy("//div[@data-section-id='AMENITIES_DEFAULT']//button");
    public static final Target AMENITY_NAME =  Target.the("amenity name").locatedBy("//div[@data-testid='category-item--{0}--unchecked']");
    public static final Target REVIEWS_STARS =  Target.the("first review stars score filterable").locatedBy("(//span[contains(text(),'Rating') and contains(text(), 'stars')])[7]");
    public static final Target REVIEW_BUTTON = Target.the("reviews button").locatedBy("//div[@data-testid='pdp-reviews-highlight-banner-host-review']");
    public static final Target SORT_REVIEWS_BUTTON = Target.the("sort reviews button").locatedBy("//button[@id='reviews-sort-selector_selector-toggle-button']");
    public static final Target SORT_HIGHEST_RATED = Target.the("sort by highest rated button").locatedBy("//li[@id='RATING_DESC_option']");
    public static final Target SHOW_AMENITIES_BUTTON = Target.the("sección del boton más servicios").locatedBy("//button[contains(text(), 'Show') and contains(text(),'amenities')]");
    public static final Target OFFERED_AMENITIES = Target.the("offered amenities").locatedBy("//div[text()='{0}']");
    public static final Target WHAT_PLACE_OFFERS = Target.the("what the place offers text").locatedBy("//h2[text()='What this place offers']");
}