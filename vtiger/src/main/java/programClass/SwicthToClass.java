package programClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwicthToClass {
	String parentid="";
	public void switchMethod(WebDriver driver)
	{
		String parentid = driver.getWindowHandle();
		Set<String> wid = driver.getWindowHandles();
		wid.remove(parentid);
		for (String id : wid) {
			driver.switchTo().window(id);
		}
	}
	public void switchtoParent(WebDriver driver)
	{
		driver.switchTo().window(parentid);
	}

}
