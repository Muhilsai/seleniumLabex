package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestNgParallel {
	
	@Test
	public void chromeDriver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG Annotations");
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@Test
	public void firefoxDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		//driver.findElement(By.name("q")).sendKeys("TestNG Annotations");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
