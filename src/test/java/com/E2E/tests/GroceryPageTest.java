package com.E2E.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.E2E.Resources.RetryFailedCases;
import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartCartPage;
import com.E2E.pagefactory.FlipkartGroceryPage;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.FlipkartMobilePage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class GroceryPageTest extends InvokeDriver{
	
	@Test
	public void addtoCartFromDefaultProducts() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		Object grocerpagemethods  = flipkartlandingpage.selectCategoryBasedOnInput("Grocery");
		FlipkartGroceryPage grocer = (FlipkartGroceryPage)grocerpagemethods;
		grocer.deliveryTo("560038");
		grocer.clickOnRandomGroceryImage();
		String product = "AASHIRVAAD Atta with Multigrains";
		grocer.addToCart(product);
		
		
/*
 * below code is called from a individual methods created in landing page--------but the above code is with single method,
   that select based on user input like whether to go for grocery or mobiles or travel or ....etc
 * 
 * FlipkartGroceryPage flipkartgrocerypage = flipkartlandingpage.selectGrocery();
		flipkartgrocerypage.deliveryTo("560037");
		flipkartgrocerypage.clickOnRandomGroceryImage();
		String product = "AASHIRVAAD Atta with Multigrains";
		FlipkartCartPage cartpage = flipkartgrocerypage.addToCart(product) ;
 * 		
 */
			
	
	}
	
	@Test(retryAnalyzer = RetryFailedCases.class)
	public void searchForSpecificProduct() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		FlipkartGroceryPage flipkartgrocerypage = flipkartlandingpage.selectGrocery();
		flipkartgrocerypage.searchForProduct("almonds");
		Assert.assertTrue(false);
	}

}
