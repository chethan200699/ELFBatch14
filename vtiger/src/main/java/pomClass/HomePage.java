package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
  @FindBy(xpath="//a[text()='Products']")
  private WebElement  products;
  
  @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
  WebElement logout;
  
  @FindBy(xpath="//a[text()='Sign Out']")
  WebElement signoutButton;
  
  public WebElement getSignoutButton() {
	return signoutButton;
}


public void logout(WebDriver driver)
	{   
		Actions actions=new Actions(driver);
		actions.moveToElement(logout).perform();
		getSignoutButton().click();
	}
  

public HomePage(WebDriver driver) 
{
	PageFactory.initElements( driver, this);
}

public WebElement getProducts() {
	return products;
}
  
  
}

