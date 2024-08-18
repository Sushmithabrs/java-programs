package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_linktextmajortabs {

	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13806012895519499455&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        c.manage().window().maximize();
       // WebElement w1=c.findElement(By.linkText("Customer Service"));
       // w1.click();
        WebElement w1=c.findElement(By.partialLinkText("Customer "));
         w1.click();
	
	}
	
	

}
