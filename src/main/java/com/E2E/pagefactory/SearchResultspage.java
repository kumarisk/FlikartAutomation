package com.E2E.pagefactory;

import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class SearchResultspage extends CommonActions{
	
 public WebDriver driver;
	
	public SearchResultspage(WebDriver driver2) {
		super(driver2);
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//div[@class='BYM4Nd'] //h3[@class='LC20lb MBeuO DKV0Md']")
	WebElement link;
	

	public FlipkartLandingPage clickOnLink() {
		visibilityOf(link);
		FlipkartLandingPage flipkartlandingpage = new FlipkartLandingPage(driver);
		return flipkartlandingpage;
	}

}
