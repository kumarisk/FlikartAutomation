package com.E2E.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class InvokeDriver {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver() {

		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			//System.setProperty("webdriver.driver.chromedriver", System.getProperty("user.dir")+"");
			ChromeOptions chromeoption = new ChromeOptions();
			if(browserName.contains("headless")) {
				chromeoption.addArguments("headless");	
			}
			driver = new ChromeDriver(chromeoption);
			//driver.manage().window().setSize(new Dimension(1920,1200));
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		return driver;

	}
	
	@BeforeMethod
	public void launchURL() {
		WebDriver driver = initDriver();
		driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		//driver.close();
		
	}
	
	@BeforeSuite
	public Properties propertiesFile() throws IOException {
		FileInputStream inputFile = new FileInputStream(
				System.getProperty("user.dir") + "\\prop.properties");
		prop = new Properties();
		prop.load(inputFile);
		return prop;
	}
	
	public String takeScreenShot(String testCaseName,WebDriver driver) throws IOException {
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	}

}
