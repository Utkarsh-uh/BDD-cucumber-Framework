package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage{
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By search=By.xpath("//input[@type='search']");
	 By productName=By.xpath("//div[@class='product']/h4");
	 By topDeals=By.xpath("//a[contains(text(),'Top Deals')]");
	 By increment=By.xpath("//a[@class='increment']");
	 By addToCart=By.xpath("//div[@class='products']//div[1]//div[3]//button[1]");
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText()
	{
		driver.findElement(search).getText();
	}
	
	public void incrementQuantity(int quantity)
	{
		int i= quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
	}
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	}
	
	public String gettitleLandingPage()
	{
		return driver.getTitle();
	}
	

	
	
}
