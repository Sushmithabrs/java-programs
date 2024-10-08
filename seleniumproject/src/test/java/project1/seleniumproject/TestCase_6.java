
package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_6  extends LanchAndQuit{
@Test
public void product() throws InterruptedException {
/*	
	Home_Page   home=new Home_Page (driver);
	home.accoundandlist(driver);
	home.signinbutton(); 
	
	
 Login_Page log=new  Login_Page(driver); 
	
	 log.login();
	 log.pw();	*/
	 
	 Search_Product  search=new Search_Product(driver);
	 Thread.sleep(1000);
	 search.searchprd();
	 
 
}
}
