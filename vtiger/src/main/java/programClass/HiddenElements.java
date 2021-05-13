package programClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		System.out.println("chrome browser is launched");
		driver.get("https://en-gb.facebook.com/" );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	    js.executeScript("arguments[0].value='optional';",ele);
//	    driver.quit();
                                       
	}

}
