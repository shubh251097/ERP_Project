package com.sdet;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_2 {
	@Test
	public void m1() {
		System.out.println("method m1");
	}

	@Test
	public void m2() {
		System.out.println("method m2");
	}

	@Test
	public void m3() {
		System.out.println("method m3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this code will get execute before any method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this code will execute after execution of every @Test method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this code will execute before starting execution of the class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this code get executed after execution of entire class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this code will get execute before all @test annoted method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this code will get execute after all @test annoted method");
	}
}