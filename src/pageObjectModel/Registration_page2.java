package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Registration_page2 {
		WebDriver driver;
@FindBy(how=How.NAME, using="REGISTER") WebElement  Register_link;
@FindBy( name = "firstName")WebElement First_Name;
@FindBy(name = "lastName") WebElement Last_name;
@FindBy(how=How.NAME ,using= "phone")WebElement phone;
@FindBy(how=How.NAME,using="userName") WebElement Email;
@FindBy(how=How.NAME,using="address1") WebElement Address;
@FindBy(how=How.NAME,using="city")WebElement city;
@FindBy(how=How.NAME,using="state")WebElement state;
@FindBy(how=How.NAME, using ="postalCode")WebElement postal_code;
@FindBy(how=How.NAME, using="country")WebElement country;
@FindBy(name= "email" )WebElement  Username;
@FindBy(name="password") WebElement password;
@FindBy(name="confirmPassword") WebElement confirm_password;
@FindBy(name="submit") WebElement Submit;

Registration_page2 (WebDriver d){
	this.driver=driver;
driver = d;
PageFactory.initElements(d, this);
}
public void click_reg()
{
	Register_link.click();
}
public void SetfirstName(String fname)
{
	First_Name.sendKeys(fname);
}
public void SetLast_name(String lname)
{
	Last_name.sendKeys(lname);
	}
public void Setphone(String phone_number)
{
	phone.sendKeys(phone_number);
}
public void SetEmail(String mail_id)
{
	Email.sendKeys(mail_id);
}
public void SetAddress(String Add) {
	Address.sendKeys(Add);
	}
public void Setcity(String  city_name)
{
	city.sendKeys( city_name);
}
public void Seystate (String state_name ) {
	state.sendKeys(state_name );
	}
public void Set_postal_code(String  pc)
{
	 postal_code.sendKeys(pc);
}
public void Setcountry(String country_name)
{
	country.sendKeys(country_name);
	//Select drop = new Select(country);
	//drop.selectByVisibleText(country_name);
}
public void SetUsername(String Uname)
{
	Username.sendKeys(Uname);
}
public void Setpassword(String pword)
{
	password.sendKeys(pword);
	}
public void Setconfirm_password(String cpass)
{
	confirm_password.sendKeys(cpass);
}
public void SetSubmit()
{
	 Submit.click();
	 
}























}
