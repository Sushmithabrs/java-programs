package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;

	@FindBy(id = "nav-link-accountList")
	WebElement accoundandlist;
	@FindBy(linkText = "Start here.")
	WebElement newcustomer;
	@FindBy(linkText = "Sign in")
	WebElement signin;

	public void accoundandlist(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(accoundandlist).perform();
    
	}

	public void newcustomer() {
		newcustomer.click();

	}
	public void signinbutton() {
		signin.click();
	}

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
