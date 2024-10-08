package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Applaying_Couponcode {
	WebDriver driver;
	@FindBy(id="submit.buy-now")
	WebElement buy;
	
	
	
	
	public void buybutton() {
		buy.click();
	}
	
	public Applaying_Couponcode(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

}
