package testng_samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_ParallelTesting {
	
	WebDriver driver;
	@Parameters("browser_name")
	@BeforeTest
	public void set_up(String browser) {
		System.out.println("browser name is............." + browser);
		System.out.println("thread id is......." +Thread.currentThread().getId());
		if(browser.equals("chrome"))
		{		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
			}
		else
			if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.ie.driver","D:\\selenium\\BROWESER DRIVERS\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else
				if(browser.equals("internetExplorer"))
				{
					System.setProperty("webdriver.ie.driver","D:\\selenium\\BROWESER DRIVERS\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
			
	}
@Test
public void test()
{
	driver.get("http://facebook.com");
}

@AfterTest
public void test_close() {
	driver.close();

}
}
