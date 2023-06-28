package com.flipkartpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMarketPlace extends onlineShopingSiteHomePage {
	public ProductMarketPlace(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(.//div[@class='_4rR01T'])[.='APPLE iPhone 14 (Purple, 128 GB)']")
	private WebElement ClickOnProduct;
	
	public void ClickOnMobile() {
		ClickOnProduct.click();
	}

}
