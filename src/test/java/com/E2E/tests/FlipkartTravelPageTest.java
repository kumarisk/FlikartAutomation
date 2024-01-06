package com.E2E.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartGroceryPage;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.FlipkartTravelPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartTravelPageTest extends InvokeDriver{
	
	
	
	@Test
	public void verifyFromAddressFieldIsEnabled() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object travelpagemethods  = flipkartlandingpage.selectCategoryBasedOnInput("Travel");
		FlipkartTravelPage travel = (FlipkartTravelPage)travelpagemethods;
		boolean fromactual = travel.fromAddressIsEnabled();
		Assert.assertTrue(fromactual);
	}
	
	
	@Test
	public void verifyToAddressFieldIsEnabled() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object travelpagemethods  = flipkartlandingpage.selectCategoryBasedOnInput("Travel");
		FlipkartTravelPage travel = (FlipkartTravelPage)travelpagemethods;
		boolean toactual = travel.toAddressIsEnabled();
		Assert.assertTrue(toactual);
	}
	
	@Test
	public void verifyDepartureIsEnabled() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object travelpagemethods  = flipkartlandingpage.selectCategoryBasedOnInput("Travel");
		FlipkartTravelPage travel = (FlipkartTravelPage)travelpagemethods;
		boolean depatureActual = travel.departureOnIsEnabled();
		Assert.assertTrue(depatureActual);
	}
	
	@Test
	public void searchBasedOnDate() throws InterruptedException {
		
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object travelpagemethods  = flipkartlandingpage.selectCategoryBasedOnInput("Travel");
		FlipkartTravelPage travel = (FlipkartTravelPage)travelpagemethods;
		travel.selectFromAddressPO("hyd", "HYD");
		travel.selectToAddressPO("ben", "BLR");
		travel.selectdate("September 2024","23");
		travel.selecttravellers(2, 1, 1);
		travel.selectCabin("Business");
		travel.clickSearchbtn();
		
		
	}
	

}
