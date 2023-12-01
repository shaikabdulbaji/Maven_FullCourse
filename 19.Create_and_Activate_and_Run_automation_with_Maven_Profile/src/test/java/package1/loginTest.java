package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	@Test
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

	
	@Test
	public void sanityTest() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(" ---> Sanity Test Automation is Completed <--- ");
		
		driver.quit();
	}
	
	@Test
	public void smokeTest() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(" ---> Smoke Test Automation is Completed <--- ");
		
		driver.quit();
	}
	
	@Test
	public void regressionTest() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(" ---> Regression Test Automation is Completed <--- ");
		
		driver.quit();
	}

}
