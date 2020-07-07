package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestNgParallel1 {
	
	@Test (threadPoolSize=3,invocationCount=3,timeOut=1000)
	public void chromeDriver() {
		System.out.println("Chromedriver :" + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("TestNG Annotations");
		System.out.println(driver.getTitle());
		//driver.close();
	}
	
	@Test
	public void firefoxDriver() {
		System.out.println("Firefoxdriver :" + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		//driver.findElement(By.name("q")).sendKeys("TestNG Annotations");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
