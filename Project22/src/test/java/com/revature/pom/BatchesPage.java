package com.revature.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BatchesPage {

	public static void verifyCreateBatch(WebDriver wd) {
		Actions actions = new Actions(wd);

		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//clicks ciriculum drop down
				actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-3\"]"))).click().perform();
				System.out.println("ciric");
				
				//clicks .NET option
				wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-8\"]"))).click().perform();
				System.out.println(".NET");
//		
//		if(wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[1]/mat-form-field[1]")).()){
//			// click the ciriculum
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[1]/mat-form-field[1]")));
//			System.out.println("ciriculum");
//		}
//
////		// click .NET
//		
//		if((wd.findElement(By.xpath("//*[@id=\"mat-option-8\"]"))).isDisplayed()) {
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-8\"]")));
//			System.out.println("NET");
//		}


	}
}


//
//			// click the start date
//			WebElement element2 = wd.findElement(By.xpath("//*[@id=\"mat-option-8\"]"));
//			// if(element2.isSelected()) {
//			actions.moveToElement(wd.findElement(By.xpath(
//					"//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")));
//			System.out.println("start date");
//
//			// click the date
//			actions.moveToElement(wd.findElement(
//					By.xpath("//*[@id=\"mat-datepicker-2\"]/div[2]/mat-month-view/table/tbody/tr[3]/td[5]/div")));
//			System.out.println("date");
//
//			// click the trainer
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-5\"]/div/div[2]/div")));
//			System.out.println("trainer");
//
//			// choose the trainer
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-173\"]")));
//			System.out.println("choose the trainer");
//
//			// click the co trainer
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]")));
//			System.out.println("co trainer");
//
//			// choose the co trainer
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-24\"]")));
//			System.out.println("choose the co trainer");
//
//			// click the location
//			actions.moveToElement(
//					wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[4]/mat-form-field[1]")));
//			System.out.println("location");
//
//			// choose HQ
//			actions.moveToElement(wd.findElement(By.id("mat-option-16")));
//			System.out.println("HQ");
//
//			// click the building
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-8\"]/div/div[2]")));
//			System.out.println("building");
//
//			// click reston
//			actions.moveToElement(wd.findElement(By.id("mat-option-173")));
//			System.out.println("reston");
//
//			// click the room
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-9\"]/div/div[2]")));
//			System.out.println("room");
//
//			// choose room number
//			actions.moveToElement(wd.findElement(By.id("mat-option-55")));
//			System.out.println(" room number ");
//			// }

// click the submit button
//			actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[1]"))).click().perform();
//			System.out.println("submit button");
