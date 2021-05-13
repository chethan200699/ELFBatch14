package pomClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genriclib.ReadDataFromExcel;

public class LoginPage {	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
    @FindBy(name="user_name")
    private WebElement username;
    @FindBy(name="user_password")
    private WebElement password;
    @FindBy(id="submitButton")
    private WebElement LoginButton ;
    
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void loginMethod(WebDriver driver) throws Exception{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ReadDataFromExcel exceldata=new ReadDataFromExcel();

		String url = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 0);
		String username = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 1);
		String password = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 2);
		driver.get(url);
		getUsername().sendKeys(username);
	    getPassword().sendKeys(password);
		getLoginButton().click();
	}
	
}

