package quick.Ashish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver driver;
	
	public Properties prop;
	
	public  WebDriver initializeDriver() throws IOException {
	
	 prop=new Properties();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\Ashish\\resources\\data.properties");

	prop.load(fis);
	
	String browserName =prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//so dis will be applilied to entire test case.
	
	return driver;
}
	
	public  void getScreenShotPath(WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		//String destinationFile = System.getProperty("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\Ashish\\screenshots");
		
		FileUtils.copyFile(source,new File("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\Ashish\\screenshots\\njk.png"));
		
	}
}
