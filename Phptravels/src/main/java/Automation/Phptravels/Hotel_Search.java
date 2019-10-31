package Automation.Phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Hotel_Search extends LaunchBrowser {

	public static void hotelSearchButton() throws Exception{
		driver.findElement(By.xpath(prop.getProperty("city_clickx"))).click();
		driver.findElement(By.xpath(prop.getProperty("city_Textx"))).sendKeys(prop.getProperty("location"));
		driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+prop.getProperty("location")+"')]")).click();
		driver.findElement(By.xpath(prop.getProperty("check_inx"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_yearx"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_monthx"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("click_dayx"))).click();
		driver.findElement(By.xpath(prop.getProperty("check_outx"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("click_yearo"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_montho"))).click();
		driver.findElement(By.xpath(prop.getProperty("click_dayo"))).click();
		driver.findElement(By.xpath(prop.getProperty("childx"))).click();
		 driver.findElement(By.xpath(prop.getProperty("searchx"))).click();
	}
}






















/*//checkinfor(int i=1; i<=35;i++){
String str = driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'"+i+"')]")).getText();
if(str.equals("1")) {
	for(int j=i; j<=35;j++) {
		str = driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'"+j+"')]")).getText();
		if(str.equals(prop.getProperty("Ddate"))) {
			driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-day'][contains(text(),'"+j+"')]")).click();
			break;
		}
	}
}
}

//*/
/*//checkoutfor(int i=1; i<=35;i++){
String str = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div["+i+"]")).getText();
if(str.equals("1")) {
	for(int j=i; j<=35;j++) {
		str = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div["+j+"]")).getText();
		if(str.equals(prop.getProperty("DDdate"))) {
			driver.findElement(By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div["+j+"]")).click();
			break;
		}
	}
}
}

//*/
