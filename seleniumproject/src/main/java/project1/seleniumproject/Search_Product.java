package project1.seleniumproject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Product {
	WebDriver driver;
	
@FindBy(id="twotabsearchtextbox")
WebElement searchproducr;



public void searchprd() {
searchproducr.sendKeys("shoe"+Keys.ENTER);
	
}


public Search_Product(WebDriver driver) {
	
	PageFactory.initElements( driver,this);
}

}