package com.E2E.tests;

import org.testng.annotations.Test;

import com.E2E.Resources.RetryFailedCases;
import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.FlipkartMobilePage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartMobilesPageTest extends InvokeDriver{
	
	
	@Test(groups= {"Smoke,Sanity"})
	public void selectMobileFromDefaultList() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object pageobj  = flipkartlandingpage.selectCategoryBasedOnInput("Mobiles");
		  ((FlipkartMobilePage)pageobj).selectMobile("POCO");
		
		
/*
 * below code is called from a individual methods created in landing page--------but the above code is with single method,
   that select based on user input like whether to go for grocery or mobiles or travel or ....etc
 * 
 * 
 * FlipkartMobilePage flipkartmobilepage = flipkartlandingpage.selectMobiles();
		flipkartmobilepage.selectMobile("APPLE iPhone 15 Pro Max (Natural Titanium, 256 GB)");
	}
 * 		
 */
	
	}
	
	@Test(groups= {"Smoke,Sanity"},retryAnalyzer = RetryFailedCases.class)
	public void searchSpecificMobile() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		FlipkartMobilePage flipkartmobilepage = flipkartlandingpage.selectMobiles();
		flipkartmobilepage.searchSpecificMobile("iphone");
		
	}

}
