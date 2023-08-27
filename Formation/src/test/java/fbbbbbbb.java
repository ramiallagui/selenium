import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class fbbbbbbb {WebDriver  driver ;
	@Given("ovrir navigateurrrrrr")
	public void ovrir_navigateurrrrrr() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@Given("vrir urllllllll")
	public void vrir_urllllllll() {
		driver.get("https://fr-fr.facebook.com");
	}

	@When("cliqure sur creer nvoo compte")
	public void cliqure_sur_creer_nvoo_compte() {
		WebElement btn ;
		btn = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		btn.click();
	}

	@When("prenommm {string}")
	public void prenommm(String string) {
		WebElement n ;
		n = driver.findElement(By.xpath("//input[@name='firstname']"));
		n.sendKeys(string);
	}

	@When("nommm {string}")
	public void nommm(String string) {
		 WebElement p ;
			p = driver.findElement(By.xpath("//input[@name='lastname']"));
			p.sendKeys(string);
	}

	@When("e-maillll {string}")
	public void e_maillll(String string) {
		 WebElement e ;
		 e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			e.sendKeys(string);
	}

	@When("comf e-mailllll")
	public void comf_e_mailllll() {
		 WebElement e,ne ;
		 e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		 ne = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		Actions action = new Actions(driver);
		action.keyDown(e,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(ne,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

	@When("mdddd {string}")
	public void mdddd(String string) {
		WebElement mp ;
		 mp = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			mp.sendKeys(string);
	}

	@When("jjjjj {string}")
	public void jjjjj(String string) {
		 WebElement j ;
			j = driver.findElement(By.xpath("//select[@title='Jour']"));
			Select s = new Select (j) ;
			s.selectByValue(string);
	}

	@When("mmmm {string}")
	public void mmmm(String string) {
		 WebElement m ;
		 m = driver.findElement(By.xpath("//select[@title='Mois']"));
			Select s = new Select (m) ;
			s.selectByValue(string);
	}

	@When("aaaa {string}")
	public void aaaa(String string) {
		 WebElement a ;
		 a= driver.findElement(By.xpath("//select[@title='Année']"));
			Select s = new Select (a) ;
			s.selectByValue(string);
	}

	@When("genreeee {string}")
	public void genreeee(String string) {
		 WebElement btnh ;
		 if (string.equals("h"))
		 {
			btnh = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
			btnh.click();
	}
		 else if( string.equals("f")) {
				btnh = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
				btnh.click();
		}
		 else  {
				btnh = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
				btnh.click();
	}
	}

	@When("clique sur sinscrire")
	public void clique_sur_sinscrire() {
		WebElement btnc ;
		btnc = driver.findElement(By.xpath("//button[@name='websubmit']"));
		btnc.click();
	}
}
