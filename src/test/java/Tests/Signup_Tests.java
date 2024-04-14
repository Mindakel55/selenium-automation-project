package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;

public class Signup_Tests extends BaseClass {
	
	@Test
	public void GoodEmailSignUp(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String rand = RandomStringUtils.randomAlphabetic(4);
		System.out.println(rand);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.maytronics.app:id/btn_progress\" and @text=\"Sign up with your email\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Fname="FirstNameTest"+rand;
		driver.findElement(By.id("com.maytronics.app:id/et_first_name")).sendKeys(Fname);
		driver.findElement(By.id("com.maytronics.app:id/et_last_name")).sendKeys("Akeltest"+rand);
		driver.findElement(By.id("com.maytronics.app:id/et_email")).sendKeys("Akeltest"+rand+"@mydolphinet.com");
		driver.findElement(By.id("com.maytronics.app:id/et_password")).sendKeys("Aa12345678@");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.findElement(By.id("com.maytronics.app:id/et_first_name")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.maytronics.app:id/et_last_name")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.maytronics.app:id/et_email")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.maytronics.app:id/et_password")).click();
		driver.navigate().back();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("com.maytronics.app:id/btn_progress")).click();
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String ele2= driver.findElement(By.id("com.maytronics.app:id/tv_welcome_connect_title")).getText();
		assertEquals(ele2, "Welcome "+Fname+"!");
		System.out.println("SignUp Completed ...");
	}
	
	
	@Test
	public void BadEmailSignUp(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String rand = RandomStringUtils.randomAlphabetic(4);
		
		System.out.println(rand);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.maytronics.app:id/btn_progress\" and @text=\"Sign up with your email\"]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("com.maytronics.app:id/et_first_name")).sendKeys("FirstNameTest54"+rand);
		driver.findElement(By.id("com.maytronics.app:id/et_last_name")).sendKeys("Akeltest432"+rand);
		driver.findElement(By.id("com.maytronics.app:id/et_email")).sendKeys("Akeltest"+rand+"@mydolphinet.com");
		driver.findElement(By.id("com.maytronics.app:id/et_password")).sendKeys("Aa12345678@");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.findElement(By.id("com.maytronics.app:id/et_first_name")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.maytronics.app:id/et_last_name")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.maytronics.app:id/et_email")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.maytronics.app:id/et_password")).click();
		driver.navigate().back();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		String ele= driver.findElement(By.id("com.maytronics.app:id/textinput_error")).getText();
		System.out.println(ele);
		assertEquals(ele, "The First name must contain only letters and \"-\"");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Bad SignUp Test Completed ...");
	}
	
}
