package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileEditInformation {
	/*WebDriver driver;
	@FindBy(id = "nav-link-accountList")
	WebElement overaccoundandlist;*/
	
	@FindBy(xpath=("(//button[.='Manage Profiles'])"))
	WebElement manageprofile;
	@FindBy(linkText=("View"))
	WebElement view;
/*	public void overoveraccount() {
		Actions a1 = new Actions(driver);
		a1.moveToElement(overaccoundandlist).perform();
    	
		}*/

	public void manageprofile() {
		manageprofile.click();
	}
	public void viewprofile() {
		view.click();	
	}
	public ProfileEditInformation  (WebDriver driver) {
		PageFactory.initElements(driver,this);	
		
	}
}
