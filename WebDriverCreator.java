package com.utilities;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {
	protected static WebDriver driver;
	public abstract WebDriver factoryMethod();
}
