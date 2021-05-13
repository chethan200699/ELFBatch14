package genriclib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShotUtils extends BaseTest {
	public void takeaSCreenShotMetod(WebDriver driver, ITestResult result) throws IOException{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./errorshots/"+result.getMethod().getMethodName()+".png");
		FileUtils.copyFile(source, destination);

	}

	
	
}
