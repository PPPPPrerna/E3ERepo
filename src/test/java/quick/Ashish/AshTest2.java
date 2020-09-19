package quick.Ashish;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.IOException;
import objects.ObjecTest;


import org.apache.logging.log4j.*;







public class AshTest2 extends Base {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void initialization() throws IOException {
		
		this.driver=initialize();
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		
	}
	
	@Test(dataProvider="data")
	
	public void starts(String name , String email, String message) throws IOException {
		
		
		
		
		ObjecTest ob = new ObjecTest(driver);
		
		ob.name().sendKeys(name);
		ob.email().sendKeys(email);
		ob.message().sendKeys(message);
		ob.submit().click();
		ob.ok().click();
		ob.screenshot();
		
	}
	
	@DataProvider
	public Object[][] data() {
		
		return new Object[][] {
			
			{"test" , "test@test.com" , "test"}
		};
	}
	
	
	
}
	
	

	

