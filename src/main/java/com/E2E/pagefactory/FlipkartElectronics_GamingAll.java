package com.E2E.pagefactory;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class FlipkartElectronics_GamingAll extends CommonActions{
	
	public WebDriver driver;
	boolean productlist;

	public FlipkartElectronics_GamingAll(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='_4ddWXP']")
	List<WebElement> productsTiles;
	
	@FindBy(xpath="//div[@class='_4ddWXP'] //a[@class='s1Q9rs']")
	List<WebElement> productsTitles;
	

			
	

	public boolean productList() {
		
		for(int i=0;i<productsTiles.size();i++) {
			productlist = productsTiles.get(i).isDisplayed();	
		}
		return productlist;
	}
	
	
	public void productTitles(String text) {
		for(int j=0;j<productsTitles.size();j++) {
			String productTitleName = productsTitles.get(j).getText();
			if(productTitleName.contains(text)) {
				productsTitles.get(j).click();
				break;
			}
		}
	}
}
