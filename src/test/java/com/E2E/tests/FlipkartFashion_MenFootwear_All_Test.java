package com.E2E.tests;

import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartElectronics_GamingAll;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartFashion_MenFootwear_All_Test extends InvokeDriver{
	
	@Test
	public void selectFashionMensFootwearAll() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();	
		flipkartlandingpage. hoverCategories(prop.getProperty("selectCategoryToHover"));
		flipkartlandingpage.hoveredSubMenu(prop.getProperty("selectSubMenuToHover"));
		flipkartlandingpage.subMenuLists(prop.getProperty("selectSubMenuCategory"));
	}

}
