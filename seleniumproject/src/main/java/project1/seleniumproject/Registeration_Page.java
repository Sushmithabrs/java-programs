package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration_Page {

	WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement name;
	@FindBy(id="ap_phone_number")
	WebElement phonenumber;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy (id="continue")
	WebElement verifyaccount;
	
	public void createaccount() {
		name.sendKeys("sushmitha");
		phonenumber.sendKeys("8088252351");
		password.sendKeys("sushmitha@123");
		verifyaccount.click();
	}
	public Registeration_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}}



