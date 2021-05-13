package genriclib;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryImplementation  implements IRetryAnalyzer {
	int count=0;
	final int retrycount=3;
	public boolean retry(ITestResult result)  {
		 
		if(retrycount>count) {
			count++;
			return true;
		}
		return false;
	}

}
