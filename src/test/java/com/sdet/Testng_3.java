package com.sdet;

import org.testng.annotations.Test;

public class Testng_3 {
	@Test(priority=0)
	public void launchBrowser() {
		System.out.println("the code to launch the browser");
	}
	
	@Test(priority=1,dependsOnMethods = "launchBrowser")
	public void enterURL() {
		System.out.println("the code to enter the url");
	}

	@Test(priority=2,dependsOnMethods = "enterURL")
	public void verifyLogin()
	{
		System.out.println("code to verify login functionality");
	}
	
	@Test(dependsOnMethods = "verifyLogin")
	public void closeBrowser() {
		System.out.println("code to close the browser");
}
}
