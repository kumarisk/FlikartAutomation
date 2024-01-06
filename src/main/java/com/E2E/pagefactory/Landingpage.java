package com.E2E.pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class Landingpage extends CommonActions{
	
	public WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="APjFqb")
	WebElement textBox;
	
	public void enterText(String text) throws InterruptedException {
		textBox.sendKeys(text);
	}
	
	public SearchResultspage submitSearch() {
		textBox.sendKeys(keyboardEnter());
		SearchResultspage searchresults = new SearchResultspage(driver);
		return searchresults;
	}
	
	
	

}
