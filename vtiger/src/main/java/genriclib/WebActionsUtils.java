package genriclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebActionsUtils {
	public void moveToElementMethod(WebDriver driver,WebElement elementaddress)
	{
		Actions actions=new Actions(driver);
		// To perform Mouse hover actions
		actions.moveToElement(elementaddress).perform();
	}
	public void dragAndDropMethod(WebDriver driver,WebElement source,WebElement target)
	{
		Actions actions=new Actions(driver);
		// To perform Drag and drop actions
		actions.dragAndDrop(source, target);
	}
	public void doubleClickMethod(WebDriver driver,WebElement elementaddress)
	{
		Actions actions=new Actions(driver);
		// To perform Double click actions
		actions.doubleClick(elementaddress).perform();
	}
	public void rightClickMethod(WebDriver driver,WebElement elementaddress)
	{
		Actions actions=new Actions(driver);
		// To perform right click actions
		actions.contextClick(elementaddress);
	}

}
