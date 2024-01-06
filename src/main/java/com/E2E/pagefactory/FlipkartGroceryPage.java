package com.E2E.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class FlipkartGroceryPage extends CommonActions{
	
	public WebDriver driver;

	public FlipkartGroceryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='_2yTL60']")
	WebElement deliverTo;
	
	@FindBy(xpath="//input[@title='Enter pincode']")
	WebElement pincodeBlock;
	
	@FindBy(xpath="//div[@class='_1bEAQy _2iN8uD']")
	WebElement landingPageproductslist;
	
	@FindBy(xpath="//div[@class='_1MbXnE']")
	List<WebElement> productTitleList;
	
	@FindBy(xpath="//button[@class='_2KpZ6l GX4Kov']")
	List<WebElement> addToCartbtn;
	
	@FindBy(xpath="//input[@class='_3704LK']")
	WebElement searchBlock;
	
	@FindBy(xpath="//a[@class='_3SkBxJ']")
	WebElement headerCartbtn;
	
	
	
	public void deliveryTo(String pincode) throws InterruptedException {
		mouseActions(driver).moveToElement(deliverTo);
		pincodeBlock.sendKeys(pincode);
		pincodeBlock.sendKeys(keyboardEnter());;
	}
	
	public void clickOnRandomGroceryImage() {
		visibilityOf(landingPageproductslist);
		//landingPageproductslist.click();
	}
	
	public FlipkartCartPage addToCart(String productname) {
		for(int i=0;i<productTitleList.size();i++) {
			String productName = productTitleList.get(i).getText();
			System.out.println(productName);
			if(productName.contains(productname)) {
				addToCartbtn.get(i).click();
				break;
			}
		}
		
		FlipkartCartPage cartpage = new FlipkartCartPage(driver);
		return cartpage;
	}
	
	public void searchForProduct(String enterproductName) {
		
		searchBlock.sendKeys(enterproductName);
		searchBlock.sendKeys(keyboardEnter());
	}
	
	public void clickOnCart() {
		headerCartbtn.click();
	}

}
