package genriclib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PopUpUtils {
	
	public void alertPopUpMethod(WebDriver driver,String elementaddress) {
		@SuppressWarnings("unused")
		Alert alert = driver.switchTo().alert();
	}

}
