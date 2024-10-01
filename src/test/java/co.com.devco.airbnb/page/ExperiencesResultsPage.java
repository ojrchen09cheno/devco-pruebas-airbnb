package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ExperiencesResultsPage extends PageObject {

    public static final Target FILTER_PRICE_BUTTON = Target.the("filter by price button").locatedBy("//button[@id='menuItemButton-Price']");
    public static final Target FILTER_MIN_PRICE_INPUT = Target.the("min price input").locatedBy("//input[@id='price_filter_min']");
    public static final Target FILTER_MAX_PRICE_INPUT = Target.the("max price input").locatedBy("//input[@id='price_filter_max']");
    public static final Target FILTER_SAVE_BUTTON = Target.the("filter save button").locatedBy("//button[text()='Save']");
    public static final Target FILTERS_BUTTON = Target.the("filter button").locatedBy("//button[@aria-label='Filters']");
    public static final Target SHOW_RESULTS_BUTTON = Target.the("show results button").locatedBy("//a[contains(text(), 'Show') and contains(text(),'results')]");
    public static final Target PRICE_RANGE_TEXT = Target.the("price range text").locatedBy("//h2[text()='Price range']");
    public static final Target EXPERIENCE_PRICE = Target.the("first experience price").locatedBy("(//span[contains(text(), 'From $')])[1]");
}

