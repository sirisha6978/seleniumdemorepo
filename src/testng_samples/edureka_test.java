package testng_samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class edureka_test {
	WebDriver driver;
	@BeforeMethod
	public void setup( ) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://edureka.co");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test
	public void google_title() {
		String tittle = driver.getTitle();
		System.out.println("titile is................"  +tittle);
	}

	@Test
	public void get_url() {
		String url =driver.getCurrentUrl();
		System.out.println("url is........." +url);
	}

	@AfterMethod
	public void close_google() {
		driver.close();
	}
}