package project1.seleniumproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_5 extends LanchAndQuit  {
	@Test
	public void searchproductamazon() throws InterruptedException {
		
		Home_Page   home=new Home_Page (driver);
		home.accoundandlist(driver);
		home.signinbutton(); 
		
		
	 Login_Page log=new  Login_Page(driver); 
		
		 log.login();
		 log.pw();	
		 
		 Search_Product  search=new Search_Product(driver);
		 Thread.sleep(1000);
		 search.searchprd();
		 
		 SearchWithFilters  filters=new SearchWithFilters (driver);
		 filters.catogery();
		 filters.brands();
		 filters.discounts();
		// filters.selectPriceRange();
		
	}

}
