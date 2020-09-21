package com.latam.certificacion.aplicacionweblatam.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/validar_codigo.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.latam.certificacion.aplicacionweblatam.stepdefinitions",
        tags = "")
public class ValidarCodigoRunner {
}
