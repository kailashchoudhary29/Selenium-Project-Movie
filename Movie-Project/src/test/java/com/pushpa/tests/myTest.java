package com.pushpa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pushpa.generics.Base;
import com.pushpa.page.imdbPage;
import com.pushpa.page.wikiPage;

public class myTest extends Base {

	String imdbReleaseDate , imdbCountryName ,wikiReleaseDate ,wikiCountryName;
		
	@Test(priority = 1)
	public void imdbTest()
	{
	  driver.get("https://www.imdb.com/title/tt9389998/releaseinfo?ref_=tt_dt_rdat");
	  imdbPage iPage = new imdbPage(driver);
	  System.out.println(" ============================= ");
	  imdbReleaseDate =iPage.releaseDateInfo();
	  System.out.println( imdbReleaseDate );
	  System.out.println(" ============================= ");
	  imdbCountryName = iPage.countryNameInfo();
	  System.out.println( imdbCountryName );
	  System.out.println(" ============================= ");
	  System.out.println(" imdbTest Execution successFul");
	  
	}

	
	
	@Test(priority = 2)
	public void wikiTest()
	{
		 driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		 wikiPage wPage = new wikiPage(driver);
		
		  System.out.println(" ============================= ");
		  wikiReleaseDate= wPage.releaseDateInfo();
		  System.out.println( wikiReleaseDate );
		  System.out.println(" ============================= ");
		  wikiCountryName= wPage.countryNameInfo();
		  System.out.println(  wikiCountryName );
		  System.out.println(" ============================= ");
		  System.out.println(" wikiTest Execution successFul");
		  
		  
		  Assert.assertEquals(imdbReleaseDate, wikiReleaseDate);
		  System.out.println("Release date is  verified");
		  Assert.assertEquals( imdbCountryName, wikiCountryName);
		  System.out.println("Country Name is  verified");
		  
		  
	}
}
