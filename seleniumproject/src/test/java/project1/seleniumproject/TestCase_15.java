package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_15 extends LanchAndQuit {
	@Test
	public void withoutlogin() throws InterruptedException {
		 Search_Product  search=new Search_Product(driver);
		 Thread.sleep(1000);
		 search.searchprd();
		 ReachTillCartWithout_Login cart= new ReachTillCartWithout_Login(driver);
		 cart.enterswhoes();
		
		 cart.gotocart();
	}

}
