package Tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.SearchResultsPage;
import Pages.FlightDetailsPage;

public class IsstaFlightScenario2 extends BaseClass {
	
	
	//its the same of scenario 1 but without Validation, its just to show that
	//we can create multiple scenarios.
	
	@Test (priority = 1)
	public void SearchFlightTest1(){
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		HomePage homePage = new HomePage(this.driver);
		boolean k =homePage.SearchAFlight("ניו יורק");
		//Assert
		assertEquals(k, true);
		
	}
	
	
	
	
	
	@Test (priority = 2)
	public void SelectTheFirstFlight(){
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SearchResultsPage searchResult = new SearchResultsPage(this.driver);
		boolean k =searchResult.SelectFlight();
		//Assert
		assertEquals(k, true);
		
	}
	
	
	
	@Test (priority = 3)
	public void clickCheckout(){
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		FlightDetailsPage searchResult = new FlightDetailsPage (this.driver);
		boolean k =searchResult.ClickCheckout();
		//Assert
		assertEquals(k, true);
		
	}
}
