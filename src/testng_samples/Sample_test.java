package testng_samples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_test {
//preconditions (@BeforeSuite,@BeforeClass,@BeforeMethod,@BeforeTest)
  //1
	
	public void setUp() {
		System.out.println("setup ur system properties");
	}
@BeforeTest //2
public void lauch_browser() {
	System.out.println("before class chrome browser launch");
}
@BeforeClass
public void login() { //3
	System.out.println("be fore class login method");
} 
@BeforeMethod//4
	public void enter_url()
	{
		System.out.println("before method enter url");
	}
//test case start with @test
@Test//5 
	public void google_title()
	{
		System.out.println(" test 1 google title test");
	}
@Test
public void enter_user_name()
{
	System.out.println("test 2 enter user name");
}
@Test
public void  enterpassword() {
	System.out.println("test 3enter password");
}

//post conditions
@AfterMethod //6
public void logout() {
	System.out.println("after logout from app");
}
@AfterTest() //6
public void delete_cookies()
{
	System.out.println("after test delete cookies");
}

@AfterClass //7
public void close_browser()
{
	System.out.println("close browser");
}
	


}