package testng_practices;

import org.testng.annotations.Test;

public class Depends_on_methods {
	@Test 
	public void sample()
	{
		System.out.println("it is sample method");
	}
	
	
		@Test
	public void world()
	{
		System.out.println("it is world");
	}
	
	@Test(dependsOnMethods="world")
	public void india()
	{
		System.out.println("it is country");
	}
	
	@Test(dependsOnMethods="india")
	public void ap()
	{
		System.out.println("it is state in india ");
	}
	@Test(dependsOnMethods="india")
	public void ts()
	{
		System.out.println("it is state in india ");
	}
	@Test(dependsOnMethods="world")
	public void  usa()
	{
		System.out.println("it is country");
				}
		@Test(dependsOnMethods="india")
	public void califorina()
	{
		System.out.println("it is state in usa");
	}
	@Test(dependsOnMethods="india")
	public void florida()
	{
		System.out.println("it is state in usa ");
	}
	}
