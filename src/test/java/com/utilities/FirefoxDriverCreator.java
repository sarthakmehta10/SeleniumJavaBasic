package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverCreator extends WebDriverCreator {

	@Override
	public WebDriver factoryMethod() {
		System.setProperty("webdriver.gecko.driver", "../resources/geckodriver-v0.11.1.exe");
		driver = new FirefoxDriver();
		return driver;
	}

}
