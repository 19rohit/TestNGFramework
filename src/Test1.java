import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
	
   WebDriver driver = new FirefoxDriver();
   
   @BeforeTest
   public void AppLaunch() {
		driver.get("http://stage.apf.activatemedia.com/intro");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
   
   @Test
   public void Login()
   {
	   driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.id("email")).sendKeys("rohit@incaendo.com");
		driver.findElement(By.id("password")).sendKeys("admin1");
		driver.findElement(By.xpath("//button[@name='yt0']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-xs bootstro-finish-btn']")).click();
		driver.findElement(By.xpath("//li[@class='dropdown hidden-xs']")).click();
		driver.findElement(By.linkText("Log Out")).click();
   }
	
   @AfterTest
   public void close()
   {
	   driver.quit();
   }
	
}
