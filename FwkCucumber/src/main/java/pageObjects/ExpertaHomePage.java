package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExpertaHomePage {

	public ExpertaHomePage (WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	// Definición de los elementos de la página
	@FindBy(how=How.XPATH,using="//div[@id='desktopMenu']/div[1]/p")
	private WebElement btnSeguros;
	@FindBy(how=How.XPATH,using="//li[@id='menu-item-4673']/a")
	private WebElement btnAutos;
	@FindBy(how=How.ID,using="searchButton")
	private WebElement btnLupa;
	@FindBy(how=How.ID,using="search-text-header")
	private WebElement tbxBuscar;
	@FindBy(how=How.XPATH,using="//a[contains(@href,'cotizar-seguros-accidentes-personales')]")
	private WebElement lnkCotizaAccPers;
	
	// Definición de las acciones sobre los objectos
	public void cliquea_MenuSeguros() {
		btnSeguros.click();
	}
	public void cliquea_OpcionAutos() {
		btnAutos.click();
	}
	public void cliquea_BotonLupa() {
		btnLupa.click();
	}
	public void ingresa_TextoABuscar(String texto) {
		tbxBuscar.sendKeys(texto);
	}
	public void confirma_TextoABuscar() {
		tbxBuscar.sendKeys(Keys.ENTER);
	}
	public String selecciona_URLCotizarAccidentePers() {
		return lnkCotizaAccPers.getAttribute("href");
	}
	
}
