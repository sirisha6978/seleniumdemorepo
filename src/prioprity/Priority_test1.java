package prioprity;

import org.testng.annotations.Test;

public class Priority_test1 {
	
	@Test(priority=2)
	public void enter_url3()
	{
		System.out.println("p2");
	}
@Test(priority=1)
public void enter_url2()
{
	System.out.println("p1");
}
@Test(priority=3)
public void google_title1()
{
	System.out.println(" p3");
}
@Test(priority=0)
public void google_title2() //2nd
{
	System.out.println(" p0");
}

@Test
public void google_title() //1st
{
	System.out.println(" test 4 google title test");
}
@Test
public void a()//3rd
{
	System.out.println(" test 2 google title test");
}

@Test
public void b()//4th
{
	System.out.println(" test 3 google title test");
}

@Test
public void c()
{
	System.out.println(" test 1 google title test");
}








}
