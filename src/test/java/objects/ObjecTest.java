package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjecTest {

	WebDriver driver;
	
	public ObjecTest(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	
	public WebElement name() {
		WebElement elm=driver.findElement(By.xpath("//input[@name='name']"));
		
		
		return elm;
	}
	
	public WebElement email() {
		WebElement as = driver.findElement(By.xpath("//input[@type='email']"));	
		
		return as;
	}
	
	public WebElement text() {
		WebElement zx =driver.findElement(By.xpath("//textarea[@type='text']"));
		
		return zx;
	}
	
	public WebElement submit() {
		WebElement xc=driver.findElement(By.xpath("//input[@type='submit']"));
		
		return xc;
	}
	
	public WebElement ok() {
		
		WebElement nm=driver.findElement(By.xpath("//*[text()='OK']"));
		
		return nm;
	}
	
	public WebElement getData() {
		WebElement web=driver.findElement(By.xpath("//p[@class='brand']/strong"));
		
		return web;
	}
	
}
