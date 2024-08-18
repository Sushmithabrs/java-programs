package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiPrg {

	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://retail.onlinesbi.sbi/retail/login.htm");
		drive.manage().window().maximize();
		WebElement CTL=drive.findElement(By.linkText("CONTINUE TO LOGIN"));
		CTL.click();
		WebElement UN=drive.findElement(By.name("userName"));
		UN.sendKeys("SUSHMITHA");	
	WebElement PW=drive.findElement(By.name("password"));
			PW.sendKeys("br@123");
	}

}
