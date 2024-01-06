package com.E2E.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.FlipkartCartPage;
import com.E2E.pagefactory.FlipkartGroceryPage;
import com.E2E.pagefactory.FlipkartLandingPage;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class FlipkartCartPageTest extends InvokeDriver{
	
	@Test
	public void verfiyProductAddedToCartPage() throws InterruptedException {
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("flipkart");
		SearchResultspage searchresultspage =landingpage.submitSearch();
		FlipkartLandingPage flipkartlandingpage = searchresultspage.clickOnLink();
		flipkartlandingpage.closeLoginWindow();
		FlipkartGroceryPage flipkartgrocerypage = flipkartlandingpage.selectGrocery();
		flipkartgrocerypage.deliveryTo("560037");
		flipkartgrocerypage.clickOnRandomGroceryImage();
		String product = "AASHIRVAAD Atta with Multigrains";
		FlipkartCartPage cartpage = flipkartgrocerypage.addToCart(product) ;
		flipkartgrocerypage.clickOnCart();
		boolean  productName=cartpage.productName();
		Assert.assertTrue(productName);
		boolean  totalPrice=cartpage.totalPrice();
		Assert.assertTrue(totalPrice);
		boolean  yourSavings=cartpage.yourSavings();
		Assert.assertTrue(yourSavings);
		boolean  placeOrderBtn=cartpage.placeOrderBtn();
		Assert.assertTrue(placeOrderBtn);
		
		
	}

}
