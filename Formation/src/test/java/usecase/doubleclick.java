package usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		WebElement dbl ;
		dbl = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(dbl).perform();
		WebElement text ;
		String msg;
		text = driver.findElement(By.id("doubleClickMessage"));
		msg = text.getText();
		Assert.assertEquals("You have done a double click",msg);
		System.out.println("doubleClick");
		
		WebElement rc ;
		rc = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rc).perform();
		text = driver.findElement(By.id("rightClickMessage"));
		msg = text.getText();
		Assert.assertEquals("You have done a right click",msg);
		System.out.println("You have done a right click");
		driver.close();
		

	}

}
