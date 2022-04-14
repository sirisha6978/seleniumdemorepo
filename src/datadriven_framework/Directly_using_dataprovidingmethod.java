package datadriven_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Directly_using_dataprovidingmethod {
	//note: in this we are providing the data directly into a dataprovider method().
	WebDriver driver = new ChromeDriver();
	@BeforeClass
	public void set_up()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider = "LoginData")
	public void login_test(String user , String pass , String exp){
		driver.get("https://admin-demo.nopcommerce.com/login");  // open it 1st
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
		String expected_titile = "Dashboard / nopcommerce administration";
		String act_titile = driver.getTitle();
		if( exp.equals("valid"))
		{
			if(expected_titile.equals(act_titile))
			{
				driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if( exp.equals("invalid"))
		{
			if(expected_titile.equals(act_titile))
			{
				driver.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
				Assert.assertTrue(false);
			}
			else	
			{
				Assert.assertTrue(true);
			}
		}
	}		

	@DataProvider(name ="LoginData")
	public String [] [] getData()
	{

		String login_data [][]  = { 
				{"admin@yourstore.com", "admin", "valid"},
				{"admin@yourstore.com",  "adm", "invalid"},
				{"adm@yourstore.com","admin", "invalid"},
				{"adm@yourstore.com","adm", "invalid"},
		};
		return login_data;
	}

	@AfterClass
	public void tear_down() {

	}
}
