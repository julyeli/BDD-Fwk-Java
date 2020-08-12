package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccidentesPersPage {

	public AccidentesPersPage (WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	// Definición de los elementos de la página
	@FindBy(how=How.ID,using="actividades")
	private WebElement selActividad;
	@FindBy(how=How.ID,using="cantidad")
	private WebElement selCantidadPers;
	@FindBy(how=How.ID,using="periodo")
	private WebElement selPeriodo;
	@FindBy(how=How.ID,using="desde")
	private WebElement tbxFechaDesde;
	@FindBy(how=How.ID,using="hasta")
	private WebElement tbxFechaHasta;
	@FindBy(how=How.ID,using="ap-nombre")
	private WebElement tbxNombre;
	@FindBy(how=How.ID,using="ap-apellido")
	private WebElement tbxApellido;
	@FindBy(how=How.ID,using="ap-email")
	private WebElement tbxEmail;
	@FindBy(how=How.ID,using="ap-prefijo")
	private WebElement tbxPrefijo;
	@FindBy(how=How.ID,using="ap-telefono")
	private WebElement tbxTelefono;
	@FindBy(how=How.ID,using="contratar-ap")
	private WebElement btnCotiza;
	//@FindBy(how=How.XPATH,using="//div[contains(class,'pink')]//p[@class='total']/b[2]")
	@FindBy(how=How.XPATH,using="//div[@class='col-md-4 cobertura pink']/form/div[2]/div/p[2]/b[2]")
	private WebElement lblPrecio;
	
	
	// Definición de las acciones sobre los objectos
	public void selecciona_Actividad(String actividad) {
		Select dpdActividad = new Select (selActividad);
		dpdActividad.selectByVisibleText(actividad);
	}
	public void selecciona_CantidadPersonas(String cantidad) {
		Select dpdCantidadPers = new Select (selCantidadPers);
		dpdCantidadPers.selectByVisibleText(cantidad);
	}
	public void selecciona_periodo(String periodo) {
		Select dpdPeriodo = new Select(selPeriodo);
		dpdPeriodo.selectByValue(periodo);
	}
	public void ingresa_FechaDesde(String fechaDesde) {
		tbxFechaDesde.sendKeys(fechaDesde);
	}
	public void confirma_FechaDesde() {
		tbxFechaDesde.sendKeys(Keys.ENTER);
	}
	public void ingresa_FechaHasta(String fechaHasta) {
		tbxFechaHasta.sendKeys(fechaHasta);
	}
	public void ingresa_Nombre(String nombre) {
		tbxNombre.sendKeys(nombre);
	}
	public void ingresa_Apellido(String apellido) {
		tbxApellido.sendKeys(apellido);
	}
	public void ingresa_Email(String email) {
		tbxEmail.sendKeys(email);
	}
	public void ingresa_Prefijo(String prefijo) {
		tbxPrefijo.sendKeys(prefijo);
	}
	public void ingresa_Telefono(String telefono) {
		tbxTelefono.sendKeys(telefono);
	}
	public void cliquea_BotonCotiza() {
		btnCotiza.click();
	}
	public String obtiene_PrecioRecomendado() {
		return lblPrecio.getText();
	}
	
}
