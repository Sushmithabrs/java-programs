package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcregistration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://www.hdfcbank.com/");
		WebElement fn=drive.findElement(By.linkText("link_navrootMainMenu"));
			fn.click();
			Thread.sleep(2000);
		WebElement sn=drive.findElement(By.id("city"));
				sn.sendKeys("banglore");
		WebElement email=drive.findElement(By.id("u_2_h_7s"));
				email.sendKeys("sush"
						+ "mitha@gmail.com");
		WebElement np=drive.findElement(By.id("GMT-PMRGDRF"));
				np.sendKeys("9677453431");
		
		}

	}

