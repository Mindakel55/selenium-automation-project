package Pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlightDetailsPage  extends  HomePage{

PageObjects details;
public FlightDetailsPage(WebDriver driver2) {
		super(driver2);
		
		details = new PageObjects();
		PageFactory.initElements(driver2, details);
		// TODO Auto-generated constructor stub
	}



 public boolean validateCheckoutButton(){

        boolean elements = false;
        
        try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        //driver3.findElement(By.xpath("//a[contains(text(),'חדרים')]")).click();
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        List<WebElement> k= driver3.findElements(By.className("green-button"));
        
        if(k.get(0).isDisplayed()){  
               elements = true;}
               

        return elements;


    }


 public boolean ClickCheckout() {


        boolean selectStatus = false;
       
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Start");
        
        //driver3.findElement(By.xpath("//a[contains(text(),'חדרים')]")).click();
        System.out.println("End11");
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        List<WebElement> k= driver3.findElements(By.className("green-button"));
        
        //k.get(0).click();
        
        WebDriverWait wait = new WebDriverWait(driver3, Duration.ofSeconds(30));
        		JavascriptExecutor js = ((JavascriptExecutor) driver3);

        		
        		
        		js.executeScript("arguments[0].scrollIntoView(true);", k.get(0));

        		//clickable
        		wait.until(ExpectedConditions.elementToBeClickable(k.get(0)));
        		k.get(0).click();
        
        //details.CheckoutButton.click();
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        selectStatus = true;

        return selectStatus;

}


    class PageObjects {


        @CacheLookup
        @FindBy(className="green-button")
        public WebElement CheckoutButton ;
        		
        		


    }

}

