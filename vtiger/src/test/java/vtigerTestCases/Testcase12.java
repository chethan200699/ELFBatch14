package vtigerTestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genriclib.BaseTest;
import genriclib.IRetryImplementation;
import pomClass.HomePage;
import pomClass.Products;
@Listeners(genriclib.IlistnerImplementation.class)
public class Testcase12 extends BaseTest {

	@Test(groups="smoke",retryAnalyzer = IRetryImplementation.class)
	public void demo2() {

		//step3: HomePage Verification
		//=========================================================================================

		String homepagetitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(homepagetitle.equals(driver.getTitle())) {
			System.out.println("homepage is displayed");
		}
		else {
			System.out.println("homepage is 'NOT' displayed");
		}
		Assert.fail();
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
		else {
			System.out.println("productspage is 'NOT' displayed");
		}
		//step6: Duplicate the element
		//=================================================================================================

		Products  products= new Products(driver);
		products.getProduct1().click();
		products.getDuplicate().click();

	}
}
