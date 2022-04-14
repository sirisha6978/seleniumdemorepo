package Parameteres.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_providers {

	WebDriver driver;	
	@BeforeTest
	public void set_up() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}

	@Test(dataProvider ="logindetails")
	public void login_valid_data(String email_id , String password ) {
		boolean result = true;
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email_id);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		WebElement  submit =	driver.findElement(By.xpath("//*[@id='loginbutton']"));
		submit.click();
		if(driver.getCurrentUrl().equals("https://www.facebook.com")	 ){
			driver.findElement(By.xpath("//*[@class='a8c37x1j ms05siws hwsy1cff b7h9ocf4 eltiug27 jnigpg78 odw8uiq3']")).click();
			WebElement logout =driver.findElement(By.xpath("//*[@xpath='1']"));
			logout.click();
			result = false;
			if(result)
			{
				WebElement authetication = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[1]/div[2]"));
				Assert.assertTrue( authetication.isDisplayed());

			}
		}
	}
		@DataProvider(name="logindetails")

		public Object[][] get_logindetails() {
			return new  Object [][] {

				{ "siri.sirisha.m@gmail.com", "sree141001410fb"},
				{ "siri.sirisha.m@gmail.com", "sree141001410fb1"}
			};
		}
		public void Log_out()
		{
driver.close();
		}

	}
