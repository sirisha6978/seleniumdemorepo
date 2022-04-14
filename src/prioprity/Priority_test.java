package prioprity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_test {
	WebDriver driver;
	@BeforeMethod
	public void setup( ) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://edureka.co");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}	
	/*@Test
	public void sign_up() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class= 'signup_click signup-vd giTrackElementHeader '] ")).click();
		driver.findElement(By.xpath("//*//*[@id='si_popup_email']")).sendKeys("siri.sirisha6979@gmail.com");
		driver.findElement(By.xpath("//*[@id='si_popup_passwd']")).sendKeys("Sreeedureka123@");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
		}*/
	@Test(priority =0)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Log In') and @class='login_click login-vd giTrackElementHeader ']")).click();
		driver.findElement(By.xpath("//*[@id='si_popup_email' and @class ='control_place popusreml']")).sendKeys("siri.sirisha6979@gmail.com");
		driver.findElement(By.xpath("//*[@id='si_popup_passwd' and @class ='control_place pass_in']")).sendKeys("Sreeedureka123@");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void  search() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='search_header']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='search-input']")).click();
		Thread.sleep(2000);
				driver.findElement(By.linkText("Big Data Hadoop Certification Training Course")).click();
				Thread.sleep(2000);
	}
	@Test(priority=1)
	public void course()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Courses')][1]")).click();
	}

@Test(priority=3)
public void big_data() {
	driver.findElement(By.linkText("Big Data")).click();
}




}