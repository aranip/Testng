package com.TestNg.test;

import org.testng.annotations.Test;
//import org.testng.annotations.*;

public class TestNgFeatures {

	@Test
	public void loginTest(){
		System.out.println("Login test");
		//int i =9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("HomePage test");
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest(){
		System.out.println("searchPage test");
	}
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("RegPage test");
	}
	
	
	
	
}




