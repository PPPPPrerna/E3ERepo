package quick.Ashish;



import org.openqa.selenium.By;
import objects.ObjecTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.*;







@Listeners(quick.Ashish.Listners.class)
public class AshTest2 extends Base {
	
	
	
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AshTest2.class.getName());
	
	private static Logger log = LogManager.getLogger(AshTest2.class.getName());
	
	@BeforeTest
	public void cool() throws IOException {
		
driver=initializeDriver();
		
		
		driver.get(prop.getProperty("url"));
		
	
		
	}
	
	
	@Test(dataProvider="getData")
	public void test(String username, String name, String text) throws IOException {
		
		//Base b = new Base();
//driver=initializeDriver();
		
		
		//driver.get(prop.getProperty("url"));

		
		
		
	ObjecTest ob= new ObjecTest(driver);
	
		//String asx = ob.getData().getText();
//ob.email().sendKeys(name);
		
		//ob.text().sendKeys(text);
		
		
	
		ob.name().sendKeys(username);
		
		
		
		log.error("cool");
		log.info("Prerna");
		log.debug("qqqqqqqqqqqqqqqqqqqqqqqqqqq");
	

				
		ob.email().sendKeys(name);
		
		ob.text().sendKeys(text);
		
		
		ob.submit().click();
		
		ob.ok().click();
		
		//driver.findElement(By.xpath("//*[text()='OK']"));
		
}
	@DataProvider
	public Object[][] getData() {
		
		Object a[][]=new Object[1][3];
		
		a[0][0]="Prerna";
		a[0][1]="prerna@metlife.com";
		a[0][2]="New framework";
		
		
		return a;
		
		
		
		
		
		
		
		
	}
	@AfterTest
	public void fgh() {
		driver.close();
	}
	
	
	
}
