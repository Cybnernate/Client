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
	
	@Test (priority = 7)
	void logout() {
		Actions actions = new Actions(wd);
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"logoutBTN\"]"))).click().perform();
		System.out.println("foundit 4");
		wd.close();
		wd.quit();
	}
	
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
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]"))).click().perform();
		
	}
	
	@Test (priority = 2)
	public void verifyLocationsPage () {
		Actions actions = new Actions(wd);
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-1\"]"))).click().perform();
	}
	
	@Test (priority = 3) 
	public void verifyCurriculaPage() {
		Actions actions = new Actions(wd);
		actions.moveToElement(wd.findElement(By.xpath("//*[@id=\"mat-tab-label-0-3\"]"))).click().perform();
	}
}












