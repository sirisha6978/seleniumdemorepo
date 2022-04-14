package Testng_liseners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2_listener_login {
	
	@Test()  //  we are excuting the  only one test cases  at run time  we define the enabled=false parameter 
	// or intestng.xml file we are adding the include/exculde tags.
	public void LoginEmail() {
		System.out.println("login email");
		Assert.assertEquals("sree", "sree");
	}
	
	@Test(enabled=false)
	public void LoginFb()
	{
		System.out.println("login fb");
		Assert.assertEquals("sree","siri");
	}
	
	

}
