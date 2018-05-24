package com.utilities;

import org.openqa.selenium.WebDriver;

import com.pagesobjects.Page;

public class PageInstanceFactory {
	private static Page page;

	public static Page getPageInstance(WebDriver driver, String pageName) {
		if (pageName.equalsIgnoreCase("HomePage")) {
			PageInstanceCreator homePage = new HomePageInstance();
			return homePage.instanceFactory(driver);
		} else if (pageName.equalsIgnoreCase("SearchResultPage")) {
			PageInstanceCreator page = new SearchResultPageInstance();
			return page.instanceFactory(driver);
		} else if (pageName.equalsIgnoreCase("ProductDescriptionPage")) {
			PageInstanceCreator page = new ProductDescriptionPageInstance();
			return page.instanceFactory(driver);
		}
		return page;
	}
}
