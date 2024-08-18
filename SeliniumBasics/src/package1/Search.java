package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.amazon.in");
		WebElement e1=c1.findElement(By.xpath("//input)[5]"));
		e1.sendKeys("MAC"+Keys.ENTER);
	}

}
