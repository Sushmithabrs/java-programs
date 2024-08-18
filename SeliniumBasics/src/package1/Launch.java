package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1=new ChromeDriver();
		//EdgeDriver c2=new EdgeDriver();
		c1.get("https://www.google.com");
		Thread.sleep(2000);
		System.out.println(c1.getWindowHandle());
		System.out.println(c1.getWindowHandles());
		System.out.println(c1.getTitle());
		//c1.close();
		c1.quit();
	}
}
