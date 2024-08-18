package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12190032094722046240&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		c1.manage().window().maximize();
		WebElement e1=c1.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoes");e1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement e2=c1.findElement(By.xpath("//div [@class='brand-follow-tooltip-root']"));
		e2.click();
		
		
	}

}
