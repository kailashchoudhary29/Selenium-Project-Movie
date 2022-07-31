package com.pushpa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wikiPage {
	
	@FindBy(xpath = "//div[@class='plainlist']//li[contains( text(),'December')]")
	private WebElement releaseDate ;
	
	@FindBy(xpath = "//td[@class='infobox-data' and contains(text(),'India')]")
	private WebElement countryName ;
	
	
	
	
	public wikiPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	public WebElement getReleaseDateText() {
		return releaseDate ;
	}

	public WebElement getCountryNameText() {
		return countryName ;
	}

	// Business Library
	public String releaseDateInfo()
	{
		return (releaseDate.getText());
	}
	
	public String countryNameInfo()
	{
		return (countryName.getText());
	}


}
