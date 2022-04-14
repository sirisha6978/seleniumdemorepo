package selenium_takescreenshot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class google_test {
  WebDriver driver;
  @BeforeTest  //preconditions
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver() ;
		driver.get("https://www.google.com");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @Test //actual testing activity 
  public void f() {
  
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@class='gNO89b' and @data-ved='0ahUKEwjVlb_bz4b1AhXvr1YBHQhLAP4Q4dUDCA0']")).click();
	   }
  
  
  @AfterTest  //post conditions
  public void afterTest() {
	  driver.close();
  }

}
