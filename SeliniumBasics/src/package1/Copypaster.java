package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaster {

	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://grotechminds.com/registration/");
		drive.manage().window().maximize();
		WebElement e1=drive.findElement(By.name("fname"));
		e1.sendKeys("sushmitha");
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		WebElement e2=drive.findElement(By.name("lname"));
		e2.sendKeys(Keys.CONTROL+"v");
		
	}

}
