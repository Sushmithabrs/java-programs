package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssginment {

	public static void main(String[] args) {
		ChromeDriver c1=new ChromeDriver();
		c1.get("file:///C:/Users/Admin/Desktop/learningHTML1.html");
		
		WebElement username= c1.findElement(By.xpath("/html/body/input)[1]"));
		username.sendKeys("sushmitha");

		WebElement hint= c1.findElement(By.xpath("/html/body/input)[2]"));
		hint.sendKeys("name");

		/*WebElement username= c1.findElement(By.xpath("/html/body/input)[1]"));
		username.sendKeys("sushmitha");
		//WebElement e4= c1.findElement(By.xpath("/html/body/form[2]/input[4]"));
		//e4.click();
		WebElement cust=c1.findElement(By.linkText("Click to know about us "));
		cust.click();	
	*/
		c1.quit();
		
	}

}
