package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrgApollo {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver c1=new ChromeDriver();
	c1.get("https://www.apollopharmacy.in/?deep_link_sub1=apollopatients%3A%2F%2FMedicine&c=20053951897&pid=doubleclick_int&deep_link_value=apollopatients%3A%2F%2FMedicine&af_xp=custom&af_prt=yoptima&utm_source=google&utm_medium=srnb&campaignid=20587565982&adgroupid=&keyword=&device=c&adtype=&product_id=&utm_campaign=Pmax_Pharma_FMCG_Competitors_TopCities&utm_content=[adgroup]&gad_source=1&gclid=EAIaIQobChMI67WGkcX5hwMVQKNmAh1vxj3LEAAYASAAEgKO2vD_BwE");
	c1.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement e1=c1.findElement(By.xpath("//input[@id='\"searchProduct\"']"));
	e1.sendKeys("pcm");
	;
	

	}

}
