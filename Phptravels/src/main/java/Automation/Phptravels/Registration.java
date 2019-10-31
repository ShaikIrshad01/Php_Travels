package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Registration extends LaunchBrowser{
	
	
	public static void Rsubmit() throws InterruptedException{
		
		
		driver.findElement(By.xpath(prop.getProperty("rfirstnamex"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastnamex"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("mobilex"))).sendKeys(prop.getProperty("mobile"));
		driver.findElement(By.xpath(prop.getProperty("emailx"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("passwordx"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("confirmpasswordx"))).sendKeys(prop.getProperty("confirmpassword"));
		//Thread.sleep(1000);
		//driver.findElement(By.xpath(prop.getProperty("cookie"))).click();
		driver.findElement(By.xpath(prop.getProperty("submitx"))).click();	
	}
	
	}
	

