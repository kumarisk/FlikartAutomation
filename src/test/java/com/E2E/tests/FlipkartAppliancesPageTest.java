package com.E2E.tests;

import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartAppliancesPage;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartAppliancesPageTest extends InvokeDriver{
	
	@Test
	public void openEveryImageAndNavigateBack() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText(prop.getProperty("enterSiteName"));
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object applianceses  = flipkartlandingpage.selectCategoryBasedOnInput(prop.getProperty("selectAppliancesCategory"));
		FlipkartAppliancesPage appliance = (FlipkartAppliancesPage)applianceses;
		appliance.openeachlinkInNewTab();
	}

}
