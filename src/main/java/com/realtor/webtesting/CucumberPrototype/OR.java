package com.realtor.webtesting.CucumberPrototype;

public class OR {
	
	//home page
	public String xpathSearchBox = ".//*[@id='searchBox']";
	
	//search page
	public String xpathSearchResultCount = ".//*[@id='search-result-count']";	
	public String xpathSearchResultList1 = ".//div[@class='srp-list-marginless']/div[@id='";
	public String xpathSearchResultList2 = "']//div[@class='srp-item-body']//div[@class='srp-item-address ellipsis']/a";	
	public String xpathSearchResultPrice1 = ".//div[@class='srp-list-marginless']/div[@id='";
	public String xpathSearchResultPrice2 = "']//div[@class='srp-item-body']//div[@class='srp-item-price']";
	

	//details page price
	public String xpathPriceOnDetailsPage = ".//span[@itemprop='price']";
	
	
	//common variables
	public static String price;
	
}
