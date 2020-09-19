package quick.Ashish;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports ext() {
		
		
		String path = System.getProperty("user.dir")+"\\report\\screen.png";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
	
		
		reporter.config().setDocumentTitle("Doc");
		reporter.config().setReportName("Prerna");
		
		ExtentReports reports = new ExtentReports();
		
		reports.attachReporter(reporter);
		
		return reports;
		
		
		
		
		
	}
}
