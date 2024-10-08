package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_1 extends LanchAndQuit {
	@Test
	public void newuser() {
		Home_Page   home=new Home_Page (driver);
		home.accoundandlist(driver);
		home.newcustomer();
		
		 Registeration_Page  regester =new  Registeration_Page(driver);
		regester.createaccount();
		
		
		
		}
	}
		
