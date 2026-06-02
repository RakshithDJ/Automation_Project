package com.orange.generic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener, IAutoConstant {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File Path = takescreenshot.getScreenshotAs(OutputType.FILE);
		String timestamp = TimestampUtility.timestamp;
		File location = new File(SCREENSHOT_PATH + methodName + "_" +timestamp+ ".png");
		try {
			FileUtils.copyFile(Path, location);
		} catch (IOException e) {
			Reporter.log("Exception Handled");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

}
