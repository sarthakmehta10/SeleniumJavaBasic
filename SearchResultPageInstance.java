package com.utilities;

import org.openqa.selenium.WebDriver;

import com.pagesobjects.SearchResultPage;

public class SearchResultPageInstance extends PageInstanceCreator{

	@Override
	public SearchResultPage instanceFactory(WebDriver driver) {
		srp = new SearchResultPage(driver);
		return srp;
	}

}
