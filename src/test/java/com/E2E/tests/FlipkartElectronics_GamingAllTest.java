package com.E2E.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartElectronics_GamingAll;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartElectronics_GamingAllTest extends InvokeDriver{
	
	@Test
	public void verifyproductlistIsDisplayed() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		flipkartlandingpage. hoverCategories("Electronics");
		flipkartlandingpage.hoveredSubMenu("Gaming");
		FlipkartElectronics_GamingAll gamingAl = flipkartlandingpage.subMenuLists("All");
		boolean status =gamingAl.productList();
		Assert.assertTrue(status);
		
	}
	
	@Test
	public void selectRadomProductFromList() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		flipkartlandingpage. hoverCategories("Electronics");
		flipkartlandingpage.hoveredSubMenu("Gaming");
		FlipkartElectronics_GamingAll gamingAl = flipkartlandingpage.subMenuLists("All");
		gamingAl.productTitles("Gaming");
		
		
	}

}
