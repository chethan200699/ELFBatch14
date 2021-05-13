package genriclib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomClass.HomePage;
import pomClass.LoginPage;

public class BaseClass {
	public  WebDriver driver;
	public LoginPage loginpage ;
	public HomePage homepage;
	ReadDataFromExcel exceldata=new ReadDataFromExcel();

	@BeforeClass(alwaysRun=true)
	public void sample() throws Exception {
		System.out.println("control");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("chrome browser is successfully launched",true);
		driver.manage().window().maximize();
		Reporter.log("chrome browser is successfully minimized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 0);
		Reporter.log("chrome browser is successfully launched",true);
		driver.get(url);

		String title ="vtiger CRM 5 - Commercial Open Source CRM" ;
		if(title.equals(driver.getTitle()))
		{
			System.out.println("loginpage is displayed");
		}
		else
		{
			System.out.println("loginpage is 'NOT' displayed");
		}

	}
	@BeforeMethod(alwaysRun =true)
	public void login() {
		System.out.println("here it is contrl");
		loginpage=new LoginPage(driver);
		try {
			String username = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 1);
			//				Reporter.log(username,true);
			String password = exceldata.cellValue("./resource/chethan1.xlsx", "Sheet1", 0, 2);
			//				Reporter.log(password,true);	
			loginpage.getUsername().sendKeys(username);
			loginpage.getPassword().sendKeys(password);
			loginpage.getLoginButton().click();
		}
		catch(Exception e)
		{

		}
	}
	@AfterMethod(alwaysRun =true)
	public void logout() {
		homepage=new HomePage(driver);
		homepage.logout(driver);
	}
	@AfterClass(alwaysRun =true)
	public void closeBrowser() {
		driver.quit();
	}


}
