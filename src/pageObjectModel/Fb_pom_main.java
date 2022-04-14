package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Fb_pom_main {
	@Test
	public void login () {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//creation of objec fb class 1: 
	//	Fb_pom_login_page1  obj = new  Fb_pom_login_page1(driver);
		//creation of objec fb class 2:
		
		Fb_pom_login_page1  obj = new  Fb_pom_login_page1(driver);
		obj.Setemail("siri.sirisha.m@gmail.com");
		obj.Setpass("sree141001410fb");
		obj.Setlogin();
	}
}