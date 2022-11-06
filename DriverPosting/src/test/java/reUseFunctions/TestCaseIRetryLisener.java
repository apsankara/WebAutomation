package reUseFunctions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestCaseIRetryLisener implements IRetryAnalyzer {

	
	int failedcount=0;
	int limit=1;
	@Override
	public boolean retry(ITestResult result) {
		if(failedcount<limit) {
			failedcount++;
			return true;
		}
		return false;
	}
	

}
