package com.flipkartpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartPlaceOrder extends IPhoneMobile {
	public FlipkartPlaceOrder(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath=".//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeorder;
	
	public void PlaceOrder() {
		placeorder.click();
	}

}
