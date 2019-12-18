package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
WebDriver driver;
	
	@Parameters({"emailId"})
	@Test
	public void yahooLoginTest( String emailId){
		System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.xpath("//*[@id='login-username']")).clear();
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("emailId");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	} 
}
