package com.TestNg.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GoogleTilteTest {

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
	@Test
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		
		
	}
	@Test
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	Assert.assertTrue(b);
	}
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
