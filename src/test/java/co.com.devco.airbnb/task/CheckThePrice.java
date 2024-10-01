package co.com.devco.airbnb.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CheckThePrice {

    public static Performable of(int amountToCheck, int minPrice, int maxPrice) {
        return Task.where("check the price of " + amountToCheck + " experiences", actor -> {
//            actor.attemptsTo(Click.on(AirBnbHomePage.INDIVIDUOS_PPAL_BOT));
            for (int i = 0; i < amountToCheck; i++) {
//                actor.attemptsTo(Click.on(AirBnbHomePage.INCREMENTAR_INDIVIDUO_TIPO_BOT.of(tipoIndividuo)));
            }
        });
    }

}
