package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextsetup;
	
	
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextsetup = testContextSetup;
		this.checkoutPage=testContextsetup.pageObjectManager.getCheckoutPage();
     }
	
@Then("Verify user has ability to enter promocode and Place the order")
public void Verify_user_has_ability_to_enter_promocode_and_Place_the_order()
    {
	   
	   Assert.assertTrue(checkoutPage.VerifyPromoButton());
	   Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	}
	
@Then("^User Proceeds to checkout and validate the (.+) items in checkout page$")	
public void user_proceeds_to_checkout(String name) throws InterruptedException
   {  
	checkoutPage.CheckoutItems();
	
	}


}

