package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {

	@Test
	public void Reg_Test1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		System.out.println("==> Regression Test case 1 has run successfully...");
		
		Thread.sleep(6000);

		driver.close();

	}

	@Test
	public void chromeBrowserTest2() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com/");
		
		Thread.sleep(6000);

		driver.close();

	}
	
	@Test
	public void firefoxBrowserTest1() throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");	
		
		Thread.sleep(6000);
		
		driver.close();
				
	}
	
	@Test
	public void firefoxBrowserTest2() throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.gmail.com/");
		
		Thread.sleep(6000);
	
		driver.close();
				
	}

}
