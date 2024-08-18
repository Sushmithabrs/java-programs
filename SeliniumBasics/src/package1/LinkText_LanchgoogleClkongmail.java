package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_LanchgoogleClkongmail {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver c=new ChromeDriver();
	c.get("https://www.google.co.in/");
	c.manage().window().maximize();
	Thread.sleep(2000);
	WebElement we=c.findElement(By.linkText("Gmail"));
	we.click();
	WebElement w1=c.findElement(By.partialLinkText("Gma"));
	w1.click();
	}

}
