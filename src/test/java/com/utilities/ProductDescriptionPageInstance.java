package com.utilities;

import org.openqa.selenium.WebDriver;

import com.pagesobjects.ProductDescriptionPage;

public class ProductDescriptionPageInstance extends PageInstanceCreator {

	@Override
	public ProductDescriptionPage instanceFactory(WebDriver driver) {
		pdp = new ProductDescriptionPage(driver);
		return pdp;
	}

}
