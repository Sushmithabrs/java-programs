package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Fail {
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(id="continue")
	WebElement  Continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	public void loginincorrect()
	{
		username.sendKeys("sushmitha@gmail.com");
		Continue_button.click();
	}
	public void pwincorrect() {
		
		password.sendKeys("9611993652");
		signin_button.click();
	}
	public  Login_Fail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}


