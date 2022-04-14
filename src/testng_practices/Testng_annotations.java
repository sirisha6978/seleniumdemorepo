package testng_practices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_annotations {
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void before_class()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void before_method()
	{
		System.out.println("before method");
	}
	@Test
	public void test()
	{
		System.out.println("test annotation");
	}
	@Test
	public void test1()
	{
		System.out.println("test1 annotation");
	}
	@Test
	public void test2()
	{
		System.out.println("test2 annotation");
	}
	@AfterMethod
	public void after_method()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void after_class() {
		System.out.println("after class");
	}
@AfterTest
public void after()
{
	System.out.println("at after test");
}

@AfterSuite
public void aftersuit()
{
	System.out.println("after suite");
}
}
