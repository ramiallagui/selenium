package testcucmb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
 
public class testcum {
	WebDriver  driver ;
	@Given("ovrir navigateu")
	public void ovrir_navigateu() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			}

	@Given("ovrir url")
	public void ovrir_url() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("saisir  usernaim")
	public void saisir_usernaim() {
		WebElement user ;
		user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
	}

	@When("saisir mdp")
	public void saisir_mdp() {
		WebElement mdp ;
		mdp = driver.findElement(By.name("password"));
		mdp.sendKeys("admin123");
		}

	@When("cliquer sur bouton logui")
	public void cliquer_sur_bouton_logui() {
		WebElement btn ;
		btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btn.click();
	}

	@Then("virifier le nom du profil")
	public void virifier_le_nom_du_profil() {
		WebElement profil;
		profil =driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String text;
		text= profil.getText();
		Assert.assertEquals("Paul Collings", text);

	}

}
