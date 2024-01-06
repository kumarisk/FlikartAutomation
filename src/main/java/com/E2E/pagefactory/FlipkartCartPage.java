package com.E2E.pagefactory;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.E2E.Utils.CommonActions;

public class FlipkartCartPage extends CommonActions{

	WebDriver driver;
	

	public FlipkartCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * webelement to get cart page title (My cart)
	 */
	@FindBy(xpath = "//div[contains(text(),'My Cart')]")
	WebElement mycart;
	/**
	 * webelement for grocery tab and flipkart tab
	 */
	@FindBy(xpath = "//a[@class='_2hJxpa'] ")
	List<WebElement> groceryFlikartTabs;
	/**
	 * webelement to get product name under cart page
	 */
	@FindBy(xpath = "//div[@class='_-4o6jJ'] //a")
	WebElement productname;
	
	@FindBy(xpath = "//div[@class='_38NiRp']")
	WebElement deleviryChangebtn;
	
	/**
	 * webelement to get the total price
	 */
	@FindBy(xpath = "//div[@class='Ob17DV _3X7Jj1'] //span")
	WebElement totalprice;

	/**
	 * webelement to get remove btn
	 */
	@FindBy(xpath = "//div[contains(text(),'Remove')]")
	WebElement removebtn;

	/**
	 * webelement to get save for later button
	 */
	@FindBy(xpath = "//div[contains(text(),'Save for later')]")
	WebElement saveforlaterbtn;

	/**
	 * webelement to get your savings text
	 */
	@FindBy(xpath = "//div[@class='_3s5O6i']")
	WebElement yoursavings;

	/**
	 * webelement of place order button
	 */
	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	WebElement placeorderbtn;

	/**
	 * calling ADD to cart method from product page
	 * 
	 * @throws InterruptedException
	 */
	public void addtoCart() throws InterruptedException {
		
	}

	public void myCart() {
		mycart.isDisplayed();
	}

	public boolean productName() {
		boolean name= productname.isDisplayed();
		return name;
	}

	public boolean totalPrice() {
		boolean price = totalprice.isDisplayed();
		return price;
	}

	public boolean removeBtn() {
		boolean btn = removebtn.isDisplayed();
		return btn;
	}

	public boolean savaForLaterBtn() {
		boolean savelaterbtn = saveforlaterbtn.isDisplayed();
		return savelaterbtn;
	}

	public boolean yourSavings() {
		boolean savings = yoursavings.isDisplayed();
		return savings;
	}

	public boolean placeOrderBtn() {
		boolean placeorder = placeorderbtn.isEnabled();
		return placeorder;
	}

	public void windowHandle(String tabname) {
		Set<String> tab = driver.getWindowHandles();
		Iterator<String> it = tab.iterator();
		String parenttab = it.next();
		String childtab = it.next();
		driver.switchTo().window(tabname);
	}

}
