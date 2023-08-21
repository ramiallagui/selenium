package usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class authentificaion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement user, mdp ,btn ;
		user = driver.findElement(By.name("username"));
		mdp = driver.findElement(By.name("password"));
		btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		user.sendKeys("Admin");
		mdp.sendKeys("admin123");
		btn.click();
		Thread.sleep(5000);
		WebElement profil;
		profil =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text= profil.getText();
		Assert.assertEquals("Paul Collings", text);
		System.out.println("test ok ");
		driver.close();
		

	}

}
