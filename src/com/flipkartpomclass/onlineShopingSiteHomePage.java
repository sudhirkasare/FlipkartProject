package com.flipkartpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onlineShopingSiteHomePage {
	@FindBy(xpath =".//input[@name='q']")
	private WebElement searchfield;
	@FindBy(xpath=".//button[@type='submit']")
	private WebElement searchbutton;
	@FindBy(xpath=".//button[@class='_2KpZ6l _2doB4z']")
	private WebElement popup;
	
	public onlineShopingSiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSearchField(String searchproduct) {
		searchfield.sendKeys(searchproduct);
	}
	public void ClickOnSearchButton() {
		searchbutton.click();
	}
	public void ClosePopup(){
		popup.click();
	}

}
