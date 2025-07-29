package com.sdet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
@Test(priority=0,invocationCount = 1)
	public void setup() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
	driver.findElement(By.id("autocomplete")).sendKeys("India");
	Thread.sleep(2000);
	driver.findElement(By.name("radioButton")).click();
	Thread.sleep(2000);
	WebElement check1=driver.findElement(By.id("checkBoxOption1"));
	System.out.println(check1.isDisplayed());
	System.out.println(check1.isSelected());
	System.out.println(check1.isEnabled());
	check1.click();
	
	Thread.sleep(2000);
	
	WebElement drpdown=driver.findElement(By.id("dropdown-class-example"));
	Select sc=new Select(drpdown);
	sc.selectByValue("option1");
	Thread.sleep(2000);
	
	driver.findElement(By.name("enter-name")).sendKeys("Shubham");
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	Thread.sleep(3000);
	
	//scroll down on a web page in Selenium by defining the number of pixels
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)","");
        Thread.sleep(2000);
	driver.findElement(By.id("hide-textbox")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("show-textbox")).click();
	Thread.sleep(2000);
	
	JavascriptExecutor jy=(JavascriptExecutor)driver;
	jy.executeScript("window.scrollBy(0,-500)","");
	driver.findElement(By.id("opentab")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	
	
	
	
	driver.close();

}

}
