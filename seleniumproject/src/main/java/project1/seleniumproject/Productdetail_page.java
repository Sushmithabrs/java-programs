package project1.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Productdetail_page {
	WebDriver driver;
	@FindBy(xpath=("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"))
	WebElement searchshoe;
	@FindBy(id="acrCustomerReviewText")
	WebElement reviews;
	//@FindBy(xpath = ("(//span[@class='a-icon a-icon-popover'])"))
	//WebElement reviews;
	@FindBy(xpath = ("(//span[.='1,399'])"))
	WebElement price;
	@FindBy(xpath = ("(//h2[.=' Product description  '])"))
	WebElement description;
   
	
	public void search() {
		searchshoe.click();
	}
	
	public void selectReviews() {
		reviews.click();
		Assert.assertTrue(reviews.isDisplayed(), "Reviews are not displayed.");
	}

	public void displayPrice() {
		String productPrice = price.getText();
		Assert.assertTrue(price.isDisplayed(), "Price is not displayed.");
		System.out.println("Product Price: " + productPrice);
	}

	public void displayDescription() {

		String productDescription = description.getText();
		Assert.assertTrue(description.isDisplayed(), "Description is not displayed.");
		System.out.println("Product Description: " + productDescription);
	}

	public Productdetail_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
