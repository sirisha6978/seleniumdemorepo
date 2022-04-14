package datadriven_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Read_data_from_excel  {
WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.pinterest.com/");  // open it 1st
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
		@Test
	public void pre_reg_test() {
		driver.findElement(By.xpath("//*[contains(text(),'Sign up')][1]")).click();
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email");
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='//*[@id='password']")).sendKeys("createpassword");
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='age']")).sendKeys("age");
		driver.findElement(By.xpath("//*[@id='email']")).clear();	
	driver.findElement(By.xpath("//div[contains(text(),'Continue')][1]")).click();
	
	}	
	@AfterMethod
	public void close()
	{
		driver.quit();
		
	}
}
