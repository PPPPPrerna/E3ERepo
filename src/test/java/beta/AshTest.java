package beta;



import org.openqa.selenium.By;
import objects.ObjecTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




import org.apache.logging.log4j.*;





public class AshTest {
	
	
	
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AshTest.class.getName());
	
	private static Logger log = LogManager.getLogger(AshTest.class.getName());
	
	
	
	
	@Test
	public void test() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		ObjecTest ob= new ObjecTest(driver);
		ob.name().sendKeys("Final");
	
	
		
		log.error("cool");
		
		log.info("Yes");
		log.debug("Prerna");
ob.email().sendKeys("xyz@xyx.com");
		
		ob.text().sendKeys("Yeah");
		
		
		ob.submit().click();
		
		ob.ok().click();
		
		
			}
}
