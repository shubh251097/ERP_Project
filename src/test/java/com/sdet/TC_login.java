package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login {

	@Test(priority=0)
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String expurlurl=driver.getCurrentUrl();
		String acturl=("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println(acturl.equals(expurlurl));
		System.out.println(driver.getTitle());
		
		//Assert.assertEquals(false, null)
		
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
      driver.close();
		
				
		
	}
}
