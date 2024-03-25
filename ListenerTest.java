package seleniumtest;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


@Listeners(ListenerTest.class)
public class ListenerTest implements ITestListener,ISuiteListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("successfully started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The test has successfully executed: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("The test has failed: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("The test has been skipped: "+result.getName());
	}

	@Override
	public void onStart(ISuite suite) {
	
		System.out.println("suite began");
	}

	@Override
	public void onFinish(ISuite suite) {
	
		System.out.println("suite finish");
	}

}
