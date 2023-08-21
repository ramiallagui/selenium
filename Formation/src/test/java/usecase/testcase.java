package usecase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		

	}

}
