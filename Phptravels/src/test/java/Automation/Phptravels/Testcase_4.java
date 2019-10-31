package Automation.Phptravels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase_4 extends Homepage {
	static Logger log=Logger.getLogger("Testcase_4");
	@BeforeTest
	public static void Launch() throws Exception {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\FirstProject\\Phptravels\\src\\main\\java\\Files\\log4j.properties");
		LaunchBrowser.Launch();
	} 
	@Test
	public static void flight() throws Exception{
		
		Homepage.flights();
		FlightSearch.search();
	}	

	@AfterTest
	public static void  gettxt() {
		String str=driver.findElement(By.xpath(prop.getProperty("fresult_x"))).getText();
		Assert.assertEquals(str, prop.getProperty("flight_result"));
		if(str.contains(prop.getProperty("flight_result"))) {
			log.info("pass");
		}
		else {
			log.info("fail");
		}
		driver.close();
		}

}

		