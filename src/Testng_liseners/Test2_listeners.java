package Testng_liseners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Test2_listeners extends TestListenerAdapter {
	
	
	public void OnTestStart(ITestResult tr)
	{
		System.out.println("test start");
			}
	public void OnTestSuccess(ITestResult tr)
	{
		System.out.println("test success");
	}
			public void OnTestFailure(ITestResult tr)
	{
		System.out.println("test failed");
		
	}
			public void OnTestSkipped(ITestResult tr) {
				System.out.println("test pass");
					}


}
