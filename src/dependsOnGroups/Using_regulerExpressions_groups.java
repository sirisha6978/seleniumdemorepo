package dependsOnGroups;

import org.testng.annotations.Test;

public class Using_regulerExpressions_groups {
	
	@Test (groups= {"AllClassTests"})
	public void t()
	{
		System.out.println("  test ");
	}
	@Test (groups= {"regression"})
	public void t1()
	{
		System.out.println("re test");
	}@Test (groups= {"smoke"})
	public void t2()
	{
		System.out.println("test");
	}@Test (groups= {"windows.regression"})
	public void t3()
	{
		System.out.println("smoke test");
	}
	@Test (groups= {"linix.regreesion"})
	public void t4()
	{
		System.out.println(" hello test");
	}

}
