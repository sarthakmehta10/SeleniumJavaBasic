package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.genericfunctions.GenericFunctions;
import com.pagesobjects.HomePage;
import com.pagesobjects.ProductDescriptionPage;
import com.pagesobjects.SearchResultPage;
import com.utilities.BrowserFactory;
import com.utilities.PageInstanceFactory;

public class TestRunner {
	private static WebDriver driver;
	private static HomePage homePage;
	private static SearchResultPage srp;
	private static ProductDescriptionPage pdp;

	GenericFunctions func = new GenericFunctions();

	@Test
	public void scenario() {
		homePage = (HomePage) PageInstanceFactory.getPageInstance(driver, "HomePage");
		func.waitForElementToBeVisible(homePage.getSearchInput());
		homePage.getSearchInput().sendKeys("tshirts");
		homePage.getSearchSubmit().click();
		srp = (SearchResultPage) PageInstanceFactory.getPageInstance(driver, "SearchResultPage");
		srp.getSelectFirstProduct().click();
		pdp = (ProductDescriptionPage) PageInstanceFactory.getPageInstance(driver, "ProductDescriptionPage");
		pdp.getAddToCart().click();
		String cartPrice = homePage.getCartValue().getText().trim();
		System.out.println(cartPrice);
	}

	@BeforeTest
	public void setUpScenario() {
		driver = BrowserFactory.getInstance("Chrome");
		BrowserFactory.setUp(driver);
	}

	@AfterTest
	public void closeScenario() {
		BrowserFactory.closeScenario(driver);
	}

}
