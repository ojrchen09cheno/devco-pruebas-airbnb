package co.com.devco.airbnb.stepdefinitions;

import co.com.devco.airbnb.page.AirbnbHomePage;
import co.com.devco.airbnb.task.ChoosePlace;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
