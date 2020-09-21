package com.latam.certificacion.aplicacionweblatam.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalComponents {
    public static final Target LINK_MIS_VIAJES = Target
            .the("Link Mis Viajes")
            .locatedBy("(//div[@class='nav-title-column'])[4]");

    public static final Target LINK_DONDE_ENCUENTRAS = Target
            .the("Link donde lo encuentras")
            .locatedBy("//span[text()='¿Dónde lo encuentras?']");

    public static final Target CODIGO_DE_RESERVA = Target
            .the("Codigo de Reserva")
            .locatedBy("//span[@class='record-locator']");

}