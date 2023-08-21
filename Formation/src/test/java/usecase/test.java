package usecase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fr-fr.facebook.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement btn ;
		btn = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		btn.click();
		WebElement n , p , e , ne ,mp ,j,m,a,btnh,btnc;
		n = driver.findElement(By.xpath("//input[@name='firstname']"));
		n.sendKeys("rami");
		p = driver.findElement(By.xpath("//input[@name='lastname']"));
		p.sendKeys("allagui");
		e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		ne = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		e.sendKeys("rami.allagui@gmail.fr");
		Actions action = new Actions(driver);
		action.keyDown(e,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(ne,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		mp = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		mp.sendKeys("rami1234");
		j = driver.findElement(By.xpath("//select[@title='Jour']"));
		Select s = new Select (j) ;
		s.selectByValue("18");
		m = driver.findElement(By.xpath("//select[@title='Mois']"));
		Select b = new Select (m) ;
		b.selectByValue("12");
		a= driver.findElement(By.xpath("//select[@title='Année']"));
		Select c = new Select (a) ;
		c.selectByValue("1994");
		btnh = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		btnh.click();
		btnc = driver.findElement(By.xpath("//button[@name='websubmit']"));
		btnc.click();
		

	}

}
