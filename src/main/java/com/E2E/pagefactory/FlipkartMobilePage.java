package com.E2E.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E2E.Utils.CommonActions;

public class FlipkartMobilePage extends CommonActions {

	public WebDriver driver;

	public FlipkartMobilePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='_3YgSsQ'] //a[@class='s1Q9rs']")
	List<WebElement> productNames;
	
	By by = By.xpath("//div[@class='_3YgSsQ'] //a[@class='s1Q9rs']");
	
	@FindBy(xpath="//div[@class='_1AtVbE col-12-12'][7]")
	WebElement bestSelling;
	

	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement mobileSearchBlock;

	public void selectMobile(String enterProduct) throws InterruptedException {
		//scrollDown();
		scrollIntoView(bestSelling);
		for (int i = 0; i < productNames.size(); i++) {
			String productsText = productNames.get(i).getText();
			System.out.println(productsText);
			if (productsText.contains(enterProduct)) {
				productNames.get(i).click();
				break;
			}
		}
	}

	public void searchSpecificMobile(String entermobileName) {
		mobileSearchBlock.sendKeys(entermobileName);
		mobileSearchBlock.sendKeys(keyboardEnter());
	}

}
