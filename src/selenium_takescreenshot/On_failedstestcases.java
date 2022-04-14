package selenium_takescreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;
public class On_failedstestcases {
	WebDriver  driver;
	@Test
	public void rediff()
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Assert.assertEquals(driver.getTitle(),  "rediffmail india");
	}
	@Test
	public void remember() {
		boolean b = driver.findElement(By.xpath("//*[@id='remember']")).isEnabled();
Assert.assertEquals(b,    true);
	}
	//it will be works on @test methods, and when we execute the program after  evert test it will be check.
	//here we are using ITestruesult result
	@AfterMethod
	public void aftermethod(ITestResult    result) throws IOException {
		if(result.getStatus()  == ITestResult.FAILURE) {
		TakesScreenshot ts =  ((TakesScreenshot)driver) ;
		File s = ts.getScreenshotAs(OutputType.FILE);
	File  t = new File("C:\\Users\\siris\\OneDrive\\Desktop\\home.png");
	
		Files.copy(s, t);
		//FileHandler.copy(s, t);
	//	FileUtils.copyFile(s,t);
	} 
	 
	}
@BeforeTest
public void beforetes()  {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
@AfterTest
public void aftertest() {
	driver.close();
	
}






  
}
