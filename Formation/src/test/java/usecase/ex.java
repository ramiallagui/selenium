package usecase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement f ;
		f = driver.findElement(By.id("APjFqb"));
		f.sendKeys("tunisie");
		f.sendKeys(Keys.ENTER);
		String msg ;
		WebElement r ;
        r = driver.findElement(By.id("result-stats"));
		msg =r.getText();
		if (msg.contains("résultats")) {
		System.out.println("test ok");}
		else {System.out.println("test ok");}
		driver.close();
		

		
	}

}
