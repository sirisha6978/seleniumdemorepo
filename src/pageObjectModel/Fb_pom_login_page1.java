package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_pom_login_page1 {
	
	WebDriver driver;
	@FindBy(name="email") WebElement Email_Address_Or_Phone_Number;
	@FindBy(name="pass")WebElement Password;
	@FindBy(name="login") WebElement Login;
	
	 Fb_pom_login_page1 (WebDriver d)
	{
		this.driver = driver;
		driver =d;
		PageFactory.initElements(d, this);
	}
	public void Setemail(String mail)
	{
		 Email_Address_Or_Phone_Number.sendKeys(mail);
	}
	
	public void Setpass(String pass)
	{
		Password.sendKeys(pass);
			}
	
	public void Setlogin()
	{
		Login.click();
	}
	
	

}
