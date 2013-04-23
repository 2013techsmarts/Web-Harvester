package org.smarttechies.harvester;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * This will extract the product information from the product details page.
 * @author smarttechies
 *
 */
public class ProductInfoHarvester {
	
	public static void extractInfo(String pUrl) {
		
	}
	
	public static void main(String[] args) throws IOException {
		//Connect to the url and get the HTML content
		Document doc = Jsoup.connect("http://www.amazon.com/Samsung-XE303C12-A01US-Chromebook-Wi-Fi-11-6-Inch/dp/B009LL9VDG/ref=sr_1_1?ie=UTF8&qid=1366683807&sr=8-1&keywords=laptop").get();
		//Traverse the HTML DOM to get the content
		Elements titleElements = doc.select("span[id=btAsinTitle]");
		//Get the text data from <span> tags
		String title = titleElements.get(0).text();
		Elements priceElements = doc.select("b[class=priceLarge]");
		//Get the price data from <b> tags
		String price = priceElements.get(0).text();
		
		System.out.println("The title of the product is "+ title);
		System.out.println("The price of the product is "+price);
	}

}
