package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passwordprg {
	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver c1=new ChromeDriver();
		  c1.get("https://www.google.com");
		  Thread.sleep(2000);
		  c1.manage().window().maximize();
		  c1.findElement(By.name("pass")).sendKeys("sushmitha");
		 // c1.findElement(By.name("pass")).click();
}
}