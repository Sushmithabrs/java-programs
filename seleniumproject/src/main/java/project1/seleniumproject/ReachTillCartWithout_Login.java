package project1.seleniumproject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReachTillCartWithout_Login {
	WebDriver driver;
	@FindBy(xpath=("(//div[@class='a-section aok-relative s-image-tall-aspect'][1])"))
	WebElement clickshoe;
	//@FindBy(name="submit.add-to-cart")
	@FindBy(xpath=("(//span[@class='a-button a-spacing-small a-button-primary a-button-icon natc-enabled'])"))
    WebElement addToCartButton;
	
    @FindBy(linkText=" Go to Cart")
    WebElement gotocart;
    
    public void enterswhoes() throws InterruptedException {
    	clickshoe.click();
    	Thread.sleep(1000);
    	addToCartButton.click();
    }

//public void addtocart() {
	//addToCartButton.click();
	


public void gotocart() {
	gotocart.click();	
}

public ReachTillCartWithout_Login(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}

}
