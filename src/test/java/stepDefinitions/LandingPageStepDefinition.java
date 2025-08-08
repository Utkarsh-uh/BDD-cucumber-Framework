package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextsetup;
	LandingPage landingPage;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextsetup = testContextSetup;
		this.landingPage=testContextsetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on Greencart landing page")
	public void user_is_on_green_cart_landing_page()
	{
	   //Assert.assertTrue(landingPage.gettitleLandingPage().contains("Greenkart"));
	}

	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String ShortName)
			throws InterruptedException {

		landingPage.searchItem(ShortName);
		Thread.sleep(2000);
		testContextsetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingPageProductName + "is extracted from Home Page");

	}
    @When("Added {string} items of the Selected product to cart")
    public void Added_items_product(String quantity)
    {
	   landingPage.incrementQuantity(Integer.parseInt(quantity));
	   landingPage.addToCart();
	}

}
