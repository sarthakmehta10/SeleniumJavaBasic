package com.pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends Page {

	public ProductDescriptionPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}

}
