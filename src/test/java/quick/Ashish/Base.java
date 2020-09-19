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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	WebDriver driver;
	
	public WebDriver initialize() throws IOException {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\Ashish\\resources\\data.properties");

	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String browse = prop.getProperty("browser");
	
	if(browse.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\chrome85\\chromedriver.exe");
		
		DesiredCapabilities db = new DesiredCapabilities();
		
		db.acceptInsecureCerts();
		ChromeOptions ch = new ChromeOptions();
		
		ch.merge(db);
		
		 driver = new ChromeDriver(ch);
		 

	}
	
	return driver;


	}

}
