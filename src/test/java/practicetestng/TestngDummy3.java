package practicetestng;

import org.testng.annotations.Test;

public class TestngDummy3 
{
	@Test(expectedExceptions={Exception.class})
	public void method() 
	{
		int x=10/0;
	}
}
