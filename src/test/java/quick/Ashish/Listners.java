package quick.Ashish;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import quick.Ashish.ExtentReporterNG;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;

public class Listners  implements ITestListener{
	
	
	com.aventstack.extentreports.ExtentReports reports=ExtentReporterNG.ext();
	
	ExtentTest test;
	
	ThreadLocal<ExtentTest> exn = new ThreadLocal<ExtentTest>();
	
	
	
	
	
	
	
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
			
		
		
		
		
			
		
		
		
		
			
		
		}
		
		
		 
		
		
	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		 test =reports.createTest(arg0.getMethod().getMethodName());
		 
		 exn.set(test);
		 
		
		
		
		
		
		
		 
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
	}

	
}
