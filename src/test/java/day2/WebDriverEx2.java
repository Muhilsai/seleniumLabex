package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		System.out.println("Home page : " + driver.getTitle());
		driver.findElement(By.name("user_login")).sendKeys("Baby");
		driver.findElement(By.name("user_password")).sendKeys("welcome@123");
		driver.findElement(By.name("first_name")).sendKeys("Baby");
		driver.findElement(By.name("last_name")).sendKeys("chellam");
		driver.findElement(By.name("email")).sendKeys("baby1@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("121, llord street");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		Select sel = new Select(driver.findElement(By.name("state_id")));
		sel.selectByIndex(0); // no dropdown value exist
		driver.findElement(By.name("zip")).sendKeys("60301");
		Select sel1 = new Select(driver.findElement(By.name("country_id")));
		sel1.selectByIndex(0); // no dropdown value exist
		Select sel2 = new Select(driver.findElement(By.name("gender_id")));
		sel2.selectByIndex(0); // no dropdown value exist
		driver.findElement(By.name("Insert")).click();
		/* Error throws
		User Registration Form	
		The value in field Country is required.
		The value in field Gender is required.
		Database Error: Table 'internet.users' doesn't exist
		 */
		
		
		
		
		

	}

}
