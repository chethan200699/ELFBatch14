package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genriclib.IlistnerImplementation.class)
public class Demo2 {
	@Test
	public void sample1()
	{
		Reporter.log("hello",true);
		Assert.fail();
	}
//	@Test
//	public void sample2()
//	{
//		Reporter.log("welcome",true);
//	}

}
