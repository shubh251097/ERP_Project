package com.sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Hanadling_checkboxes {
	@Test(priority=0)
	public void login1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
			
        WebElement check1 = driver.findElement(By.id("checkBoxOption1"));
        System.out.println(check1.isDisplayed());
        System.out.println(check1.isEnabled());
        System.out.println(check1.isSelected());
        check1.click();
        Thread.sleep(2000);
        System.out.println(check1.isSelected());
		
       
        //option2
        WebElement check2 = driver.findElement(By.id("checkBoxOption2"));
        System.out.println(check2.isDisplayed());
        System.out.println(check2.isEnabled());
        System.out.println(check2.isSelected());
        check2.click();
        Thread.sleep(2000);
        System.out.println(check2.isSelected());
        
        //option3
        WebElement check3 = driver.findElement(By.id("checkBoxOption3"));
        System.out.println(check3.isDisplayed());
        System.out.println(check3.isEnabled());
        System.out.println(check3.isSelected());
        check3.click();
        Thread.sleep(2000);
        System.out.println(check3.isSelected());
        
        List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
        for(int i=0; i<list.size(); i++)
        {
        	list.get(i).click();
        	Thread.sleep(2000);
        }
        
       driver.close();
	}
    
	}
        
       
	




	


