package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",
		glue= {"stepsDefinitions"},
		tags= {"@Prueba"}, // Indicar el tags de los escenarios a ejecutar
		plugin= {"pretty","html:target/reportesCucumber"}
		)

public class TestRunner {

}
