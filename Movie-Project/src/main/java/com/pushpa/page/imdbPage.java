package com.pushpa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imdbPage {
	
	@FindBy(xpath = "//table[@class= 'ipl-zebra-list ipl-zebra-list--fixed-first release-dates-table-test-only']//td//a[contains(text(),'India')]")
	private WebElement countryName ;
	
	@FindBy(xpath = "//table[@class= 'ipl-zebra-list ipl-zebra-list--fixed-first release-dates-table-test-only']//td//a[contains(text(),'India')]/parent::td/following-sibling::td[contains(text(),'December')]")
	private WebElement releaseDate ;
	
	
	
	
	public imdbPage(WebDriver driver)
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
