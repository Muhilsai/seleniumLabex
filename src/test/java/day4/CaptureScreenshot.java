package day4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	public static void main(String[] args) throws IOException {
 

// File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));

	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("http://uniformm1.upskills.in/admin/");
	driver.findElement(By.id("input-username")).sendKeys("admin");
	driver.findElement(By.id("input-password")).sendKeys("admin@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//WebElement but = driver.findElement(By.partialLinkText("Logout"));
//	Point but_location = but.getLocation();
//	System.out.println(but_location);	
//	byte[] ss = ((TakesScreenshot) but_location).getScreenshotAs(OutputType.BYTES);
//	FileOutputStream fos = new FileOutputStream("one.png");
//	fos.write(ss);
//	fos.close();
	
//	import org.apache.commons.io.FileUtils;
//	File ss= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(ss, new File("C:\\Niraimathi\\one.png"));

	byte[] ss= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	new FileOutputStream("HomePage.jpg").write(ss);
 }
}




