package pageObjectModel;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Registration_test {
	@Test
	public void verifyflighreg(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Registration_page1 reg_obj1 = new Registration_page1(driver);
		//Registration_page2 obje creation
			Registration_page2 obj1 = new Registration_page2(driver);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		reg_obj1. Click_reg_link();
		reg_obj1.SetFirstName("sirisha");
		reg_obj1.SetLastName("m"); 
		reg_obj1. Setphone("9177523065");
		reg_obj1.SetEmail("siri.srisha.m@gmail.com");
		reg_obj1.SetAddress("khammam");
		reg_obj1.Setcity("khammam");
		reg_obj1.Setstate("Telangana");
		reg_obj1.Setpostal_code("507003");
		reg_obj1.Setcountry("India");
		reg_obj1.Setusername("makemytripsree1");
		reg_obj1.Setpassword("Makemytripsree1@");
		reg_obj1.Setconfirmpassword("Makemytripsree1@");
		reg_obj1.Setsubmit_button();
	
		//validation:
		if(driver.getPageSource().contains("Thank you for registering") )
		{
			System.out.println("you registrered successfully,  TEST PASSED");
		}
		else
		{
			System.out.println("you registrered faield,  TEST FAIELD");
		}

		driver.close();
	}

}
