package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RemoveFromCart {
	
	    WebDriver driver;
	    
	  
	    @FindBy(xpath = "//input[@value='Delete']")
	    WebElement removeButton;
	    
	  
	    @FindBy(xpath = "//div[contains(text(),'Your Amazon Cart is empty')]")
	    WebElement emptyCartMessage;

	  public void removeItemFromCart() {
	        removeButton.click();
	    }

	  
	    public void verifyCartIsEmpty() {
	        Assert.assertTrue(emptyCartMessage.isDisplayed(), "Cart is not empty!");
	    }
	    public RemoveFromCart (WebDriver driver) {
	       
	        PageFactory.initElements(driver, this);
	}

}
