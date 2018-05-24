package com.utilities;

import org.openqa.selenium.WebDriver;

import com.pagesobjects.HomePage;

public class HomePageInstance extends PageInstanceCreator {

	@Override
	public HomePage instanceFactory(WebDriver driver) {
		homePage = new HomePage(driver);
		return homePage;
	}

}
