package genriclib;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverutils {
	public void getMethod(WebDriver driver,String url)
	{
		driver.get(url);
	}
	public String getCurrenturlMethod(WebDriver driver)
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getPageSourceMethod(WebDriver driver)
	{
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	public String getTitleMethod(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}
	public String getWindowHandleMethod(WebDriver driver)
	{
		String windowhandle = driver.getWindowHandle();
		return windowhandle;
	}
	public Set<String> getWindowHandlesMethod(WebDriver driver)
	{
		Set<String> windowhandle = driver.getWindowHandles();
		return windowhandle;
	}

}
