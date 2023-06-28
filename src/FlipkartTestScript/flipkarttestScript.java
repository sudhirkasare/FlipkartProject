package FlipkartTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.flipkartpomclass.FlipkartPlaceOrder;
import com.flipkartpomclass.IPhoneMobile;
import com.flipkartpomclass.ProductMarketPlace;
import com.flipkartpomclass.onlineShopingSiteHomePage;

public class flipkarttestScript {
	WebDriver driver;
	@Test
	public void openFlipkart() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		onlineShopingSiteHomePage pm=new FlipkartPlaceOrder(driver);
		Thread.sleep(8000);
		pm.ClosePopup();
		pm.ClickOnSearchField("iphone 14");
		pm.ClickOnSearchButton();
		((ProductMarketPlace) pm).ClickOnMobile();
		
		for(String win: driver.getWindowHandles()) {
			driver.switchTo().window(win);	
		}
		Thread.sleep(8000);
		((IPhoneMobile) pm).addToCart();
		
		Thread.sleep(8000);
		((FlipkartPlaceOrder)pm).PlaceOrder();
	}
}
