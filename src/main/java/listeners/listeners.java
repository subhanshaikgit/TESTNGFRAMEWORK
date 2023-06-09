package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.base;
import utils.extentreport;

public class listeners extends base implements ITestListener {
	
	
	
	 WebDriver driver;
	 ExtentReports extentReport = extentreport.getExtentReport();
		ExtentTest extentTest;
		ThreadLocal<ExtentTest> extenttestThread = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		String testname = result.getName(); 
		extentTest = extentReport.createTest(testname); 
		extenttestThread.set(extentTest); 
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname = result.getName(); 
		// extentTest.log(Status.PASS,testname+"got Passed"); 
		extenttestThread.get().log(Status.PASS, testname + "got Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testmethodname = result.getName();
		// extentTest.fail(result.getThrowable());
		extenttestThread.get().fail(result.getThrowable());

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String screenshotfilepath = takescreenshot(testmethodname, driver);
			extenttestThread.get().addScreenCaptureFromPath(screenshotfilepath, testmethodname);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
	
	}
	
	
	

}
