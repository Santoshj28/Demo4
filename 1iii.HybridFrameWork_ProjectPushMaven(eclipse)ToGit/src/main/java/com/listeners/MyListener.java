package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utilities.DriverUtils;

public class MyListener extends BaseClass implements ITestListener{


	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"testcase passed with name as"+result.getName());
		
	}
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"testcase failed with name as"+result.getName());
		String path =DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
		}
    public void onTestSkipped(ITestResult result) {
    	test.log(Status.SKIP,"testcase skipped with name as"+result.getName());
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	public void onFinish(ITestContext context) {
		
	}

	public void onStart(ITestContext context) {
		
		
	}
}
