package testNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {
	
	@DataProvider
	public String[] sample()
	{
		String  arr[]={"hi","hello","welcome"};
		return arr;
	}
@Test(dataProvider="sample")
public void sample1(String data)
{		
	
	Reporter.log("hi",true);
	
}
}
