package com.TestNg.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNgBasics {

	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
	}
	@Test(priority=1, groups= "Title")
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=3, groups="Logo")
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	
	}
	@Test(priority=2, groups="Link Test")
	public void mailLinkTest(){
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4, groups="Test")
	public void test1(){
		System.out.println("test1");
	}
	@Test(priority=5,groups="Test")
	public void test2(){
		System.out.println("test2");	
	}
	@Test(priority=6,groups="Test")
	public void test3(){
		System.out.println("test3");
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
