package com.E2E.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.E2E.Resources.RetryFailedCases;
import com.E2E.Utils.CommonActions;
import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartLandingPageTest extends InvokeDriver{
	
	
	@Test
	public void verifyFlipkartlogo() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		boolean logo = flipkartlandingpage.verifyLogo();
		Assert.assertTrue(logo);
	}
	
	
	
	@Test(groups= {"Smoke"})
	public void ClickOnMobiles() throws InterruptedException {
		String expectedtitle = "Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		flipkartlandingpage.entertextInSearch("mobiles");
		String currenttitle =flipkartlandingpage.grabTitle();
		Assert.assertEquals(currenttitle, expectedtitle);
	}
	
	@Test(groups= {"Smoke,Sanity"},retryAnalyzer = RetryFailedCases.class)
	public void selectMobileCategory() throws InterruptedException {
		String expectedtitle = "Mobile Phones Online at Best Prices in India";
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		flipkartlandingpage.selectMobiles();
		String currenttitle =flipkartlandingpage.grabTitle();
		Assert.assertEquals(currenttitle, expectedtitle);
		
	}
	
	@Test(groups= {"Smoke"},retryAnalyzer = RetryFailedCases.class)
	public void selectGroceryCategory() throws InterruptedException {
		String expectedtitle = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();		
		flipkartlandingpage.selectGrocery();
		String currenttitle =flipkartlandingpage.grabTitle();
		Assert.assertEquals(currenttitle, expectedtitle);
		
	}
	
	
	@Test
	public void gamingAllFromElectronicsCategory() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		flipkartlandingpage.hoverCategories("Electronics");
		flipkartlandingpage.hoveredSubMenu("Gaming");
		flipkartlandingpage.subMenuLists("All");
		Thread.sleep(5000);
	}
	
	@Test(groups= {"Smoke,Sanity"})
	public void selectTravelCategory() throws InterruptedException {
		String expectedtitle = "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();		
		flipkartlandingpage.selectTravel();
		Thread.sleep(2000);
		String currenttitle =flipkartlandingpage.grabTitle();
		Assert.assertEquals(currenttitle, expectedtitle);
		
	}
	
	@Test(groups= {"Smoke"},retryAnalyzer = RetryFailedCases.class)
	public void selectAppliancesCategory() throws InterruptedException {
		String expectedtitle = "Tvs And Appliances New Clp Store Online - Buy Tvs And Appliances New Clp Online at Best Price in India | Flipkart.com";
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();		
		flipkartlandingpage.selectAppliances();
		String currenttitle =flipkartlandingpage.grabTitle();
		Assert.assertEquals(currenttitle, expectedtitle);
	
	}
	
	@Test(groups= {"Smoke,Sanity"},retryAnalyzer = RetryFailedCases.class)
	public void verifyribbonsIsDisplayed() throws InterruptedException {
		String expectedtitle = "Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();		
		flipkartlandingpage.ribbonsIsDisplayed();
		
	}
	
}
