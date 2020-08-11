package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SeguroAutoPage {

	public SeguroAutoPage (WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	//
	@FindBy(how=How.ID,using="last_name")
	private WebElement tbxNombre;
	@FindBy(how=How.ID,using="mobile")
	private WebElement tbxCelular;
	@FindBy(how=How.ID,using="zip")
	private WebElement tbxCodPos;
	@FindBy(how=How.ID,using="email")
	private WebElement tbxEmail;
	@FindBy(how=How.XPATH,using="//button[contains(@id,'btn-') and contains(@class,'btn-contact-auto')]")
	private WebElement btnContactado;
	@FindBy(how=How.XPATH,using="//button[contains(@id,'btn-') and contains(@class,'exitoso')]")
	private WebElement btnEnvio;
	//
	public void ingresa_Nombre(String nombre) {
		tbxNombre.sendKeys(nombre);
	}
	public void ingresa_Celular(String celular) {
		tbxCelular.sendKeys(celular);
	}
	public void ingresa_CodigoPostal(String codpos) {
		tbxCodPos.sendKeys(codpos);
	}
	public void ingresa_Email(String email) {
		tbxEmail.sendKeys(email);
	}
	public void cliquea_QuieroSerContactado() {
		btnContactado.click();;
	}
	public String valor_IdBoton() {
		return btnContactado.getAttribute("id");
	}
	public String verifica_EnvioExitoso() throws InterruptedException {
		Thread.sleep(2500);
		return btnEnvio.getText();
	}
	
}
