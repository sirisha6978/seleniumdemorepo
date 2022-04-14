package dependsOnGroups;

import org.testng.annotations.Test;

public class Meta_groups {

	@Test(groups= {"sanitory"})
	public void t1 () {
		System.out.println("test 1");
	}
	@Test(groups= {"regression"})
	public void t2 () {
		System.out.println("test 2");
	}
	@Test(groups= {"smoke"})
	public void t3 () {
		System.out.println("test 3");
	}
	@Test(groups= {"sanitory"})
	public void t4 () {
		System.out.println("test 4");
	}
	@Test
	public void t () {
		System.out.println("test ");
	}
	
}
