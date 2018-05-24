package com.utilities;

import org.openqa.selenium.WebDriver;

import com.pagesobjects.HomePage;
import com.pagesobjects.Page;
import com.pagesobjects.ProductDescriptionPage;
import com.pagesobjects.SearchResultPage;

public abstract class PageInstanceCreator {
	protected static HomePage homePage;
	protected static SearchResultPage srp;
	protected static ProductDescriptionPage pdp;

	public abstract Page instanceFactory(WebDriver driver);
}
