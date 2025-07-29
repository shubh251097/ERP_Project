package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_1 {
static WebDriver driver;
	
	@Test(priority = 4)
	public void verifyLogin()
	{
		WebElement login = driver.findElement(By.id("Login"));
	
		login.click();
	}
	
	@Test(priority = 2)
	public void enterUsername() {
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("demo123");
	}
	
	@Test(priority = 3)
	public void enterPassword()
	{
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("demo123");
	}
	
	@Test(priority = 1)
	public void enterUrl() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
}
}
