package com.E2E.Resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporter {
	
	public static ExtentReports reporObjectCreation() {
		
		String path = System.getProperty("user.dir")+"\\ExtentReports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Flipkar Automation Report");
		reporter.config().setDocumentTitle("Flipkart Test Report");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sudheer");
		return extent;
	}

}
