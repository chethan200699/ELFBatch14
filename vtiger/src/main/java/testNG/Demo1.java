package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
    @DataProvider
	public void testdata()
	{				
				
	}
	@Test(invocationCount=5,threadPoolSize=4)
	public void sample(){
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("chrome browser is successfully launched",true);
		driver.manage().window().maximize();
		Reporter.log("chrome browser is successfully minimized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.quit();
	}

}
