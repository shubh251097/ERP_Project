package com.sdet;

import org.testng.annotations.Test;

public class Demo1 {
	int a=30;
	int b=10;
	
		@Test (priority=0)
		public void add(){
			
			System.out.println(a+b);
		}

		@Test(priority=1)
		public void sub() {
			System.out.println(a-b);
		}
			
		@Test(priority=-1)
		         public void mutiply() {
				System.out.println(a*b);
				}
		
				

			@Test(priority=1)
			public void division() {
				System.out.println(a/b);
				
			}
		}
	


