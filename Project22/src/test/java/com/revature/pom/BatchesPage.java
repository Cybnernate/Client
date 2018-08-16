package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BatchesPage {
	
	private static WebElement element;
	
	public static WebElement curriculum(WebDriver wd) {
		element = wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-6\"]/div/form/div[1]/mat-form-field[1]"));
		return element;
	}

}
