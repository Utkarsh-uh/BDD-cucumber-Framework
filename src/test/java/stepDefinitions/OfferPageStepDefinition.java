package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	public WebDriver driver;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public OfferPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testContextSetup = testcontextsetup;
	}

	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String ShortName)
			throws InterruptedException {

		switchToOffersPage();
		OffersPage offersPage = new OffersPage(testContextSetup.driver);
		offersPage.searchItem(ShortName);
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductName();
        
	}

	public void switchToOffersPage() {
		// if(testcontextsetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		
	    pageObjectManager= new PageObjectManager(testContextSetup.driver);
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.switchWindowToChild();

	}

	@Then("Validate product name in offers page matches with Landing page")
	public void validate_product_name_in_Offers_page() {

		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);

	}
}
