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
import pageObjects.AccidentesPersPage;

public class ExpertaSteps {

	WebDriver driver;
	ExpertaHomePage home;
	SeguroAutoPage auto;
	AccidentesPersPage accPers;
	
	@Given("^accedo a la página Experta Seguros$")
	public void accedo_a_la_página_Experta_Seguros() throws Throwable {
		System.out.println("Abre el navegador y direcciona a la página de Experta Seguros.");
		System.setProperty("webdriver.chrome.driver", ".\\src\\drivers\\chromedriver.83.0.4103.39.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.experta.com.ar/");
		home = new ExpertaHomePage(driver);
		auto = new SeguroAutoPage(driver);
		accPers = new AccidentesPersPage(driver);
	}

	@Given("^hago clic en el menú Seguros, en la pantalla Experta$")
	public void hago_clic_en_el_menú_Seguros_en_la_pantalla_Experta() throws Throwable {
		System.out.println("Selecciona el menú Seguros, en la pantalla Experta Home.");
	    home.cliquea_MenuSeguros();
	}

	@Given("^hago clic en la opcion Autos, en la pantalla Experta$")
	public void hago_clic_en_la_opcion_Autos_en_la_pantalla_Experta() throws Throwable {
		System.out.println("Selecciona la opcion Autos, en la pantalla Experta Home.");
	    home.cliquea_OpcionAutos();
	}
	
	@Given("^hago clic en el botón Lupa, en la pantalla Experta$")
	public void hago_clic_en_boton_Lupa_en_la_pantalla_Experta() throws Throwable {
		System.out.println("Selecciona la opcion Lupa, en la pantalla Experta Home.");
	    home.cliquea_BotonLupa();
	}
	
	@Given("^selecciono la opción \"([^\"]*)\", en la pantalla Experta$")
	public void selecciono_la_opcion_en_pantalla_Experta(String opcion) throws Throwable {
		driver.navigate().to(home.selecciona_URLCotizarAccidentePers());
	}
	
	@Given("^ingreso en el campo \"([^\"]*)\" el valor \"([^\"]*)\", en la pantalla Experta$")
	public void ingreso_campo_valor_en_la_pantalla_Experta(String campo, String valor) throws Throwable {
		System.out.println("Ingresa en el campo "+campo+" el valor "+valor+", en la pantalla Experta Home.");
		switch (campo) {
			case "Buscar":
				home.ingresa_TextoABuscar(valor);
				home.confirma_TextoABuscar();
				break;
			default:
				System.out.println("Opción ingresada no contemplada. Verificar. ");
				break;
		}
	}

	@When("^ingreso en el campo \"([^\"]*)\" el valor \"([^\"]*)\", en la pantalla Seguro Auto$")
	public void ingreso_campo_valor_en_la_pantalla_Seguro_Auto(String campo, String valor) throws Throwable {
		System.out.println("Ingresa en el campo "+campo+" el valor "+valor+", en la pantalla Seguro Auto.");
		switch (campo) {
			case "Nombre":
				auto.ingresa_Nombre(valor);
				break;
			case "Celular":
				auto.ingresa_Celular(valor);
				break;
			case "Codigo Postal":
				auto.ingresa_CodigoPostal(valor);
				break;
			case "Email":
				auto.ingresa_Email(valor);
				break;
			default:
				System.out.println("Opción ingresada no contemplada. Verificar. ");
				break;
		}
	}

	@When("^hago clic en el botón Quiero Ser contactado, en la pantalla Seguro Auto$")
	public void hago_clic_en_el_botón_Quiero_Ser_contactado_en_la_pantalla_Seguro_Auto() throws Throwable {
		System.out.println("Habilita el boton 'Quiero Ser Contactado' y le hace clic, en la pantalla Seguro Auto.");
	    // Desbloqueo del botón Quiero Ser Contactado, quitandole el valor 'Disabled'
		JavascriptExecutor ejecutor = (JavascriptExecutor)driver;
		ejecutor.executeScript("document.getElementById('"+auto.valor_IdBoton()+"').removeAttribute('disabled')");
		// Hace clic sobre el boton habilitado
		auto.cliquea_QuieroSerContactado();
	}

	@Then("^veo en el botón el mensaje \"([^\"]*)\", en la pantalla Seguro Auto$")
	public void veo_en_el_botón_el_mensaje_pantalla_Seguro_Auto(String resultadoEsperado) throws Throwable {
		String mensaje = "El mensaje esperado es. '"+resultadoEsperado+"', se obtuvo el mensaje: '"+auto.verifica_EnvioExitoso()+"'.";
		System.out.println(mensaje);
	    Assert.assertEquals(mensaje,auto.verifica_EnvioExitoso(), resultadoEsperado);
	    driver.quit();
	}
	
	@When("^selecciono en el dropdwon \"([^\"]*)\" la opción \"([^\"]*)\", en la pantalla Accidentes Personales$")
	public void selecciono_dropdown_opcion_en_la_pantalla_Accidentes_Personales(String campo, String valor) throws Throwable {
		System.out.println("Ingresa en el campo "+campo+" el valor "+valor+", en la pantalla Accidentes Personales.");
		switch (campo) {
			case "Actividad":
				accPers.selecciona_Actividad(valor);;
				break;
			case "Cantidad de Personas":
				accPers.selecciona_CantidadPersonas(valor);;
				break;
			case "Período":
				accPers.selecciona_periodo(valor);;
				break;
			default:
				System.out.println("Opción ingresada no contemplada. Verificar. ");
				break;
		}
	}
	
	@When("^ingreso en el campo \"([^\"]*)\" el valor \"([^\"]*)\", en la pantalla Accidentes Personales$")
	public void ingreso_campo_valor_en_la_pantalla_Accidentes_Personales(String campo, String valor) throws Throwable {
		System.out.println("Ingresa en el campo "+campo+" el valor "+valor+", en la pantalla Accidentes Personales.");
		switch (campo) {
			case "Nombre":
				accPers.ingresa_Nombre(valor);
				break;
			case "Apellido":
				accPers.ingresa_Apellido(valor);
				break;
			case "Email":
				accPers.ingresa_Email(valor);
				break;
			case "Prefijo":
				accPers.ingresa_Prefijo(valor);
				break;
			case "Telefono":
				accPers.ingresa_Telefono(valor);
				break;
			case "Fecha Desde":
				accPers.ingresa_FechaDesde(valor);
				accPers.confirma_FechaDesde();
				break;
			case "Fecha Hasta":
				accPers.ingresa_FechaHasta(valor);
				break;
			default:
				System.out.println("Opción ingresada no contemplada. Verificar. ");
				break;
		}
	}
	
	@Given("^hago clic en el botón Cotiza, en la pantalla Accidentes Personales$")
	public void hago_clic_en_el_boton_Cotiza_en_la_pantalla_Accidentes_Personales() throws Throwable {
		System.out.println("Hace clic en el botón Cotizá, en la pantalla Accidentes Personales.");
	    accPers.cliquea_BotonCotiza();
	}
	
}
