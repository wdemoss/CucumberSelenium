package com.realtor.webtesting.CucumberPrototype;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {

	DriverSetting dr = new DriverSetting();
	OR obj = new OR();
	WebDriver driver = dr.driver;

	@After
	public void tearDown(Scenario scenario) throws IOException {
		
		if (scenario.isFailed())
		{
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("./target/"+scenario.toString()+".png"));
		}

		driver.quit();
	}

	@Given("^the browser as \"([^\"]*)\"$")
	public void the_browser_as(String browser) throws Throwable {

		driver = dr.returnDriver(browser);
	}

	@Given("^the page is open \"([^\"]*)\"$")
	public void the_page_is_open(String url) throws Throwable {

		driver.get(url);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void I_search_for(String searchValue) throws Throwable {

		WebElement searchBox = dr.returnWebElement(obj.xpathSearchBox, "xpath");
		searchBox.clear();
		searchBox.sendKeys(searchValue);
		searchBox.sendKeys(Keys.RETURN);

	}

}
