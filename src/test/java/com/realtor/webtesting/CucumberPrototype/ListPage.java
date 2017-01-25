package com.realtor.webtesting.CucumberPrototype;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListPage {
	OR obj = new OR();
	DriverSetting dr = new DriverSetting();
	WebDriver driver = dr.driver;
	
	
	@Then("^validate the number of listing to be greater than \"([^\"]*)\"$")
	public void validate_the_number_of_listing_to_be_greater_than(String lowerCount) throws Throwable {

		WebElement numOfListingsElement = dr.returnWebElement(obj.xpathSearchResultCount, "xpath");
		String numOfListingText = numOfListingsElement.getText().trim();
		String numOfListingTextPart1 = numOfListingText.split(" ")[0];
		int numOfListings = Integer.parseInt(numOfListingTextPart1);
		int lowerCountN = Integer.parseInt(lowerCount.trim());
		Assert.assertTrue("Listing count is less than "+ lowerCount, numOfListings>lowerCountN);

	}
	
	
	@When("^Reading the price on list page and clicking on link of item \"([^\"]*)\"$")
	public void Reading_the_price_on_list_page_and_clicking_on_link_of_item(String sequenceNumber) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement resultToBeSelectedPrice = dr.returnWebElement(obj.xpathSearchResultPrice1+sequenceNumber.trim()+obj.xpathSearchResultPrice2, "xpath");
		String priceText = resultToBeSelectedPrice.getText().trim();
		obj.price=priceText;
		WebElement resultToBeSelected = dr.returnWebElement(obj.xpathSearchResultList1+sequenceNumber.trim()+obj.xpathSearchResultList2, "xpath");
		js.executeScript("arguments[0].click();", resultToBeSelected);

	}
}
