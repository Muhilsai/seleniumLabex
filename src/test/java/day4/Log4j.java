package day4;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.core.util.Loader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		Logger log = Logger.getLogger("devpinoyLogger");
		
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		log.config("URL Launched");
		driver.findElement(By.name("user_login")).sendKeys("Admin");
		WebElement txt =driver.findElement(By.name("user_login"));
		System.out.println(txt.getAttribute("value"));
		driver.findElement(By.name("user_password")).sendKeys(txt.getAttribute("value"));
		driver.close();

	}

}
