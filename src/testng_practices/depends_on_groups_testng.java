package testng_practices;

import org.testng.annotations.Test;
@Test(groups = {"allTestcases"})
public class depends_on_groups_testng {
	
	
	//include and excluded tags we are added in the testng.xml bcz include meas executed the test case
	//excluded is not executed corresponding test .
	//in testng we areusing "enabled=failed"
	@Test(groups = {"alphabits"})	
	public void b()
	{
		System.out.println("boy");
	}
	
	@Test(groups = {"alphabits"})		
	public void a()
	{
		System.out.println("alpha");
	}
	@Test(groups = {"language"})	
	public void math()
	{
		System.out.println("math");
	}
	@Test(groups = {"language"})	
	public void telugu()
	{
		System.out.println("Telugu");
	}
	@Test(groups = {"language"})	
	public void english()
	{
		System.out.println("English");
	}
	@Test
	public void science()
	{
		System.out.println("science");
	}
	@Test
	public void social()
	{
		System.out.println("social");
	}

}
