package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjecTest {
	
	WebDriver driver = null;
	
	public ObjecTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	private By nam=By.xpath("//input[@name='name']");
	
	private By enam=By.xpath("//input[@name='email']");
	
	private By mes=By.xpath("//textarea[@type='text']");
	
	private By submit = By.xpath("//input[@type='submit']");
	
	private By okay = By.xpath("//button[text()='OK']");

	//public ObjecTest(WebDriver driver){
		
		//
		
	//}
	
	
	

	public WebElement name() {
		
		return driver.findElement(nam);
		
	}
	
	public WebElement email() {
		
		return driver.findElement(enam);
	}
	
	public WebElement message() {
		return driver.findElement(mes);
		
		
		
	}
	
	public WebElement submit() {
		
		return driver.findElement(submit);
	}
	
	public WebElement ok() {
		
		return driver.findElement(okay);
	}

	public void screenshot() throws IOException {
		
		String path = System.getProperty("user.dir")+"\\screenshots +\\ss.png" ;
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(path));
	}
}
