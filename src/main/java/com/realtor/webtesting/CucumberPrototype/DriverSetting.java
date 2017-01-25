package com.realtor.webtesting.CucumberPrototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverSetting {

	public static WebDriver driver;
	OR obj = new OR();
	
	public WebDriver returnDriver(String browserType)
	{
		if(browserType.equalsIgnoreCase("ff"))
		{
			System.getProperty("webdriver.firefox.driver","./geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
		}
		
		else if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		}else if(browserType.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.getProperty("webdriver.firefox.driver","./geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
		}
		
		return driver;
	}
	
	public WebElement returnWebElement(String webElement, String type)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		int tryCount = 1;
		while (tryCount <= 2) {	            	
			try{
				if (type.equalsIgnoreCase("linktext")){
					return driver.findElement(By.linkText(webElement));
				}
				else if (type.equalsIgnoreCase("xpath")){
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));
					return driver.findElement(By.xpath(webElement));
				}
				else if (type.equalsIgnoreCase("name")){
					wait.until(ExpectedConditions.elementToBeClickable(By.name(webElement)));
					return driver.findElement(By.name(webElement));
				}
				else if (type.equalsIgnoreCase("id")){
					wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));
					return driver.findElement(By.id(webElement));
				}
				else if (type.equalsIgnoreCase("classname")){
					wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));
					return driver.findElement(By.className(webElement));
				}
				else if (type.equalsIgnoreCase("cssselector")){
					wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(webElement)));
					return driver.findElement(By.cssSelector(webElement));
				}	
				else if (type.equalsIgnoreCase("partialLinkText")){
					wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(webElement)));
					return driver.findElement(By.partialLinkText(webElement));		            		
				}
			}
			
			catch(Exception e)
			{
				// realtor.com has a pop up which comes up some times
				// need to enter the code to handle that
				if (type.equalsIgnoreCase("linktext")){
					return driver.findElement(By.linkText(webElement));
				}
				else if (type.equalsIgnoreCase("xpath")){
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));
					return driver.findElement(By.xpath(webElement));
				}
				else if (type.equalsIgnoreCase("name")){
					wait.until(ExpectedConditions.elementToBeClickable(By.name(webElement)));
					return driver.findElement(By.name(webElement));
				}
				else if (type.equalsIgnoreCase("id")){
					wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));
					return driver.findElement(By.id(webElement));
				}
				else if (type.equalsIgnoreCase("classname")){
					wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));
					return driver.findElement(By.className(webElement));
				}
				else if (type.equalsIgnoreCase("cssselector")){
					wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(webElement)));
					return driver.findElement(By.cssSelector(webElement));
				}	
				else if (type.equalsIgnoreCase("partialLinkText")){
					wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(webElement)));
					return driver.findElement(By.partialLinkText(webElement));		            		
				}
			}
			}
		return null;
	}
	
}
