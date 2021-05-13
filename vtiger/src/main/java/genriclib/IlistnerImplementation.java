package genriclib;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class IlistnerImplementation extends BaseTest implements ITestListener {



	public void onTestSkipped(ITestResult tr) {
		Reporter.log("on test Skipped",true);
	}

	public void onTestSuccess(ITestResult tr) {
		Reporter.log("on test success",true);
	}
	public void onFinish(ITestResult arg0) {					
		Reporter.log("on finish",true);			
	}		

	public void onStart(ITestResult arg0) {					
		Reporter.log("on start",true);				
	}	

	public void onTestFailure(  ITestResult result) {
		Reporter.log("on test Failed",true);
		ScreenShotUtils sc=new ScreenShotUtils();

		try {
			sc.takeaSCreenShotMetod(BaseTest.driver,result);
		} catch (IOException e) {
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		Reporter.log("on test failed", true);				

	}			
	public void onTestStart(ITestResult arg0) {					
		Reporter.log("on test start",true);				

	}		 
}

