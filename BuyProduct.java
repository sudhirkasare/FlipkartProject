package com.flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProduct extends OnlineShopping{
	
	@FindBy(xpath = "(.//div[@class=\"_24_Dny\"])[4]")
	private WebElement selectram;
	
	@FindBy(xpath = ".//div[.='APPLE iPhone 11 (White, 64 GB)']")
	private WebElement selectproduct;
	
	public BuyProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectRam() {
		selectram.click();
	}
	
	public void selectProduct() {
		selectproduct.click();
	}
}