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

public class Listners extends Base implements ITestListener{
	
	WebDriver driver=null;

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
		
		
		
		//WebDriver driver=null;
		//String testMethodName =result.getMethod().getMethodName();
		
		//ITestContext context = result.getTestContext();
		//this.driver=(())result.getInstance().driver;
		
		this.driver=(WebDriver)result.getTestContext().getAttribute("WebDriver");
		
			
			try {
				getScreenShotPath(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Wrong");
				System.out.println("Wrong");
			}
			
		
		
		
		
			
		
		}
		
		
		 
		
		
	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
