package usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class Mousover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu");
		Thread.sleep(5000);
		WebElement m2 ;
		m2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		Actions action =new Actions (driver) ;
		action.moveToElement(m2).perform();
		

	}

}
