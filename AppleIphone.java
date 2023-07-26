package com.flipkartpom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleIphone {
		public AppleIphone(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = ".//button[@class='_2KpZ6l _1t_O3S _2ti6Tf _3AWRsL']")
		private WebElement addtocart;
		
		public void clickOnAddToCart(){
			//WebDriver driver = null;
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			addtocart.click();
		}	
	/*public void token() {
			WebDriver driver = null;
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementsByClassName(_2KpZ6l _2U9uOA _3v1-ww)").click();
		}*/
	}