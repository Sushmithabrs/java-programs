package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementprg {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1=new ChromeDriver();
	//EdgeDriver c2=new EdgeDriver();
	c1.get("https://www.google.com");
	Thread.sleep(2000);
	c1.manage().window().maximize();
	c1.findElement(By.name("q")).sendKeys("india");
}}


