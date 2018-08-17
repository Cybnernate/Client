package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Driver2 {

	static WebDriver wd;
	
	void launchApplication() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://assignforce-client.cfapps.io");
	}
	
//	@Test (priority = 7)
//	void logout() {
//		Actions actions = new Actions(wd);
//		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"logoutBTN\"]"))).click().perform();
//		System.out.println("foundit 4");
//		wd.close();
//		wd.quit();
//	}
	
	@Test (priority = 0)
	public void verifyValidLogin() {
		launchApplication();
		WebElement element = wd.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div"));
		if(element.isDisplayed()) {
			LoginPage.user(wd).sendKeys("svp@revature.com");
			LoginPage.pass(wd).sendKeys("p@$$w0rd");
			LoginPage.submit(wd).click();
		}
	}
	
	@Test (priority = 1)
public void verifyBatchesPage() {
		
		Actions actions = new Actions(wd);
		//clicks batches column
		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
		System.out.println("batches");
		
		//clicks ciriculum drop down
		WebDriverWait wait = new WebDriverWait(wd, 55); 
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-select-3\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-select-3\"]")).click();
		System.out.println("ciric");
		
		//clicks .NET option
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-option-0")));
		//wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		wd.findElement(By.id("mat-option-0")).click();
		System.out.println(".NET");
		
		//clicks start date pop up
//		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")));
		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")).click();
		//wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button")).click();
		System.out.println("calendar");
	
		//clicks august 28th box
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-datepicker-2\"]/div[2]/mat-month-view/table/tbody/tr[5]/td[3]/div")));
		wd.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div[2]/mat-month-view/table/tbody/tr[5]/td[3]/div")).click();
		
		//clicks the trainer
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[3]/mat-form-field[1]")));
		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[3]/mat-form-field[1]")).click();
		System.out.println("trainer");
		
		//clicks on william
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-option-173")));
		wd.findElement(By.id("mat-option-173")).click();
		System.out.println("william");
	
		//clicks on co trainer
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("mat-select-6")));
		wd.findElement(By.id("mat-select-6")).click();
		System.out.println("cotrainer");
		
		//clicks on august
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mat-option-25")));
		wd.findElement(By.id("mat-option-25")).click();
		System.out.println("august");
		
		//clicks on location
//		wd.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-select-7\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-select-7\"]")).click();
		System.out.println("location");

		//clicks on HQ
//		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-option-48\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-48\"]")).click();
		System.out.println("HQ");
		
		//clicks on building
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mat-select-8\\\"]/div/div[2]/div")));
		wd.findElement(By.xpath("//*[@id=\"mat-select-8\"]/div/div[2]/div")).click();
		System.out.println("building");
		
		//clicks on building number
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"mat-option-196\\\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-196\"]")).click();
		System.out.println("building number");
		
		
		//clicks on room
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-option-196\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-196\"]")).click();
		System.out.println("room");
		
		//clicks on room number
//		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);)
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-option-56\"]")));
		wd.findElement(By.xpath("//*[@id=\"mat-option-56\"]")).click();
		System.out.println("room number");
		
		//clicks cancel button
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[2]")));
		wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[5]/button[2]")).click();
		System.out.println("cancel");
		
		//clicks submit button
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id="cdk-accordion-child-3"]/div/form/div[5]/button[1]")));
//		wd.findElement(By.xpath("//*[@id="cdk-accordion-child-3"]/div/form/div[5]/button[1]"));
//		System.out.println("submit button");
	}
}



//	@Test (priority = 2)
//	public void verifyLocationsPage () {
//		Actions actions = new Actions(wd);
//		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]"))).click().perform();
//	}
//	
//	@Test (priority = 3) 
//	public void verifyCurriculaPage() {
//		Actions actions = new Actions(wd);
//		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-3\"]"))).click().perform();
//	}