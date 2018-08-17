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

	@Test(priority = 0)
	public void verifyValidLogin() {
		launchApplication();
		WebElement element = wd.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div"));
		if (element.isDisplayed()) {
			LoginPage.user(wd).sendKeys("svp@revature.com");
			LoginPage.pass(wd).sendKeys("p@$$w0rd");
			LoginPage.submit(wd).click();
		}
	}
	
//	@Test(priority = 1)
//	public void verifyBatchesPage() {
//		// clicks batches column
//		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]")).click();
//		System.out.println("batches");
//		
//		BatchesPage.currentBatches(wd);
//		BatchesPage.editBatch(wd);
//		BatchesPage.createEditCollapse(wd);
//		BatchesPage.verifyCreateBatch(wd);
//	}
	


	@Test (priority = 2)
	public void verifyLocationsPage () {
		//clicks on location tag
		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-2\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(wd, 25);
		
		//click on add
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[1]/mat-panel-description/mat-icon")));
		wd.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[1]/mat-panel-description/mat-icon")).click();
		
		
		
	}
	
//	@Test (priority = 3) 
//	public void verifyCurriculaPage() {
//		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-3\"]")).click();
//	}
//	
//	@Test(priority = 4)
//	public void verifyTrainersPage() {
//		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-4\"]")).click();
//	}
//	
//	@Test(priority = 5) 
//	public void verifyReportsPage() {
//		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-5\"]")).click();
//	}
//	
//	@Test(priority = 6)
//	public void verifySettingsPage() {
//		wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-6\"]")).click();
//	}
}