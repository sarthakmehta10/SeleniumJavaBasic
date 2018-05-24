package com.pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends Page {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[@id='result_0']/child::div/child::div/following-sibling::div")
	private WebElement selectFirstProduct;

	public WebElement getSelectFirstProduct() {
		return selectFirstProduct;
	}

}
