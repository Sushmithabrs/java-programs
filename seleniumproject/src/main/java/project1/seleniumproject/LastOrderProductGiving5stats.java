package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LastOrderProductGiving5stats {
	WebDriver driver;
	//@FindBy(xpath=("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'][2])"))
	@FindBy(id="nav-orders")
	WebElement orederbutton;
	//@FindBy(xpath=("(//span[@class='a-button-text a-declarative'])"))
	@FindBy(id="a-autoid-1-announce")
	WebElement past3munthsbutton;
   // @FindBy(xpath=("(//a[@class='a-dropdown-link'][3])"))
	@FindBy(id="time-filter_3")
    WebElement selectyear;
    @FindBy(linkText="Write a product review")
    WebElement writeaproductreview;
    @FindBy(xpath=("(//button[@class='ryp__star__button'][5])"))
    WebElement star;
    
     	public void orderbutton() {
		orederbutton.click();
		
	}
	public void lastorder() throws InterruptedException {
		past3munthsbutton.click();
		Thread.sleep(1000);
	}
	public void year() throws InterruptedException {
		selectyear.click()	;
		 Thread.sleep(1000);
		 
		// Assert.assertTrue(selectyear.isDisplayed()); 
		
	}
	public void productreview() throws InterruptedException {
		writeaproductreview.click();
		 Thread.sleep(2000);
		//  Assert.assertTrue(writeaproductreview.isDisplayed());
		  Thread.sleep(1000);
	}
	public void selectstar() throws InterruptedException {
		star.click();
		 Thread.sleep(2000);
		// Assert.assertTrue(star.isSelected());
	}
	public LastOrderProductGiving5stats(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

}
