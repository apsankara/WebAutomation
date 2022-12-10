package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestLisenerExample implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Start");
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Start");
	}


	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test FailedWithTimeout");
	}


	public void onStart(ITestContext context) {
		System.out.println("Test BeforeStart");

	}


	public void onFinish(ITestContext context) {
		System.out.println("Test AfterFinish");

	}

}
