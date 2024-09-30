package co.com.devco.airbnb.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.airbnb.com/")
public class PlaceDetailsPage extends PageObject {
    public static final Target SHOW_ALL_AMENITIES =  Target.the("show all amenities button").locatedBy("//div[@data-section-id='AMENITIES_DEFAULT']//button");
    public static final Target AMENITY_NAME =  Target.the("amenity name").locatedBy("//div[@data-testid='category-item--{0}--unchecked']");
    public static final Target REVIEWS_STARS =  Target.the("review stars score").locatedBy("//div[@data-testid='category-item--{0}--unchecked']");
    public static final Target REVIEW_BUTTON = Target.the("reviews button").locatedBy("//div[@data-testid='pdp-reviews-highlight-banner-host-review']");
    public static final Target SORT_REVIEWS_BUTTON = Target.the("sort reviews button").locatedBy("//button[@id='reviews-sort-selector_selector-toggle-button']");
    public static final Target SORT_HIGHEST_RATED = Target.the("sort by highest rated button").locatedBy("//li[@id='RATING_DESC_option']");
}
//div[@data-testid='pdp-reviews-modal-scrollable-panel']/div[1]//span[contains(text(),'5 star')]
// WebElementFacade::getText