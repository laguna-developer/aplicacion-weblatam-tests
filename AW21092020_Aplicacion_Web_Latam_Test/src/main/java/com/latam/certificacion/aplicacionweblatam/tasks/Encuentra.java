package com.latam.certificacion.aplicacionweblatam.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.latam.certificacion.aplicacionweblatam.userinterfaces.PaginaPrincipalComponents.LINK_DONDE_ENCUENTRAS;
import static com.latam.certificacion.aplicacionweblatam.userinterfaces.PaginaPrincipalComponents.LINK_MIS_VIAJES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Encuentra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LINK_MIS_VIAJES, isVisible()));
        actor.attemptsTo(Click.on(LINK_MIS_VIAJES),
                Click.on(LINK_DONDE_ENCUENTRAS));
        //actor.attemptsTo(Click.on(LINK_DONDE_ENCUENTRAS));
    }

    public static Encuentra elCodigo() {
        return Tasks.instrumented(Encuentra.class);
    }
}
