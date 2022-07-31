package com.pushpa.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.pushpa.page.imdbPage;
import com.pushpa.page.wikiPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	 
	

	
	
	@BeforeSuite
	public void dbConnection()
	{
		
		System.out.println(" ======== DataBase Connection SuccessFul ======= ");
	}
	@BeforeMethod
	public void launchBrowser() throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		System.out.println(" ======== Browser Launched ======= ");
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		System.out.println(" ======== Browser Closed ======= ");
	}
	@AfterSuite
	public void closeDBConnection()
	{
		
		System.out.println(" ======== DataBase Connection Closed ======= ");
	}
}


