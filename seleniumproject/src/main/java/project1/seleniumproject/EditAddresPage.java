package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddresPage {

	WebDriver driver;
	@FindBy(xpath = ("(//div[.='Age group'])"))
	WebElement aggegroup;
	@FindBy(xpath=("(//button[.='Add'])"))
	WebElement editage;
	@FindBy(xpath=("(//button[.='25-29'])"))
	WebElement  ageselect;
	@FindBy(xpath=("(//span[@class='a-button a-button-normal a-button-primary button'])"))
	WebElement savebutton;
	
	public void clickagegroup() {
		aggegroup.click();
	}
	public void age() {
		editage.click();
	}
	public void selectage() {
		ageselect.click();
	}
	public void save() {
		savebutton.click();
		
	}

	public EditAddresPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
