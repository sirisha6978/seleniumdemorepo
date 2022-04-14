package dependsOnGroups;

import org.testng.annotations.Test;

public class Test1_grouping {
	@Test(groups= {"science"})
	public void mpc()
	{
		System.out.println("it is mpc group");
	}
	
	@Test(groups= {"science"})
	public void bipc()
	{
		System.out.println("it is bipcs group");
	}
		@Test(groups= {"commerce"})
	public void cec()
	{
		System.out.println("it is cec group");
	}@Test(groups= {"commerce"})
	public void hec()
	{
		System.out.println("it is hec group");
	}@Test(groups= {"private group"})
	public void  t1()
	{
		System.out.println("it is privategroup");
	}
	@Test(groups= {"private group"})
	public void  t2()
	{
		System.out.println("it is privategroup2");
	}
	@Test(groups= {"private group"})
	public void  t3()
	{
		System.out.println("it is privategroup3");
	}
	@Test(groups= {"private group"})
	public void  t4()
	{
		System.out.println("it is privategroup4");
	}
	
}
