package java.com.bdd.glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.com.bdd.step.LinioStep;
import java.com.mobile.ManageScenario;
import java.com.mobile.MobileDriverManager;
import java.com.mobile.Util;

public class LinioGlue {

    private LinioStep linioStep;
    private Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario) {
        this.scenario = scenario;
        ManageScenario.setScenario(this.scenario);
        linioStep = new LinioStep();
    }

    @After
    public void afterScenario() {
        if(this.scenario.isFailed())
            Util.takeScreenShoot();

        MobileDriverManager.quitDriver();
    }


    @Given("que me encuentro en la aplicacion de linio")
    public void queMeEncuentroEnLaAplicacionDeLinio() {
            MobileDriverManager.setMobileDriver();
    }


    @When("busco una laptop {string}")
    public void busco_una_laptop(String objeto) {
        linioStep.searchLaptop(objeto);
        Util.takeScreenShoot();
    }

    @Then("deberia obtener mas de un resultado")
    public void deberia_obtener_mas_de_un_resultado() {
        Assertions.assertTrue(linioStep.getSizeResult() > 0, "El tamaño de la lista es igual a 0.");

    }
}
