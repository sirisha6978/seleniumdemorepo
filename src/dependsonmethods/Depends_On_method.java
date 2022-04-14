package dependsonmethods;

import org.testng.annotations.Test;

public class Depends_On_method {
	
	@Test()
	public void maths()
	{
		
		System.out.println("add two numbers");
	}
	
	@Test(dependsOnMethods="maths")
	public void div()
	{
		System.out.println("division by two values");
	}
	
	@Test(dependsOnMethods="maths")
	public void mult() {
		System.out.println("multiple two numbers");
	}
	
@Test
public void language()
{
	System.out.println("telugu poerty");
}
	
@Test(dependsOnMethods= "language")
public void non_poetry() {
	System.out.println("it is non poetry");
}
	@Test(dependsOnMethods= "language")
	public void hindhi()
	{
		System.out.println("it is hindhi");
	}
	@Test(dependsOnMethods= "language")
	public void eng() {
		System.out.println("it is english");
	}
	
	
	
	
	
	
	
}
