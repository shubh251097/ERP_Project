package com.sdet;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Taking_ScreenShots {

	@Test
	public void m1() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/controlgroup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		// File destFile = new
		// File("C:\\Users\\Shubham\\Desktop\\SSQUARE\\ScreenShots\\img1.jpg");
		// C:\Users\Shubham\Desktop\SSQUARE\ScreenShots
		File destFile = new File(
				"C:\\\\Users\\\\Shubham\\\\Desktop\\\\Square\\\\ScreenShots\\Screenshot23_" + timestamp + ".jpg");
		Files.copy(srcFile, destFile);
		Thread.sleep(2000);
		System.out.println("ScreenShot Captured");

	}
}
