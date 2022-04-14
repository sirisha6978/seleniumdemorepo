package Asserts;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_soft_Assert {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void set_up() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@Test
	public void hard_assert() {
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		String expected_title =  "Facebook – log in or sign up";
		Assert.assertEquals(actual_title    ,expected_title  );
		System.out.println("test passed");
	}
	
	@Test
	public void soft_assert() {
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		String expected_title =  "Facebook – log in or sign up1";
		
		SoftAssert  sa = new SoftAssert();
		sa.assertEquals(actual_title    ,expected_title  );
				System.out.println("test passed");
				sa.assertAll();
	}
	
	
	
	
	
	private void soft_assertEquals(String actual_title, String expected_title) {
		// TODO Auto-generated method stub
		
	}


	@AfterTest
	public void tear_down() {
		driver.close();
	}

}
