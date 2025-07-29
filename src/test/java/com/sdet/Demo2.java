package com.sdet;

import org.testng.annotations.Test;

public class Demo2 {

	@Test(priority=2)
	public void validateLogin() {
		System.out.println("Login Succcessful");
	}
	@Test(priority=3)
	public void validateTitle() {
		System.out.println("Validate Title");
		
	}
	
}
