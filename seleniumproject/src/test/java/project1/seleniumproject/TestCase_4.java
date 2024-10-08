package project1.seleniumproject;

import org.testng.annotations.Test;

public class TestCase_4 extends LanchAndQuit {
	@Test
	public void editprofile() throws InterruptedException {
		Home_Page home = new Home_Page(driver);
		home.accoundandlist(driver);
		home.signinbutton();

		Login_Page log = new Login_Page(driver);

		log.login();
		log.pw();
		Thread.sleep(1000);
		Home_Page home1 = new Home_Page(driver);
		home1.accoundandlist(driver);
		
		ProfileEditInformation  profile = new  ProfileEditInformation(driver);
		
	//profile.overoveraccount();
		
		profile. manageprofile();
		Thread.sleep(1000);
		
		profile.viewprofile();
		
		
     EditAddresPage edit=new  EditAddresPage (driver);
	     edit. clickagegroup();
	  	 edit.age();
		 edit.selectage();
		 edit.save();
		
		
		
	}
}