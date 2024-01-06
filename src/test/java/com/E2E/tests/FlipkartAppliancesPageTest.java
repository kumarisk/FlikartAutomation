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
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object applianceses  = flipkartlandingpage.selectCategoryBasedOnInput("Appliances");
		FlipkartAppliancesPage appliance = (FlipkartAppliancesPage)applianceses;
		appliance.openeachlinkInNewTab();
	}

}
