package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/features",
		glue= {"stepsDefinitions"},
		tags= {"@SeguroAuto"}, // Indicar el tags de los escenarios a ejecutar
		plugin= {"pretty","html:target/reportesCucumber"}
		)

public class TestRunner {

}
