package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_10 extends LanchAndQuit{
	 @Test(priority = 1)
	    public void testAddItemToCart() throws InterruptedException {
		
				
				Home_Page   home=new Home_Page (driver);
				home.accoundandlist(driver);
				home.signinbutton(); 
				
				
			 Login_Page log=new  Login_Page(driver); 
				
				 log.login();
				 log.pw();	
				 
		 Search_Product  search=new Search_Product(driver);
		 Thread.sleep(1000);
		 search.searchprd();
		 
	       
		 AddandRemoveIteamfromCart add=new  AddandRemoveIteamfromCart(driver);
		 add .addItemToCart();
	        
	      
		 add.verifyItemAddedToCart();
	    }
	 @Test(priority = 2)
	    public void testRemoveItemFromCart() {
		// RemoveFromCart  remove=new RemoveFromCart(driver); 
		// add .goToCart();
		 RemoveFromCart  remove=new RemoveFromCart(driver); 
	        
	        
		 remove .removeItemFromCart();
	        
	   
		 remove .verifyCartIsEmpty();
	    }

}
