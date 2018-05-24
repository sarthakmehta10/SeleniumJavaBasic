package com.utilities;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	private static WebDriver driver;

	private BrowserFactory() {
	}

	public static WebDriver getInstance(String browser) {
		if (driver == null) {
			driver = createDriver(browser);
		}
		return driver;
	}

	public static WebDriver createDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverCreator driver = new ChromeDriverCreator();
			return driver.factoryMethod();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverCreator driver = new FirefoxDriverCreator();
			return driver.factoryMethod();
		}
		// else if(browser.equalsIgnoreCase("ie")){
		// WebDriverCreator driver = new ChromeDriverCreator();
		// return driver.factoryMethod();
		// }
		return driver;
	}

	public static void setUp(WebDriver driver) {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	public static void closeScenario(WebDriver driver) {
		driver.close();
	}
}
