package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class Login_Page {
	
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(id="continue")
	WebElement  Continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	public void login()
	{
		username.sendKeys("ssushmitha045@gmail.com");
		Continue_button.click();
	}
	public void pw() {
		
		password.sendKeys("9611993256");
		signin_button.click();
		// Assert.assertEquals(driver.getTitle(), "Authenticationrequired");
	}
	public  Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}



