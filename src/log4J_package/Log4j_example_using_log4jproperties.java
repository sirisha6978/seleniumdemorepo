package log4J_package;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 public class Log4j_example_using_log4jproperties {
	public static void main(String[] args) {
	Logger log =  Logger.getLogger("Log4j_example");
	//when we are creating the logs 2 types  ,  log4j.properties: and logj.xml file:
	//.................................................here we are using log4j.properties:..............................................
		//configure log4j property file:
		
	PropertyConfigurator.configure("Log4j.properties");
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\BROWESER DRIVERS\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("siri.sirisha.m@gmail.com");	
driver.findElement(By.xpath(	"//*[@id='pass']")).sendKeys("sree141001410fb");
driver.findElement(By.xpath("//*[@name='login']")).click();




	}

}
