package com.latam.certificacion.aplicacionweblatam.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.latam.certificacion.aplicacionweblatam.userinterfaces.PaginaPrincipalComponents.CODIGO_DE_RESERVA;

public class ElCodigo implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        CODIGO_DE_RESERVA.resolveFor(actor).getText();
        return Text.of(CODIGO_DE_RESERVA).viewedBy(actor).asString();
    }

    public static ElCodigo encontrado(){
        return new ElCodigo();
    }
}
