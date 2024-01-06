package com.E2E.tests;

import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.FlipkartLoginPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartLoginPageTest extends InvokeDriver{
	
	@Test
	public void loginToFlipkart() throws InterruptedException {
		
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		FlipkartLoginPage loginpage = flipkartlandingpage.clickLoginbtn();
		loginpage.enterMobileOrEmail("9857767833");
		
		
	}

}
