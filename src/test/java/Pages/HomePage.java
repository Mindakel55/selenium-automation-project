package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class HomePage{

PageObjects homePage;
public  WebDriver driver3;

    public HomePage(WebDriver driver2) {


        super();

        homePage = new PageObjects();
        driver3=driver2;
        PageFactory.initElements(driver3, homePage);

    					}


 public boolean validateFlightSearchElements(){

        boolean elements = false;
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("wowo");
        // Click the flights button
        homePage.flightsButton.click();
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if(homePage.flightSearchInput.isDisplayed()){  //Destiny text box

            if(homePage.flightsButton.isDisplayed()){	//Flights section button


                    if(homePage.searchButton.isDisplayed()){		//מצאו לי טיסות זולות

                                          elements = true;


                    } 


            }

        }


        else{

        	elements = false;

        }
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        	return elements;


 }


 public boolean SearchAFlight(String destiny) {


        boolean searchStatus = false;
        
        System.out.println("Searching a Flight ...");
        
     // Click the flights button
        homePage.flightsButton.click();
         
        
     // Enter the departure city
        homePage.flightSearchInput.sendKeys(destiny);
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        homePage.disticon.click();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
   
        
        homePage.refreshcalendar.click();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     // Select start date as 30 from the Current month
        homePage.startdate.click();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     // Select end date as 30 from the next month
        homePage.enddate.click();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     // Click the search button
        homePage.searchButton.click();
        
        
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (homePage.searchResults.isDisplayed()) {

        	searchStatus = true;

        }

        return searchStatus;

}


    class PageObjects {


        @CacheLookup
        @FindBy(xpath="(//se-flights-autocomplete/input)[2]")
        public WebElement flightSearchInput ;


        @CacheLookup
        @FindBy(xpath="(//se-flights-autocomplete/input)[1]")
        public WebElement destinationInput;


        @CacheLookup
        @FindBy(xpath="//div[1]/div[2]/div[3]/div/form-button/button[text()='מצאו לי טיסות זולות']")
        public WebElement searchButton;
        
        @CacheLookup
        @FindBy(id="start_date")
        public WebElement startandenddate;
        
        @CacheLookup
        @FindBy(id="number_of_results")
        public WebElement searchResults;
        
        @CacheLookup
        @FindBy(xpath="//*[@id=\"nav-tabs\"]/li[2]/a")
        public WebElement flightsButton;
        
        @CacheLookup
        @FindBy(xpath="(//table//span[text()='30'])[1]")
        public WebElement startdate;
        
        @CacheLookup
        @FindBy(xpath="(//table//span[text()='30'])[3]")
        public WebElement enddate;
        
        
        @CacheLookup
        @FindBy(xpath="//*[@id=\"datepicker_widget\"]/div/div[2]/table[1]/thead/tr[1]/th[2]")
        public WebElement refreshcalendar;
        
        @CacheLookup
        @FindBy(xpath="//*[@id=\"wrapper\"]/div/main/div/div/div")
        public WebElement refreshelement;
      
        @CacheLookup
        @FindBy(xpath="(//div[contains(text(),'ניו יורק')])[3]")
        public WebElement newyork;
        
        @CacheLookup
        @FindBy(xpath="(//div[1]/div[1]/div[2]/div/div[1]/i)[1]")
        public WebElement disticon;
        
        		
        		


    }

}

