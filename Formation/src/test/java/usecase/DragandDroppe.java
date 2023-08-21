package usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragandDroppe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(5000);
		WebElement dr ;
		dr = driver.findElement(By.id("draggable"));
		WebElement dp ;
		dp = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dr, dp).perform();
		String msg;
		msg =dp.getText();
		Assert.assertEquals("Dropped!",msg);
		System.out.println("drag And Drop ok");
		driver.close();
		

	}

}
