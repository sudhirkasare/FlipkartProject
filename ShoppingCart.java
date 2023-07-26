package com.flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends AppleIphone {
	public ShoppingCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(.//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"])[1]")
	private WebElement placeorder;

	public void clickOnPlaceOrder() {
		placeorder.click();
	}
}