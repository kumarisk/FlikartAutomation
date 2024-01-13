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
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		flipkartlandingpage. hoverCategories(prop.getProperty("HoverOnElectronics"));
		flipkartlandingpage.hoveredSubMenu(prop.getProperty("selectSubMenuFromElectronicsDropdown"));
		FlipkartElectronics_GamingAll gamingAl = flipkartlandingpage.subMenuLists(prop.getProperty("selectCategoryFromElectronicsSubMenu"));
		boolean status =gamingAl.productList();
		Assert.assertTrue(status);
		
	}
	
	@Test
	public void selectRadomProductFromList() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		flipkartlandingpage. hoverCategories(prop.getProperty("HoverOnElectronics"));
		flipkartlandingpage.hoveredSubMenu(prop.getProperty("selectSubMenuFromElectronicsDropdown"));
		FlipkartElectronics_GamingAll gamingAl = flipkartlandingpage.subMenuLists(prop.getProperty("selectCategoryFromElectronicsSubMenu"));
		gamingAl.productTitles("Gaming");
		
		
	}

}
