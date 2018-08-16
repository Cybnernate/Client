package com.revature.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element;
	
	public static WebElement user(WebDriver wd) {
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = wd.findElement(By.name("email"));
		System.out.println("found it1");
		return element;
	}
	
	public static WebElement pass(WebDriver wd) {
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = wd.findElement(By.name("password"));
		System.out.println("found it2");

		return element;
	}
	
	public static WebElement submit(WebDriver wd) {
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		element = wd.findElement(By.name("submit"));
		System.out.println("found it3");
		return element;
	}	
}