package testng_samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_test {
		WebDriver driver;
	@BeforeMethod
	public void setup( ) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void  search() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@class='gNO89b' and @data-ved='0ahUKEwjVlb_bz4b1AhXvr1YBHQhLAP4Q4dUDCA0']")).click();
	}
		@AfterMethod
		public void close()
		{
			driver.close();
		}
	

}
