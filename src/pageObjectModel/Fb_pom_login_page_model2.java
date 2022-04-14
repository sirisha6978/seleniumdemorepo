package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb_pom_login_page_model2 {
	WebDriver driver;
	
	By Email = By.name("email");
	By pass=By.name("pass");
	
	
	By log= By.name("login");
	Fb_pom_login_page_model2(WebDriver d)
	{
		this.driver = driver;
		driver = d;
	}
	public void Setuser_name(String mail_id)
	{
	driver.findElement(By.name("Email")).sendKeys(mail_id);
}
public void Setpassword(String pword)
{
	driver.findElement(By.name("pass")).sendKeys("pword");
}
public void Setlogin_button(String log)
{
	driver.findElement(By.name("login")).sendKeys(log);
}
	
}