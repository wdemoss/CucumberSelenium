package com.realtor.webtesting.CucumberPrototype;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

public class DetailsPage {

	OR obj = new OR();
	DriverSetting dr = new DriverSetting();
	WebDriver driver = dr.driver;

	@Then("^validate the price of listing on details page to be same as that of list page$")
	public void validate_the_price_of_listing_on_details_page_to_be_same_as_that_of_list_page()
			throws Throwable {
		
		WebElement priceDetailsPage = dr.returnWebElement(
				obj.xpathPriceOnDetailsPage, "xpath");
		Assert.assertTrue(
				"The price on list page and details page did not match.",
				obj.price.equalsIgnoreCase(priceDetailsPage.getText().trim()));

	}
}
