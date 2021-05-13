package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test(priority=1)
	public void sample()
	{
		Reporter.log("hi",true);
	}
	
	@Test(invocationCount=2)
	public void sample1()
	{
		Reporter.log("welcome to selenium scripting",true);
	}
	@Test(enabled=true,timeOut=2)
	public void sample3()
	{
		Reporter.log("hi good morning",true);
	}
}
