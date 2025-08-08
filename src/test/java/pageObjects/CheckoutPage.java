package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage{
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By cartbag=By.xpath("//img[@alt='Cart'] ");
	 By checkoutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	 By promoButton=By.xpath("//button[@class='promoBtn']");
	 By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	 
	public void CheckoutItems()
	{
		driver.findElement(cartbag).click();
		driver.findElement(checkoutButton).click();
	}
	
	public boolean VerifyPromoButton()
	{
		return driver.findElement(promoButton).isDisplayed();
	}
	
	public boolean VerifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}

	
	
}
