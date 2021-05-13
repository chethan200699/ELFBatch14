package genriclib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutor {
	public void javaScriptExecutorEnter(WebDriver driver,String script)
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(script);	
	}
//	public void javaScriptExecutorClick(WebDriver driver,String script)
//	{
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript(arg0, arg1)
//		
//		
//	}

}
