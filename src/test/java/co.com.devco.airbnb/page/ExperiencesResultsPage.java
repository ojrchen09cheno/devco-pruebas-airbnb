package co.com.devco.airbnb.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ExperiencesResultsPage extends PageObject {

    public static final Target FILTER_PRICE_BUTTON = Target.the("filter by price button").locatedBy("//button[@id='menuItemButton-Price']");
    public static final Target FILTER_MIN_PRICE_INPUT = Target.the("min price input").locatedBy("//input[@id='price_filter_min']");
    public static final Target FILTER_MAX_PRICE_INPUT = Target.the("max price input").locatedBy("//input[@id='price_filter_max']");
    public static final Target FILTER_SAVE_BUTTON = Target.the("filter save button").locatedBy("//button[@data-testid='filter-panel-save-button']");
}

