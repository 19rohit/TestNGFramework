import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login {
	WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void AppLaunch() {
		driver.get("http://stage.apf.activatemedia.com/intro");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority=0)
	public void Login()
	{
		System.out.println("Login Fuction Print");
	}

	@Test(priority=1)
	public void Registration()
	{
		driver.findElement(By.linkText("Sign Up")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='select2-arrow']")));
		driver.findElements(By.xpath("//span[@class='select2-arrow']")).get(3).click();
		driver.findElement(By.xpath("//li//div[contains(text(),'Ms.')]")).click();

		driver.findElement(By.id("firstname")).sendKeys("Rohit");
		driver.findElement(By.id("secondname")).sendKeys("Kumar");

		driver.findElements(By.xpath("//span[@class='select2-arrow']")).get(4).click();
		driver.findElement(By.id("s2id_autogen6_search")).click();
		driver.findElement(By.id("s2id_autogen6_search")).sendKeys("india");
		driver.findElement(By.xpath("//div//span[@class='select2-match']")).click();

		driver.findElements(By.xpath("//span[@class='select2-arrow']")).get(5).click();
		driver.findElement(By.id("s2id_autogen5_search")).click();
		driver.findElement(By.id("s2id_autogen5_search")).sendKeys("AgriProFocus Indonesia");
		driver.findElement(By.xpath("//div[contains(text(),'AgriProFocus Indonesia')]")).click();

		driver.findElement(By.id("email")).sendKeys("rohit19@incaendo.com");

		driver.findElements(By.xpath("//span[@class='select2-arrow']")).get(6).click();
		driver.findElement(By.id("s2id_autogen10_search")).click();
		driver.findElement(By.id("s2id_autogen10_search")).sendKeys("+91");
		driver.findElement(By.xpath("//span[contains(text(),'+91')]")).click();

		driver.findElement(By.id("Registration_mobile")).sendKeys("9898989898");

		driver.findElement(By.id("choose")).sendKeys("admin1");
		driver.findElement(By.id("confirm")).sendKeys("admin1");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-submit']")).click();
	}

	@AfterTest
	public void close()
	{
		driver.quit();
	}

}
