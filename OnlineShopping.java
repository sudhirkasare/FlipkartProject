package com.flipkartpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShopping {
	
	@FindBy(xpath = ".//input[@type='text']")
	private WebElement searchfield;
	@FindBy(xpath = ".//button[@class=\"L0Z3Pu\"]")
	private WebElement searchbutton;
	@FindBy(xpath = ".//button[@class='_2KpZ6l _2doB4z']")
	private WebElement cancel;
	
	public void OnlineShopping(WebDriver driver) {	
		PageFactory.initElements(driver, this);	
	}
	
	public void clickOnCancel() {
		cancel.click();
	}
	
	public void setShoppingProduct(String sch) {
		searchfield.sendKeys(sch);
	}
	
	public void clickOnSearch() {
		searchbutton.click();
	}	
}

