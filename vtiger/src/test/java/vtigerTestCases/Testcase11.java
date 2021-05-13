package vtigerTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genriclib.BaseTest;
import genriclib.IRetryImplementation;
import pomClass.HomePage;
import pomClass.Products;
@Listeners(genriclib.IlistnerImplementation.class)
public class Testcase11 extends BaseTest {
	@Test(groups="smoke", retryAnalyzer = IRetryImplementation.class )
	public void demo1() throws Exception {

		//step3: verification of home page
		//============================================================================================

		Assert.assertEquals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM", driver.getTitle(), "homepage is 'NOT' displayed");
		String homepagetitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(homepagetitle.equals(driver.getTitle())) {
			System.out.println("homepage is displayed");
		}
		else{
			System.out.println("homepage is 'NOT' displayed");
		}
		//step4: navigate to products page
		//==============================================================================================
		HomePage homepage=new HomePage(driver);
		homepage.getProducts().click();

		//step5:verification of product page
		//===============================================================================================

		String productstitle = "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		if (productstitle.equals(driver.getTitle())) {

			System.out.println("productspage is displayed");
		}
		else{
			System.out.println("productspage is 'NOT' displayed");
		}
		//step6: Editing the element
		//=================================================================================================

		Products  products= new Products(driver);
		products.getProduct2().click();
		String pro2text="[ PRO2 ] Vtiger 5 Users Pack - Product Information";
		String text = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if(pro2text.equals(text)) {
			System.out.println("product2 is displayed");
		}else {
			System.out.println("product2 is 'NOT'displayed");
		}
		Assert.assertTrue(false);
		products.getEdit().click();
		String pro2edittext="[ PRO2 ] Vtiger 5 Users Pack - Editing Product Information ";
		if(pro2edittext.equals(driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText())) {
			System.out.println("editing page is displayed");
		}else {
			System.out.println("editing page is 'NOT' displayed");
		}
		products.getSave().click();
		homepage.getProducts().click();

	}
}

