package testcucmb;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbb {
	WebDriver  driver ;
	@Given("ovrir navigateurr")
	public void ovrir_navigateurr() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@Given("vrir urll")
	public void vrir_urll() {
		driver.get("https://fr-fr.facebook.com");
	}

	@When("cliqure sur creer nvo compte")
	public void cliqure_sur_creer_nvo_compte() {
		WebElement btn ;
		btn = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		btn.click();
	}

	@When("prenom {string}")
	public void prenom(String string) {
		WebElement n ;
		n = driver.findElement(By.xpath("//input[@name='firstname']"));
		n.sendKeys(string);
	}

	@When("nom {string}")
	public void nom(String string) {
	    WebElement p ;
		p = driver.findElement(By.xpath("//input[@name='lastname']"));
		p.sendKeys(string);
	}

	@When("e-mail {string}")
	public void e_mail(String string) {
		 WebElement e ;
		 e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			e.sendKeys(string);
	}

	@When("comf e-mail")
	public void comf_e_mail() {
		 WebElement e,ne ;
		 e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		 ne = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		Actions action = new Actions(driver);
		action.keyDown(e,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(ne,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

	@When("md {string}")
	public void md(String string) {
		 WebElement mp ;
		 mp = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			mp.sendKeys(string);
	}

	@When("jj {string}")
	public void jj(String string) {
		 WebElement j ;
		j = driver.findElement(By.xpath("//select[@title='Jour']"));
		Select s = new Select (j) ;
		s.selectByValue(string);
	}

	@When("mm {string}")
	public void mm(String string) {
		 WebElement m ;
		 m = driver.findElement(By.xpath("//select[@title='Mois']"));
			Select s = new Select (m) ;
			s.selectByValue(string);
	}

	@When("aa {string}")
	public void aa(String string) {
		 WebElement a ;
		 a= driver.findElement(By.xpath("//select[@title='Année']"));
			Select s = new Select (a) ;
			s.selectByValue(string);
	}

	@When("genre")
	public void genre() {
		 WebElement btnh ;
			btnh = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
			btnh.click();
	}

	@When("clique sur s'inscrire")
	public void clique_sur_s_inscrire() {
		WebElement btnc ;
		btnc = driver.findElement(By.xpath("//button[@name='websubmit']"));
		btnc.click();
		
	}

	@Then("affche test ok")
	public void affche_test_ok() {
	    System.out.println("test ok");
	    driver.close();
}
}

