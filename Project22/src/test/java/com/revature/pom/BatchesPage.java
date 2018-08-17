package com.revature.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BatchesPage {
	
	public static void currentBatches(WebDriver wd) {
		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
		System.out.println("batches");
		
		WebDriverWait wait = new WebDriverWait(wd, 50);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hidebatchless\"]")));
		wd.findElement(By.xpath("//*[@id=\"hidebatchless\"]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hideinactive\"]")));
		wd.findElement(By.xpath("//*[@id=\"hideinactive\"]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hideconcluded\"]")));
		wd.findElement(By.xpath("//*[@id=\"hideconcluded\"]")).click();
	}
	
	
	public static void createEditCollapse(WebDriver wd) {
		// clicks batches column
		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
		System.out.println("batches");
		
		WebDriverWait wait = new WebDriverWait(wd,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-expansion-panel-header-3\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-3\"]"));
		

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]"));
	}

	public static void editBatch(WebDriver wd) {
		// clicks batches column
		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
		System.out.println("batches");
		
		WebDriverWait wait = new WebDriverWait(wd, 55);
		
		//click first checkbox
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"checkcell\"]")));
		wd.findElement(By.xpath("//*[@id=\"checkcell\"]")).click();
		System.out.println("checkbox");
		
		//click edit button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/mat-table/mat-row[1]/mat-cell[10]/button[1]")));
		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/mat-table/mat-row[1]/mat-cell[10]/button[1]")).click();
		System.out.println("edit");
		
//		//clicks delete
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/mat-table/mat-row[1]/mat-cell[10]/button[2]")));
//		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-1\"]/div/div/mat-table/mat-row[1]/mat-cell[10]/button[2]")).click();
//		System.out.println("delete");
		
//		// clicks cancel button
//		wait.until(ExpectedConditions
//				.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[2]")));
//		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[2]")).click();
//		System.out.println("cancel");
//
//		// clicks submit button
////		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id="cdk-accordion-child-3"]/div/form/div[5]/button[1]")));
////		wd.findElement(By.xpath("//*[@id="cdk-accordion-child-3"]/div/form/div[5]/button[1]"));
////		System.out.println("submit button");
		
	}

	public static void verifyCreateBatch(WebDriver wd) {

		// clicks batches column
		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
		System.out.println("batches");

		// clicks ciriculum drop down
		WebDriverWait wait = new WebDriverWait(wd, 55);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-select-3\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-select-3\"]")).click();
		System.out.println("ciric");

		// clicks .NET option
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-option-0")));
		// wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		wd.findElement(By.id("mat-option-0")).click();
		System.out.println(".NET");

		// clicks start date pop up
//		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")));
		wd.findElement(By.xpath(
				"//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button"))
				.click();
		// wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")).click();
		System.out.println("calendar");

		// clicks august 28th box
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"mat-datepicker-2\"]/div[2]/mat-month-view/table/tbody/tr[5]/td[3]/div")));
		wd.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div[2]/mat-month-view/table/tbody/tr[5]/td[3]/div"))
				.click();

		// clicks the trainer
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[3]/mat-form-field[1]")));
		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[3]/mat-form-field[1]")).click();
		System.out.println("trainer");

		// clicks on william
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-option-173")));
		wd.findElement(By.id("mat-option-173")).click();
		System.out.println("william");

		// clicks on co trainer
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("mat-select-6")));
		wd.findElement(By.id("mat-select-6")).click();
		System.out.println("cotrainer");

		// clicks on august
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-option-25")));
		wd.findElement(By.id("mat-option-25")).click();
		System.out.println("august");

		// clicks on location
//		wd.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-select-7\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-select-7\"]")).click();
		System.out.println("location");

		// clicks on HQ
//		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-option-48\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-48\"]")).click();
		System.out.println("HQ");

		// clicks on building
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mat-select-8\\\"]/div/div[2]/div")));
		wd.findElement(By.xpath("//*[@id=\"mat-select-8\"]/div/div[2]/div")).click();
		System.out.println("building");

		// clicks on building number
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mat-option-196\\\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-196\"]")).click();
		System.out.println("building number");

		// clicks on room
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-option-196\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-196\"]")).click();
		System.out.println("room");

		// clicks on room number
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);)
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-option-56\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-56\"]")).click();
		System.out.println("room number");

		// clicks cancel button
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[2]")));
		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[2]")).click();
		System.out.println("cancel");

		// clicks submit button
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id="cdk-accordion-child-3"]/div/form/div[5]/button[1]")));
//		wd.findElement(By.xpath("//*[@id="cdk-accordion-child-3"]/div/form/div[5]/button[1]"));
//		System.out.println("submit button");
	}	
}