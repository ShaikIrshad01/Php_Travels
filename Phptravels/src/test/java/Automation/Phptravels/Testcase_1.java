package Automation.Phptravels;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase_1 extends LaunchBrowser {
	static Logger log=Logger.getLogger("Testcase_1");
	@BeforeTest
	public static void Launch() throws Exception {
		PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\FirstProject\\Phptravels\\src\\main\\java\\Files\\log4j.properties");
		LaunchBrowser.Launch();
	}
	@Test
	public static void userRegistration() throws Exception  {
		Homepage.signup();
		Registration.Rsubmit();		
	}
	@AfterTest
	public static void  gettxt() {
		String str=driver.findElement(By.xpath(prop.getProperty("welcome_x"))).getText();
		System.out.println("Welcome_message="+str);
		log.info("Welcome_message="+str);
		
		Assert.assertEquals(str, prop.getProperty("Welcome_msg"));
		if(str.contains(prop.getProperty("Welcome_msg"))) {
			log.info("pass");
		}
		else {
			log.info("fail");
		}
		driver.close();
		}
	}
