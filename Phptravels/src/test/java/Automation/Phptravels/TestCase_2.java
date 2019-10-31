package Automation.Phptravels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_2 extends LaunchBrowser{
	static Logger log=Logger.getLogger("Testcase_2");
	@BeforeTest
	public static void Launch() throws Exception {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\FirstProject\\Phptravels\\src\\main\\java\\Files\\log4j.properties");
		LaunchBrowser.Launch();
	}
	//Hotel search
	@Test
	public static void hotelSearch() throws Exception {
					
		Homepage.hotel();
		Hotel_Search.hotelSearchButton();
	}
	@AfterTest
	public static void  gettxt() {
		String str=driver.findElement(By.xpath(prop.getProperty("hresult_x"))).getText();
		Assert.assertEquals(str, prop.getProperty("hotel_result"));
		if(str.contains(prop.getProperty("hotel_result"))) {
			log.info("pass");
		}
		else {
			log.info("fail");
		}
	driver.close();
	}
	
}
	