package vtigerTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genriclib.BaseTest;
import genriclib.IRetryImplementation;
@Listeners(genriclib.IlistnerImplementation.class)
public class Demo extends BaseTest  {
	
	@Test(retryAnalyzer=IRetryImplementation.class)
	public void sample() {
		Reporter.log("testcase2 is running",true);
		Assert.fail();
	}
} 