package com.reports.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.reports.utils.Log;

public class CustomListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
			Log.info("Im on " + result.getName() + " Test .... starting ...");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info("Im on " + result.getName() + " Test .... success ...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log.info("Im on " + result.getName() + " Test .... failured ...");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Log.info("Im on " + result.getName() + " Test .... skiped ...");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	
	
}
