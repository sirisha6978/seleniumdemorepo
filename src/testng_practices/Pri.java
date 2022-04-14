package testng_practices;

import org.testng.annotations.Test;

public class Pri {

	@Test(priority=1)
	public void b() 
	{
		System.out.println("hello");
	}
	
	@Test(priority=5)
	public void z() 
	{
		System.out.println("1");
	}
	
	@Test(priority=4)
	public void a() 
	{
		System.out.println("2");
	}
	
	@Test(priority=2)
	public void p() 
	{
		System.out.println("3");
	}
}
