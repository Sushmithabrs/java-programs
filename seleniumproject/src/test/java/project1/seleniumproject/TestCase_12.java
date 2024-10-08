package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_12 extends LanchAndQuit{
	@Test
	public void applyCoupn() throws InterruptedException {
	
			Home_Page   home=new Home_Page (driver);
			home.accoundandlist(driver);
			home.signinbutton(); 
			
			
		 Login_Page log=new  Login_Page(driver); 
			
			 log.login();
			 log.pw();
			 Thread.sleep(1000);
			// System.out.println(driver.getTitle());
			 
			 Search_Product  search=new Search_Product(driver);
			 Thread.sleep(1000);
			 search.searchprd();
			 
			 Productdetail_page product=new Productdetail_page(driver);
			 product.search();
			 
			 Applaying_Couponcode coupn=new Applaying_Couponcode(driver);
			 Thread.sleep(1000);
			 coupn.buybutton();
	}

}
