package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Mercurysite_pom_reg_test {
	private WebDriver driver;
	@Test
	public void reg_page() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Mercurysite_pom_reg_page obj = new Mercurysite_pom_reg_page(driver);
		obj.Click_Register();
		obj.SetFirst_name("sirisha");
		obj.SetLastname("m");
		obj.SetEmail("siri.sirisha.m@gmail.com");
		obj.Setpassword("Mercury1234@");
		obj.Set_conpassword("Mercury1234@");
		obj.SetRegister(null);


		//validation:

















	}

}
