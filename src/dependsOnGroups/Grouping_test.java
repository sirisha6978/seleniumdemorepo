package dependsOnGroups;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping_test {

	WebDriver driver;
	@BeforeMethod
	public void setup( ) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.olx.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}	
	@Test(priority=0, groups="homepage")
	public void user_in_on_login_page() {
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	}
	@Test(groups="homepage")
	public void using_phone() {
		driver.findElement(By.xpath("//button[@type ='button'  and @data-aut-id= 'phoneLogin' and @class='rui-39-wj rui-3evoE rui-1JPTg _3IKPU rui-2NuAg'][1]")).click();
	}
	@Test(groups="homepage")
	public void enter_number() {
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("9177523065");
	}
	@Test(groups="logindetails")
	public void click_on_next_button() {
		driver.findElement(By.xpath("//*[@id='phone']")).click();
	}
	@Test(groups="logindetails")
	public void password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sreeolx1@");
	}
	@Test(groups="startpage")
	public void login() {
		driver.findElement(By.xpath("//button[@type='submit' and @class ='rui-39-wj rui-3mpqt rui-1JPTg _2_t7-']")).click();
	}
	@Test(groups="startpage")
	public void main_page() {
		String title =driver.getTitle();
		System.out.println(title);
	}
	@Test(groups="homepag")
	public void  logout() {
		driver.findElement(By.xpath("@class='rui-1gV1x _328CR']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Logout' )]")).click();
	}


}



