package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchResultsPage  extends  HomePage{

PageObjects searchResults;
public SearchResultsPage(WebDriver driver2) {
		super(driver2);
		
		searchResults = new PageObjects();
		PageFactory.initElements(driver2, searchResults);
		// TODO Auto-generated constructor stub
	}



 public boolean validateSearchResultPageElements(){

        boolean elements = false;
        
        try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
       
       
        List<WebElement> k= driver3.findElements(By.className("btn-details"));
        if(k.get(0).isDisplayed()){  
               elements = true;}
               

        return elements;


    }


 public boolean SelectFlight() {


        boolean selectStatus = false;
       
        
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Start");
        
        List<WebElement> k= driver3.findElements(By.className("btn-details"));
        k.get(0).click();
       
     
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
        @FindBy(xpath="(//a[contains(text(),'פרטי טיסה')])[1]/parent::div")
        public WebElement thefirstflightlink ;
        
        @CacheLookup
        @FindBy(xpath="//*[@id='_ZAbanner_CLOSE_BUTTON']/svg")
        public WebElement closebutton ;
        
        @CacheLookup
        @FindBy(css="#all-flights-tab > section > div.list-items > div:nth-child(1) > div > section.price-block")
        public WebElement thefirstflightlink2 ;
        
        @CacheLookup
        @FindBy(xpath="//*[@id='all-flights-tab']/section/div[3]/div[1]")
        public WebElement thefirstflightlinkdiv ;
        
        @CacheLookup
        @FindBy(xpath="((//*[@id='resultsList']/div/div/div/div)[1]/section/div)[3]")
        public WebElement allflightitems ;
        
        @CacheLookup
        @FindBy(xpath="//div/main/div[2]/div/ul/li[1]/div/div[1]/h3")
        public WebElement GoFlightDetail ;
        
        @CacheLookup
        @FindBy(xpath="//div/main/div[2]/div/ul/li[2]/div/div[1]/h3")
        public WebElement ReternFlightDetail ;
        
        @CacheLookup
        @FindBy(id="number_of_results")
        public WebElement numberofresults;
        
        		
        		


    }

}

