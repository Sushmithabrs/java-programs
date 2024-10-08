package project1.seleniumproject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchWithFilters {
	WebDriver driver;
	@FindBy(linkText = "Men's Running Shoes")
	WebElement catogery;
	@FindBy(xpath = ("(//i[@class='a-icon a-icon-checkbox'])[4]"))
	WebElement Brands;
	@FindBy(xpath = ("(//i[@class='a-icon a-icon-dropdown'])"))
	WebElement priceRange;
	//@FindBy(linkText="Price: Low to High")
//	@FindBy(xpath = ("(//span[@class='a-button-text a-declarative'])"))
	//WebElement lowtohigh;
	@FindBy(xpath=("(//span[.='50% Off or more'])"))
	WebElement discount;

	public void catogery() {
		catogery.click();
	}

	public void brands() {
		Brands.click();
		Assert.assertTrue(Brands.isDisplayed(), "Brand checkbox is not selected");

	}
	public void discounts() {
		discount.click();
	}

	/*public void selectPriceRange() throws InterruptedException {
	Select s1=new Select(priceRange);
		 s1.selectByVisibleText("Price: Low to High"); 
		 priceRange.click();

		lowtohigh.sendKeys(Keys.ENTER);
		 Assert.assertTrue(lowtohigh.isDisplayed(), "Low to High sorting option is not applied/displayed properly");
    }*/

	

	public SearchWithFilters(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
