package testng_samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fb_test1 {
			WebDriver driver;
	@BeforeMethod
	public void setup( ) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void  search() {
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("siri.sirisha.m@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sree141001410fb");
		driver.findElement(By.xpath("//button[@class ='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy' and @name ='login']")).click();
	}
		@AfterMethod
		public void close()
		{
			driver.close();
		}

}
