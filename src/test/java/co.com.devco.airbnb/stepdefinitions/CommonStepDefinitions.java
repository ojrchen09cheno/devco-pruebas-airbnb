package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.interaction.Wait;
import co.com.devco.airbnb.page.AirbnbHomePage;
import co.com.devco.airbnb.task.ChooseExperience;
import co.com.devco.airbnb.task.ChoosePlace;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

public class CommonStepDefinitions {

    @Given("{actor} search an airbnb for {string}, for {int} days and {int} {string}")
    public void searchAirbnbBasic(Actor actor, String location, Integer days, Integer numberGuests, String guests) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
                Open.browserOn().the(AirbnbHomePage.class),
                Wait.theSeconds(3),
                ChoosePlace.with(location, days, numberGuests, guests),
                Wait.theSeconds(3)
                );
    }

    @Given("{actor} opens the airbnb homepage")
    public void mariaOpensTheAirbnbHomepage(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(AirbnbHomePage.class),
                // Waiting for page to load properly. Giving me stale element error
                Wait.theSeconds(3)
        );
    }

    @When("{actor} searches for an experience in {string}")
    public void mariaSearchesForAnExperience(Actor actor, String location) {
        actor.attemptsTo(
                ChooseExperience.with(location),
                Wait.theSeconds(3)
        );
    }

    @When("{actor} searches for a place to stay in {string}")
    public void pabloSearchesForAPlaceToStay(Actor actor, String location) {
        actor.attemptsTo(
                ChoosePlace.with(location),
                Wait.theSeconds(3)

        );
    }
}
