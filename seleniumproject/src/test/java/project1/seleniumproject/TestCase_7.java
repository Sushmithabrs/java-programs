package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_7 extends LanchAndQuit {
	@Test
	public void productdetail() throws InterruptedException {
		 Search_Product  search=new Search_Product(driver);
		 Thread.sleep(1000);
		 search.searchprd();
		 
		 Productdetail_page product=new Productdetail_page(driver);
		 product.search();
		 product.selectReviews();
		product. displayPrice();
		product.displayDescription();
		
	}
	
	
	
	 


}
