package project1.seleniumproject;
//3 ensure login fails with incorrect email or password
import org.testng.annotations.Test;

public class TestCase_3 extends LanchAndQuit {
	@Test
	public void loinfail() throws InterruptedException {
		 Home_Page   home=new Home_Page (driver);
			home.accoundandlist(driver);
			home.signinbutton(); 
			Thread.sleep(1000);
			
			 Login_Fail fail=new  Login_Fail(driver);	
			 fail.loginincorrect();
	}

}
