package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*note: pom is different ways but here we are using one model that is the identified by the elements by uisng BY class and create corresponding variables. 
 * in htis we  dont find  element just instiated. not identified
ex: By First_Name = By.name("firstName");
here by is class
First_Name is variable.
By.name is class
name is locater (here we take any locaters id,name,class name...).
firstname is element value.

identified inside the methods only.

FindElement  we have use in the methods.
ex:public void SetEmail (String mail)
	{
		driver.findElement(Email).sendKeys(mail);
	}

*/
public class Registration_page1 {
	WebDriver driver ;
	By Register_link = By.linkText("REGISTER");
	By First_Name = By.name("firstName");
	By Last_name =  By.name("lastName");
	By phone = By.name("phone");
	By Email = By.id("userName");
	By Address = By.name("address1");
	By city= By.name("city");
	By state = By.name("state");
	By postal_code = By.name("postalCode");
	By country=By.name("country");
	By Username=By.id("email");
	By password=By.name("password");
	By confirm_password = By.name("confirmPassword");
	By Submit = By.name("submit");
	//creating constration: 
	Registration_page1  (WebDriver d)
	{
		//this.driver = driver;
		driver=d;
	}
	public void  Click_reg_link()
	{
		driver.findElement(Register_link).click();
	}
	public void SetFirstName(String Fname)
	{
		driver.findElement(First_Name).sendKeys(Fname);
	}
	public void SetLastName(String Lname)
	{
		driver.findElement(Last_name).sendKeys(Lname);
	}
	public void  Setphone(String p)
	{
		driver.findElement( phone).sendKeys(p);
	}
	public void SetEmail (String mail)
	{
		driver.findElement(Email).sendKeys(mail);
	}
	public void SetAddress(String add1)
	{
		driver.findElement(Address).sendKeys(add1);
	}
	public void Setcity(String c)
	{
		driver.findElement(city).sendKeys(c);
	}
	public void Setstate(String s)
	{
		driver.findElement(state).sendKeys(s);
	}
	public void Setpostal_code(String pc)
	{
		driver.findElement(postal_code).sendKeys(pc);
	}
	public void Setcountry(String country_name)
	{
		driver.findElement(country).sendKeys(country_name);
	}
	public void Setusername(String user_name)
	{
		driver.findElement(Username).sendKeys(user_name);
	}
	public void Setpassword(String p_word)
	{
		driver.findElement(password).sendKeys(p_word);
	}
	public void Setconfirmpassword(String c_password)
	{
		driver.findElement(confirm_password).sendKeys(c_password);
	}
	public void Setsubmit_button()
	{
driver.findElement(Submit).click();
	}
		
	
}