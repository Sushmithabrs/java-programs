package project1.seleniumproject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase_2 extends LanchAndQuit {
	@Test
	public void LoginAmz() {
		Home_Page   home=new Home_Page (driver);
		home.accoundandlist(driver);
		home.signinbutton(); 
		
		
	 Login_Page log=new  Login_Page(driver); 
		
		 log.login();
		 log.pw();
		 System.out.println(driver.getTitle());
		
	}


}