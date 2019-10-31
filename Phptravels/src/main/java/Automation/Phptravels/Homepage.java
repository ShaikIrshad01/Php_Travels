package Automation.Phptravels;
import org.openqa.selenium.By;
public class Homepage extends LaunchBrowser {
	public static void signup() {
		driver.findElement(By.xpath(prop.getProperty("myaccountx"))).click();
		driver.findElement(By.xpath(prop.getProperty("signupx"))).click();		
	}
	public static void login() {
		driver.findElement(By.xpath(prop.getProperty("myaccountx"))).click();
		driver.findElement(By.xpath(prop.getProperty("loginx"))).click();	
	}

	public static void hotel() {
		driver.findElement(By.xpath(prop.getProperty("hotelx"))).click();
	}
	public static void flights() {
		driver.findElement(By.xpath(prop.getProperty("flightsx"))).click();	
	}
	public static void tours() {
		driver.findElement(By.xpath(prop.getProperty("toursx"))).click();	
	}
	public static void cars() {
		driver.findElement(By.xpath(prop.getProperty("carsx"))).click();	
	}
}
	


