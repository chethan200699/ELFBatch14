package programClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	public static void main(String[] args) {

        // pre -condition 
		//=============================================================================================================
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		SwicthToClass switchto=new SwicthToClass();
		
        // close the login popup
		//==============================================================================================================
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//product1 add to cart
		//===============================================================================================================
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mi 9 pro max",Keys.ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='REDMI Note 9 Pro Max (Interstellar Black, 64 GB)']"));
		System.out.println("product1 is displayed");
		act.doubleClick(ele1).perform();
		switchto.switchMethod(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']"))).click();
		System.out.println("product1 is added to cart");
		switchto.switchMethod(driver);
        
		//product2 added to cart
		//================================================================================================================
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("iphone 11",Keys.ENTER);
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']"));
		act.doubleClick(ele2).perform();
		System.out.println("product2 is displayed");
		switchto.switchMethod(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']"))).click();
		System.out.println("product2 is added to cart");
		switchto.switchMethod(driver);
		
		//product3 added to cart
		//================================================================================================================
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobiles",Keys.ENTER);
		WebElement ele3 = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']"));
		act.doubleClick(ele3).perform();
		System.out.println("product3 is displayed");
		switchto.switchMethod(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ADD TO CART']"))).click();
		System.out.println("product3 is added to cart");
		
		// removing 2nd product from cart
		//================================================================================================================
		driver.findElement(By.xpath("(//div[text()='Remove'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		System.out.println("product2 is removed from cart");

	}

}
