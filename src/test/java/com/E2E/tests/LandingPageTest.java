package com.E2E.tests;

import org.testng.annotations.Test;

import com.E2E.Utils.InvokeDriver;
import com.E2E.pagefactory.Landingpage;
import com.E2E.pagefactory.SearchResultspage;

public class LandingPageTest extends InvokeDriver{
	
	@Test
	public void EnterTextInSearchField() throws InterruptedException {
		
		Landingpage landingpage = new Landingpage(driver);
		landingpage.enterText("movies");
		landingpage.submitSearch();
		String urltitle = landingpage.getTitle();
		System.out.println(urltitle);
		
	}
	

}
