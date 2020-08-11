package stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ExpertaHomePage;
import pageObjects.SeguroAutoPage;

public class ExpertaSteps {

	WebDriver driver;
	ExpertaHomePage home;
	SeguroAutoPage auto;
	
	@Given("^accedo a la página Experta Seguros$")
	public void accedo_a_la_página_Experta_Seguros() throws Throwable {
		System.out.println("Abre el navegador y direcciona a la página de Experta Seguros. ");
		System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.83.0.4103.39.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.experta.com.ar/");
		home = new ExpertaHomePage(driver);
		auto = new SeguroAutoPage(driver);
	}

	@Given("^hago clic en el menú Seguros, en la pantalla Experta$")
	public void hago_clic_en_el_menú_Seguros_en_la_pantalla_Experta() throws Throwable {
	    home.cliquea_MenuSeguros();
	}

	@Given("^hago clic en la opcion Autos, en la pantalla Experta$")
	public void hago_clic_en_la_opcion_Autos_en_la_pantalla_Experta() throws Throwable {
	    home.cliquea_OpcionAutos();
	}

	@When("^ingreso en el campo Nombre el valor \"([^\"]*)\", en la pantalla Seguro Auto$")
	public void ingreso_en_el_campo_Nombre_el_valor_en_la_pantalla_Seguro_Auto(String nombre) throws Throwable {
	    auto.ingresa_Nombre(nombre);
	}

	@When("^ingreso en el campo Celular el valor \"([^\"]*)\", en la pantalla Seguro Auto$")
	public void ingreso_en_el_campo_Celular_el_valor_en_la_pantalla_Seguro_Auto(String celular) throws Throwable {
	    auto.ingresa_Celular(celular);
	}

	@When("^ingreso en el campo Codigo Postal el valor \"([^\"]*)\", en la pantalla Seguro Auto$")
	public void ingreso_en_el_campo_Codigo_Postal_el_valor_en_la_pantalla_Seguro_Auto(String codpos) throws Throwable {
	    auto.ingresa_CodigoPostal(codpos);
	}

	@When("^ingreso en el campo Email el valor \"([^\"]*)\", en la pantalla Seguro Auto$")
	public void ingreso_en_el_campo_Email_el_valor_en_la_pantalla_Seguro_Auto(String email) throws Throwable {
	    auto.ingresa_Email(email);
	}

	@When("^hago clic en el botón Quiero Ser contactado, en la pantalla Seguro Auto$")
	public void hago_clic_en_el_botón_Quiero_Ser_contactado_en_la_pantalla_Seguro_Auto() throws Throwable {
	    // Desbloqueo del botón
		JavascriptExecutor ejecutor = (JavascriptExecutor)driver;
		ejecutor.executeScript("document.getElementById('"+auto.valor_IdBoton()+"').removeAttribute('disabled')");
		//Acción sobre el botón desbloqueado
		auto.cliquea_QuieroSerContactado();
	}

	@Then("^veo en el botón el mensaje \"([^\"]*)\"$")
	public void veo_en_el_botón_el_mensaje(String arg1) throws Throwable {
		System.out.println("Mensaje obtenido: "+auto.verifica_EnvioExitoso());
	    Assert.assertEquals(auto.verifica_EnvioExitoso(), "ENVÍO EXITOSO");
	}
}
