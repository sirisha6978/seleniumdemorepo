package testng_samples;

import org.testng.annotations.Test;

public class Exception_timeout_test {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void expected_exception()
	{
	String s = "100a";
	Integer.parseInt(s);
	}


}
