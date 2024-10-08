package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_14 extends LanchAndQuit{
	@Test
	public void orderPage() throws InterruptedException {
		Home_Page   home=new Home_Page (driver);
		home.accoundandlist(driver);
		home.signinbutton(); 
		
		
	 Login_Page log=new  Login_Page(driver); 
		
		 log.login();
		 log.pw();	
		 LastOrderProductGiving5stats order=new LastOrderProductGiving5stats(driver);
		 order.orderbutton() ;
		 order.lastorder() ;
		 order.year();
		order. productreview();
		order. selectstar();
	}
	

}
