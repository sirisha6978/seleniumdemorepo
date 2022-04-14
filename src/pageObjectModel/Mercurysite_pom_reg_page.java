package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Mercurysite_pom_reg_page<WebEelemnt, WebEelement> {	
	/*Note in this identification and locating elements in single stmt.
	 * ex:@FindBy(how=How.ID, using = "ACC_FIRST_NAME") WebElement FirstName;
	//@FindBy(name = "Firstname") WebElement first_name;
	in below methods any where we dont use the findelement methods. bcz we are uisng @FindBy method.
	 */
	WebDriver driver;
	@FindBy(how = How.LINK_TEXT, using  =   "REGISTER") 	WebElement RegisterLink;
	@FindBy(how=How.ID, using = "ACC_FIRST_NAME") WebElement FirstName;
	//@FindBy(name = "Firstname") WebElement first_name;
	@FindBy(name = "last_name") WebElement Last_Name ;
	@FindBy(name="user_email") WebElement Email_Address;
	@FindBy(name="user_password ") WebElement Set_a_Password;
	@FindBy(id = "acc_user_passconf") WebElement  Confirm_Password;
	@FindBy(name="countrycode")WebElement Country_Code;
	@FindBy(id="acc_mobile_no")WebElement Mobile_Number;
@FindBy(name= "REGISTER") WebEelement Register;

	//creating constractor:  
	Mercurysite_pom_reg_page(WebDriver d) 
	{
		//	this.driver = driver;
		driver = d; 
		PageFactory.initElements(d, this);
	}
	public void Click_Register()
	{
		RegisterLink.sendKeys();
	}
	public void SetFirst_name(String fname) 
	{
		FirstName.sendKeys(fname);
	} 
	public void SetLastname(String lname)
	{
		Last_Name.sendKeys(lname);
	}
	public  void SetEmail(String  email)
	{
		Email_Address.sendKeys(email);
	}
	public void Setpassword(String password)
	{
		Set_a_Password.sendKeys(password);
	}
	public void Set_conpassword(String cpass)
	{
		Confirm_Password.sendKeys(cpass);
	}
	public void SetCountryCode(String ccode)
	{
		Country_Code.sendKeys(ccode);
	}
	public void Setnumber(String phone)
	{
		Mobile_Number.sendKeys(phone);
	}

	public void SetRegister(String register)
	{
	Click_Register();
	}
	
	
	
	
	
	
	
	
	
	
}