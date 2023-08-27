package testcucmb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Multiauthe {
	
	WebDriver driver;
	
	@Given("ovrir navigateuuur")
	public void ovrir_navigateuuur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
	    
	}

	@Given("ovrir urllll {string}")
	public void ovrir_urllll(String string) {
		driver.get(string);
	    
	}

	@When("saisir  usernaimmmm {string}")
	public void saisir_usernaimmmm(String string) {
		WebElement user ;
		user = driver.findElement(By.name("username"));
		user.sendKeys(string);
	   
	}

	@When("saisir mdpppp {string}")
	public void saisir_mdpppp(String string) {
		WebElement mdp ;
		mdp = driver.findElement(By.name("password"));
		mdp.sendKeys(string);
	    
	}

	@When("cliquer sur bouton loguiiii")
	public void cliquer_sur_bouton_loguiiii() {
		WebElement btn ;
		btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btn.click();
	   
	}

	@Then("virifier le message d erreur {string}")
	public void virifier_le_message_d_erreur(String string) {
		WebElement profil;
		profil =driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String text;
		text= profil.getText();
		Assert.assertEquals(string, text);
		driver.close();
	    
	}




}
