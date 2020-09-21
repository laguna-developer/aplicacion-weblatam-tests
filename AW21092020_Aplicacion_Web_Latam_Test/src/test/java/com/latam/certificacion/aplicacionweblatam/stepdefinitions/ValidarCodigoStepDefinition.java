package com.latam.certificacion.aplicacionweblatam.stepdefinitions;

import com.latam.certificacion.aplicacionweblatam.tasks.Encuentra;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarCodigoStepDefinition {

    @Before
    public void setUpOnStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(elNavegador)));
        OnStage.theActorCalled("Nicolas Alvarino");
    }

    @Managed
    private WebDriver elNavegador;


    @Given("^Nicolas Alvarino se encuentra en el home del sitio web$")
    public void nicolasAlvarinoSeEncuentraEnElHomeDelSitioWeb() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.latam.com/es_co/"));
    }

    @When("^el busca el codigo$")
    public void elBuscaElCodigo() {
        theActorInTheSpotlight().attemptsTo(Encuentra.elCodigo());
    }



    @Then("^el visualizara el codigo de ejemplo$")
    public void elVisualizaraElCodigoDeEjemplo() {


    }


}
