package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	@FindBy(xpath="//a[text()='Product Name']/../../..//a[text()='Vtiger 5 Users Pack']") 
	private WebElement product2;
	@FindBy(xpath="//a[text()='Product Name']/../../..//a[text()='Vtiger 5 Users Pack']")
	private WebElement product1;
	@FindBy(xpath="(//input[@name='Edit'])[1]")
	private WebElement edit;
	@FindBy(xpath="(//input[@name='Duplicate'])[1]")
	private WebElement duplicate;
	@FindBy(xpath="(//input[@name='Delete'])[1]")
	private WebElement delete;
	@FindBy(xpath="(//img[@name='privrecord'])[1]")
	private WebElement privrecord;
	@FindBy(xpath="(//img[@name='nextrecord'])[1]")
	private WebElement nextrecord;
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement Save;

	public WebElement getSave() {
		return Save;
	}
	public WebElement getProduct1() {
		return product1;
	}
	public WebElement getProduct2() {
		return product2;

	}
	public WebElement getPrivrecord() {
		return privrecord;
	}
	public WebElement getNextrecord() {
		return nextrecord;
	}
	public WebElement getDuplicate() {
		return duplicate;

	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getEdit() {
		return edit;
	}
	public Products(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
