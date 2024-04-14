package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass extends Driver {
	
	@BeforeTest
	public void setup()  {
		
		try {
	
		driver= new FirefoxDriver();
			//driver= new ChromeDriver();
		// Navigate to the ISSTA Website
		driver.get("https://www.issta.co.il/");
		
		}catch(Exception exp) {
			System.out.println ("case is :"+exp.getCause());
			System.out.println ("message is :"+exp.getMessage());
			exp.printStackTrace();
			
		}
		
	}
	
	@Test
	public void simpleTest()  {
		System.out.println("ISSTA Started . . .");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
