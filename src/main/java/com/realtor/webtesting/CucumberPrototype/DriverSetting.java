package com.realtor.webtesting.CucumberPrototype;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverSetting
{

	private static final TimeUnit SECONDS = null;
	public static WebDriver driver;
	OR obj = new OR();

	public WebDriver returnDriver(String browserType)
	{
		if(browserType.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
		}

		else if(browserType.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		}else if(browserType.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
		}
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public WebElement returnWebElement(String webElement, String type)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		int tryCount = 1;
		while (tryCount <= 2)
		{
			try
			{
				if (type.equalsIgnoreCase("linktext"))
				{
					return	wait.until(ExpectedConditions.elementToBeClickable(By.linkText(webElement)));
				}
				else if (type.equalsIgnoreCase("xpath"))
				{
					return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));
					//return driver.findElement(By.xpath(webElement));
				}
				else if (type.equalsIgnoreCase("name"))
				{
					return wait.until(ExpectedConditions.elementToBeClickable(By.name(webElement)));
					//return driver.findElement(By.name(webElement));
				}
				else if (type.equalsIgnoreCase("id"))
				{
					return wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));
					//return driver.findElement(By.id(webElement));
				}
				else if (type.equalsIgnoreCase("classname"))
				{
					return wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));
					//return driver.findElement(By.className(webElement));
				}
				else if (type.equalsIgnoreCase("cssselector"))
				{
					return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(webElement)));
					//return driver.findElement(By.cssSelector(webElement));
				}
				else if (type.equalsIgnoreCase("partialLinkText"))
				{
					return wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(webElement)));
					//return driver.findElement(By.partialLinkText(webElement));
				}
			}

			catch(Exception e)
			{
				// realtor.com has a pop up which comes up some times
				// need to enter the code to handle that
				if (type.equalsIgnoreCase("linktext")){
					return	wait.until(ExpectedConditions.elementToBeClickable(By.linkText(webElement)));
				}
				else if (type.equalsIgnoreCase("xpath")){
					return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));
					//return driver.findElement(By.xpath(webElement));
				}
				else if (type.equalsIgnoreCase("name")){
					return wait.until(ExpectedConditions.elementToBeClickable(By.name(webElement)));
					//return driver.findElement(By.name(webElement));
				}
				else if (type.equalsIgnoreCase("id")){
					return wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));
					//return driver.findElement(By.id(webElement));
				}
				else if (type.equalsIgnoreCase("classname")){
					return wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));
					//return driver.findElement(By.className(webElement));
				}
				else if (type.equalsIgnoreCase("cssselector")){
					return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(webElement)));
					//return driver.findElement(By.cssSelector(webElement));
				}
				else if (type.equalsIgnoreCase("partialLinkText")){
					return wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(webElement)));
					//return driver.findElement(By.partialLinkText(webElement));
				}
			}
		}
		return null;
	}
}
