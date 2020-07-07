package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Search")).click();
		System.out.println(driver.getTitle());
		Select se = new Select(driver.findElement(By.name("category_id")));
		se.selectByIndex(0);
		driver.findElement(By.name("s_keyword")).sendKeys("Test");
		driver.findElement(By.name("price_from")).sendKeys("100");
		driver.findElement(By.name("price_to")).sendKeys("10");
		Select se1 = new Select(driver.findElement(By.name("productsOrder")));
		se1.selectByVisibleText("Product");
		Select se2= new Select(driver.findElement(By.name("productsDir")));
		se2.selectByValue("DESC");
		Select se3= new Select(driver.findElement(By.name("productsPageSize")));
		se3.selectByValue("10");
		List<WebElement> options = se1.getOptions();
		System.out.println(options.size());
		driver.findElement(By.name("DoSearch")).click();
		
		
		
	}

}
