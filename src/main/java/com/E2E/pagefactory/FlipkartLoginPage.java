package com.E2E.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class FlipkartLoginPage extends CommonActions{
	
	
	public WebDriver driver;

	public FlipkartLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement mobileEmailField;
	
	By login = By.xpath("//label[@class='_1fqY3P']");
	
	
	public void enterMobileOrEmail(String emailMobile) {
		elementToBeClickable(login);
		mobileEmailField.click();
		mobileEmailField.sendKeys(emailMobile);
	}
	
	

}
