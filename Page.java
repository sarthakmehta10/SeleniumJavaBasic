package com.pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	protected static WebDriver driver;
	@FindBy(xpath = "//div[@id='hlb-subcart']/div/span/span[2]")
	private WebElement cartValue;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchInput;

	@FindBy(xpath = "//input[@value='Go']")
	private WebElement searchSubmit;

	public Page(WebDriver driver) {
		Page.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCartValue() {
		return cartValue;
	}

	public WebElement getSearchInput() {
		return searchInput;
	}

	public WebElement getSearchSubmit() {
		return searchSubmit;
	}

}
