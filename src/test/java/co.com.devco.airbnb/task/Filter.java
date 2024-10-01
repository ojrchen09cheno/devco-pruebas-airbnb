package co.com.devco.airbnb.task;

import co.com.devco.airbnb.interaction.Wait;
import co.com.devco.airbnb.page.ExperiencesResultsPage;
import co.com.devco.airbnb.page.PlaceResultsPage;
import io.cucumber.java.an.E;
import net.serenitybdd.core.pages.ClearContents;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

import static net.serenitybdd.core.Serenity.getDriver;

public class Filter {

    public static Performable byCategory(String filterType) {
        return Task.where("filter places by " + filterType,
                Click.on(PlaceResultsPage.CATEGORY_BOX.of(filterType))
        );

    }

    public static Performable byPrice(String minPrice, String maxPrice) {
        return Task.where("filter by price between " + minPrice + " and " + maxPrice, actor -> {

            actor.attemptsTo(
                    Click.on(ExperiencesResultsPage.FILTERS_BUTTON)
                    ,Scroll.to(ExperiencesResultsPage.PRICE_RANGE_TEXT),
                    DoubleClick.on(ExperiencesResultsPage.FILTER_MIN_PRICE_INPUT)
                    ,Wait.theSeconds(2)

            );

            WebElementFacade element = ExperiencesResultsPage.FILTER_MIN_PRICE_INPUT.resolveFor(actor);
            element.sendKeys(minPrice);

            actor.attemptsTo(
                    DoubleClick.on(ExperiencesResultsPage.FILTER_MAX_PRICE_INPUT),
                    Wait.theSeconds(1)
            );

            element = ExperiencesResultsPage.FILTER_MAX_PRICE_INPUT.resolveFor(actor);
            element.sendKeys(Keys.BACK_SPACE, Keys.ARROW_RIGHT, Keys.BACK_SPACE);
            element.sendKeys(maxPrice);

            actor.attemptsTo(
                    Wait.theSeconds(1),
                    Click.on(ExperiencesResultsPage.SHOW_RESULTS_BUTTON),
                    Wait.theSeconds(3)
            );
        });
    }

    public static Performable byBookingOptions(String filterTitle, String filterType) {
        return Task.where("filter by booking option " + filterType,
                Click.on(PlaceResultsPage.FILTERS_BUTTON),
                Scroll.to(PlaceResultsPage.FILTER_TITLE.of(filterTitle)),
                Wait.theSeconds(1),
                JavaScriptClick.on("//button[@id='filter-item-pets']"),
                JavaScriptClick.on(PlaceResultsPage.SHOW_PLACES_BUTTON),
                Wait.theSeconds(1)
        );
    }
}
