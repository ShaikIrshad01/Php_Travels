package Automation.Phptravels;
import org.openqa.selenium.By;
public class FlightSearch extends LaunchBrowser {

	public static void search() {
		driver.findElement(By.xpath(prop.getProperty("From_locationclickx"))).click();
		 driver.findElement(By.xpath(prop.getProperty("From_locationclickx"))).sendKeys(prop.getProperty("fromtext"));
		 driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+prop.getProperty("fromtext")+"')]")).click();
			
		 driver.findElement(By.xpath(prop.getProperty("To_locationclickx"))).click();
		 driver.findElement(By.xpath(prop.getProperty("To_locationclickx"))).sendKeys(prop.getProperty("Totext"));
		 driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+prop.getProperty("Totext")+"')]")).click();
			
		driver.findElement(By.xpath(prop.getProperty("Datex"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_d"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_y"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_n"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_nx"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_mnt"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_dt"))).click();	
		
		driver.findElement(By.xpath(prop.getProperty("fadultsx"))).click();
		driver.findElement(By.xpath(prop.getProperty("fchildx"))).click();
		driver.findElement(By.xpath(prop.getProperty("finfantx"))).click();
		driver.findElement(By.xpath(prop.getProperty("fsearchx"))).click();
	
	}
	
	
}






























/*
for(int i=1; i<=35;i++){
	String str = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+i+"]")).getText();
	if(str.equals("1")) {
		for(int j=i; j<=35;j++) {
			str = driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).getText();
			if(str.equals(prop.getProperty("Ddate"))) {
				driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[2]//div["+j+"]")).click();
				break;
			}
		}
	}
}*/
