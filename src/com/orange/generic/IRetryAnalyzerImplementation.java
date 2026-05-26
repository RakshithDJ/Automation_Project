package com.orange.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerImplementation implements IRetryAnalyzer{
	
	int retryCount =0;
	int maxRetryCount = 2; // retry 2 times
	
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount < maxRetryCount)
		{
			retryCount++;
			return true;
		}
		
		return false; // stop retry
	}

}
