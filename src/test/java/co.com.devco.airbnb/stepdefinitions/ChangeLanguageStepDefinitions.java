package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.task.ChangeLanguage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ChangeLanguageStepDefinitions {

    @When("{actor} changes the language from {string} to {string}")
    public void changeLanguage(Actor actor, String temp, String country) {
        actor.attemptsTo(
                ChangeLanguage.to(country)
        );
    }

    @Then("the app should display the localization {string}")
    public void ensureProperLocalization(String localization) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                Ensure.thatTheCurrentPage().currentUrl().contains(localization)
        );
    }
}
