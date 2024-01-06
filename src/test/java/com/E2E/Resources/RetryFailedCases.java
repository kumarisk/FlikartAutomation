package com.E2E.Resources;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedCases implements IRetryAnalyzer{
	
	int start = 0;
	int maxTry = 1;

	@Override
	public boolean retry(ITestResult result) {
		
		if(start<maxTry) {
			start++;
			return true;
		}
		return false;
	}

}
