package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubprg {

	public static void main(String[] args) throws InterruptedException {
			ChromeDriver c1=new ChromeDriver();
			c1.get("https://www.youtube.com/");
			c1.manage().window().maximize();
			WebElement e1=c1.findElement(By.xpath("//input[@id='search']"));
			e1.sendKeys("Grotechminds");e1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement e2=c1.findElement(By.xpath("//script[@id='base-js']"));
			e2.sendKeys(Keys.ENTER);
	}

}
