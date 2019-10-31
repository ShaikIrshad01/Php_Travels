package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Loginpage extends LaunchBrowser {
public static  void Lsubmit() throws InterruptedException {
	driver.findElement(By.xpath(prop.getProperty("emailx1"))).sendKeys(prop.getProperty("email1"));
	Thread.sleep(500);
	driver.findElement(By.xpath(prop.getProperty("passwordx1"))).sendKeys(prop.getProperty("password"));
	Thread.sleep(500);
		driver.findElement(By.xpath(prop.getProperty("lsubmit"))).click();
	}

}

