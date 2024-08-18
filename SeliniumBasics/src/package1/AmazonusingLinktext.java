package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonusingLinktext {

	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://www.amazon.in");
		//WebElement cust=drive.findElement(By.linkText("Customer Service"));
		//	cust.click();
			WebElement cust=drive.findElement(By.partialLinkText("Customer "));
			cust.click();	
		
		

}}
