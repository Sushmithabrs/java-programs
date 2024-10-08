package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddandRemoveIteamfromCart {
	
	@FindBy(xpath=("(//input[@id='add-to-cart-button'])"))
    WebElement addToCartButton;//add-to-cart-button
    
    // Proceed to Cart button
   
    @FindBy(id = "nav-cart")
    WebElement cartButton;
    
    
    @FindBy(id = "nav-cart-count")
    WebElement cartCount;
 

    // Method to add product to the cart
    public void addItemToCart() {
        addToCartButton.click();
    }

    // Method to navigate to the cart
    public void goToCart() {
        cartButton.click();
    }

    // Verify if the product is added to the cart
    public void verifyItemAddedToCart() {
    	
        Assert.assertTrue(cartCount.isDisplayed(), "Cart count is not displayed");
        Assert.assertNotEquals(cartCount.getText(), "0", "Cart is empty!");
    }
    public AddandRemoveIteamfromCart (WebDriver driver) {
    	PageFactory.initElements( driver,this);
}
}

