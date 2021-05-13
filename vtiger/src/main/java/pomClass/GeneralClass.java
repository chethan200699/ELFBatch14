package pomClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import genriclib.ReadDataFromExcel;

public class GeneralClass {
	public void loginMethod(WebDriver driver) throws Exception{
		ReadDataFromExcel exceldata=new ReadDataFromExcel();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String url = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 0);
		String username = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 1);
		String password = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 2);

		driver.get(url);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUsername().sendKeys(username);
		loginpage.getPassword().sendKeys(password);
		loginpage.getLoginButton().click();
	}
	
}
