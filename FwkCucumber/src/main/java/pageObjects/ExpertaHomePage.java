package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExpertaHomePage {

	public ExpertaHomePage (WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	
	//
	@FindBy(how=How.XPATH,using="//div[@id='desktopMenu']/div[1]/p")
	private WebElement btnSeguros;
	@FindBy(how=How.XPATH,using="//li[@id='menu-item-4673']/a")
	private WebElement btnAutos;
	
	//
	public void cliquea_MenuSeguros() {
		btnSeguros.click();
	}
	public void cliquea_OpcionAutos() {
		btnAutos.click();
	}
	
}
