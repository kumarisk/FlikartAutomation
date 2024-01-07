package com.E2E.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class FlipkartFashion_MenFootwear_All extends CommonActions{
	
	public WebDriver driver;

	public FlipkartFashion_MenFootwear_All(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public String gettitle() {
		String title = driver.getTitle();
		return title;
	}

}
