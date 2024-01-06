package com.E2E.Utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonActions extends InvokeDriver {

	WebDriver driver;
	WebDriverWait wait;
	

	public CommonActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitUntilTitleContains(String titletext) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains(titletext));
	}

	public void visibilityOfElementLocated(By locator) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();

	}

	public void visibilityofAllElements(List<WebElement> list) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
	}

	public void visibilityOf(WebElement webelement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(webelement)).click();

	}
	
	public void elementToVisible(By webelement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(webelement));
		
	}
	
	public void elementToBeClickable(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void TakeScreenShot() throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "//Screenshots//screenshot.png"));

	}

	public SoftAssert softAssertion() {
		SoftAssert softAssert = new SoftAssert();
		return softAssert;

	}

	public Keys keyboardEnter() {
		Keys enter = Keys.ENTER;
		return enter;
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public Actions mouseActions(WebDriver driver) {
		Actions action = new Actions(driver);
		return action;
	}
	

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5700)");

	}
	
	public void scrollIntoView(WebElement element) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
	}
	
	

}
