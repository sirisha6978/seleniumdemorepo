package parrlel_testng_practices;

import org.testng.annotations.Test;

public class Parller_testing_thread_count {
	
	@Test(threadPoolSize = 3, invocationCount=5)
	public void test1()
	{
		System.out.println("thread is define " +Thread.currentThread().getId());
	
	}
}
