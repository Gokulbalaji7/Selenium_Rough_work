package basic_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_R {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gokul\\\\eclipse-workspace\\\\selenium_Rough work\\\\Driver\\\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
		obj.get("https://www.google.com/");

		
		// once check the program WdWeBSAA_practice_R . Important
		
		
		WebElement g1 = obj.findElement(By.name("q"));
		g1.sendKeys("NASA" + Keys.ENTER);
		
		
		
		Thread.sleep(2000);
				
		WebElement g2 = obj.findElement(By.linkText("nasa full form"));
		g2.click();
		
// any one element mthd is join next to find element and locators 
//click or get text or sendkey or any.
		
	 // String text = g1.getText();
	 // System.out.println(text);
		
	 // WebElement g3 = obj.findElement(By.partialLinkText("nasa full"));
	 //	g3.click();
		
		
		
		
		String title = obj.getTitle();
		System.out.println(title);
		
		
// doubt		
	   // String value =	obj.findElement(By.name("btnK")).getAttribute("value");
		//System.out.println(value);
		
		//String attribute = g1.getAttribute("name");
		//System.out.println(attribute);
		
		//WebElement gg = obj.findElement(By.name("btnK"));
		//String value = gg.getAttribute("value");
		
		//System.out.println(value);
		
		
		
	//	WebElement rr = obj.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[2]/td/div/div[2]"));
	//	boolean enabled = rr.isEnabled();
	//	System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
