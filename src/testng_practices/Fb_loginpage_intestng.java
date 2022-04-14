package testng_practices;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fb_loginpage_intestng {
	WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
			}
	@Test
	public void  login_fb()
	{
		driver.get("https://www.facebook.com/");
	}
		@AfterMethod
	public void log_out()
	{
		driver.close();
	}
	
	
	

}
