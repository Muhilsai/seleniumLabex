package day5;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,30);
		driver.get("http://google.com");
	}
	
	@Test
	public void testCode() {
		driver.findElement(By.name("q")).sendKeys("TestNG Annotations");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(driver.getClass());
			
	}
	
	@AfterMethod
	public void rampdown() {
		driver.quit();
	}
	
	
	

}
