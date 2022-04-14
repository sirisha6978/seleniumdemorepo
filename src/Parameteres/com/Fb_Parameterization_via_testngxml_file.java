package Parameteres.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Fb_Parameterization_via_testngxml_file
{
	WebDriver  driver;
	
@Test
@Parameters({ "browser", "emailId", "password"})
public void fb_login(String environment ,String browser ,String url , String  emailId, String password) {
						if (browser.equals("chrome"))
						{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
						else
							if(browser.equals("firefox"))
							{
								System.setProperty("webdriver.gecko.driver", "D:\\selenium\\BROWESER DRIVERS\\geckodriver-v0.27.0-win64\\geckodriver.exe");
							}
		driver.get(url);
		
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("siri.sirisha.m@gmail.com");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sree141001410fb");
	driver.findElement(By.xpath("//button[@class ='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy' and @name ='login']")).click();
	
}
	

}
