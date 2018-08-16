package com.revature.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Driver2 {

	static WebDriver wd;
	
	void launchApplication() {
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://assignforce-client.cfapps.io/login");
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
		LoginPage.user(wd).sendKeys("svp@revature.com");
		LoginPage.pass(wd).sendKeys("p@$$w0rd");
		LoginPage.submit(wd).click();
	}
	
	@Test (priority = 1)
	public void verifyBatchesPage() {
		
		Actions actions = new Actions(wd);
		//clicks batches column
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]"))).click().perform();
		System.out.println("batches");
		
		//clicks ciriculum drop down
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-3\"]"))).click().perform();
		System.out.println("ciric");
		
		//clicks .NET option
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-8\"]"))).click().perform();
		System.out.println(".NET");
		
		//clicks start date pop up
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[2]/mat-form-field[1]/div/div[1]/div[1]/mat-datepicker-toggle/button"))).click().perform();
		System.out.println("calendar");
		
		//clicks august 16th box
		wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-datepicker-2\"]/div[2]/mat-month-view/table/tbody/tr[3]/td[5]/div"))).click().perform();
		
		//clicks the trainer
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-5\"]/div/div[2]/div"))).click().perform();
		System.out.println("trainer");
		
		//clicks on william
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-173\"]"))).click().perform();
		System.out.println("william");
	
		//clicks on co trainer
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]"))).click().perform();
		System.out.println("cotrainer");
		
		//clicks on august
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-option-24\"]"))).click().perform();
		System.out.println("august");
		
		//clicks on location
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"cdk-accordion-child-3\"]/div/form/div[4]/mat-form-field[1]"))).click().perform();
		System.out.println("location");
		
		//clicks on HQ
		actions.moveToElement(wd.findElement(By.id("mat-option-16"))).click().perform();
		System.out.println("HQ");
		
		//clicks on building
//		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-select-29\"]/div/div[2]"))).click().perform();
//		System.out.println("building");
		
		//clicks on building number
		//actions.moveToElement(wd.findElement(By.xpath(xpathExpression))).click().perform();
		//System.out.println("building number");
		
		//clicks on room
		//actions.moveToElement(wd.findElement(By.xpath(xpathExpression))).click().perform();
		//System.out.println("room");
		
		//clicks on room number
		//actions.moveToElement(wd.findElement(By.xpath(xpathExpression))).click().perform();
		//System.out.println("room number");
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
}












