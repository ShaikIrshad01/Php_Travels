package Automation.Phptravels;
import org.openqa.selenium.By;
public class Toursearch extends LaunchBrowser{	
	public static void Tsearch() {
		driver.findElement(By.xpath(prop.getProperty("Dclickx"))).click();
		String city= prop.getProperty("DText");
		driver.findElement(By.xpath("//div[@class='select2-result-label'][contains(text(),'"+city+"')]")).click();
		driver.findElement(By.xpath(prop.getProperty("tour_typex"))).click();
		driver.findElement(By.xpath(prop.getProperty("S_tourtype"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("tdatex"))).click();
		driver.findElement(By.xpath(prop.getProperty("t_yr"))).click();
		driver.findElement(By.xpath(prop.getProperty("t_mt"))).click();
		driver.findElement(By.xpath(prop.getProperty("t_dateclick"))).click();
		
		 driver.findElement(By.xpath(prop.getProperty("tguestsx"))).click();
		 driver.findElement(By.xpath(prop.getProperty("tsearchx"))).click();
	}
}














/*for(int i=1; i<=35;i++){
String str = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[6]//div[1]//div[1]//div[2]//div["+i+"]")).getText();
if(str.equals("1")) {
	for(int j=i; j<=35;j++) {
		str = driver.findElement(By.xpath("//div[@id='datepickers-container']//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).getText();
		if(str.equals(prop.getProperty("tour_date"))) {
			driver.findElement(By.xpath("//div[@id='datepickers-container']//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).click();
			break;
		}
	}
}
}*/