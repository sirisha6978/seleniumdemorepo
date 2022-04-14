package testng_samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_popups {
	WebDriver driver ;
		
	@BeforeMethod
	public void set_up() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");  // open it 1st
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement w = driver.findElement(By.linkText("JavaScript Alerts"));
w.click();
	}
//simple alert
/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
Thread.sleep(3000);
 Alert a =driver.switchTo().alert();
 System.out.println (a.getText() );
 a.accept();
 String text =driver.findElement(By.xpath("//*[@id='result']")).getText();
 System.out.println(text);*/

 //conformation alerts
 @Test
 public void conformation_alert()
 {
 driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
 Alert a2 = driver.switchTo().alert();
 System.out.println (a2.getText() );
 a2.dismiss();
 String text1 =driver.findElement(By.xpath("//*[@id='result']")).getText();
 System.out.println(text1);
 }


//promptalerts:
 @Test
 public void promptalerts_alert()
 {

driver.findElement(By.xpath("//*[contains(text(),'Click for JS Prompt')]")).click();
Alert a3 = driver.switchTo().alert();
System.out.println(a3.getText() );
a3.sendKeys("ok");
a3.accept();
String x=driver.findElement(By.xpath("//*[@id='result']")).getText();
System.out.println(x);

 }





	}
	
	
	
	
	
