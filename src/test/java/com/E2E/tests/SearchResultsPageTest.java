package com.E2E.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.E2E.Resources.RetryFailedCases;
import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class SearchResultsPageTest extends InvokeDriver{
	
	@Test(retryAnalyzer = RetryFailedCases.class)
	public void ClickOnFlipkart() throws InterruptedException {
	
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage = landingpage.submitSearch();
		searchresultspage.clickOnLink();
		
	}

}
