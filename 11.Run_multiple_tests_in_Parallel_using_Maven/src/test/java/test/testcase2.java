package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase2 {

	@Test
	public void firefoxBrowserTest1() throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");
		
		Thread.sleep(6000);

		driver.quit();

	}

	@Test
	public void firefoxBrowserTest2() throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.gmail.com/");
		
		Thread.sleep(6000);

		driver.quit();
	}

}
