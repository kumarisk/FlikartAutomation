package com.E2E.Resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotForFailedCase {
	
	
	////curently this class is not using in any of the class
	
	WebDriver driver;
	
public File takeScreenShot(String testCaseName) throws IOException {
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\reports"+testCaseName+".png");
		FileUtils.copyFile(source, destination);
		return destination;
	}

}
