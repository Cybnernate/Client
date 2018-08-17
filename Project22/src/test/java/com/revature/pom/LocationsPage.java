package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsPage {
	
	private static WebElement element;
	
	public static WebElement locationName(WebDriver wd) {
		element = wd.findElement(By.xpath(""));
		return element;
		
	}
	
	public static WebElement cityName(WebDriver wd) {
		
		return element;
		
	}
	
	public static WebElement stateName(WebDriver wd) {
		return element;
		
	}
}