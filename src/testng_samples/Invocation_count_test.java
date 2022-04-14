package testng_samples;

import org.testng.annotations.Test;

public class Invocation_count_test {
	int a =10;
int b =20 ;
	
	@Test(invocationCount=5)
	public void sum()
	{
		int c=a + b;
		System.out.println(c);
	}

}
