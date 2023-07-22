package basic_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Example_R {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\Driver\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();

		obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	
		
		
		// once check the program WdWeBSAA_practice_R . Important
		
		
		
		
		
//1. to find - get location x y or get position x y in point

		// go step by step.

		WebElement g1 = obj.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		Point findxy = g1.getLocation();
		int xvalue = findxy.getX();
		int yvalue = findxy.getY();

		System.out.println("x value is - " + xvalue);
		System.out.println("y value is -_" + yvalue);

		
			
//2. to find - get size - it give height,width in dimention	

		WebElement g2 = obj.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		Dimension size = g2.getSize();
		int height = size.height;
		int width = size.width;
		System.out.println(height);
		System.out.println(width);

		
			
//3. to find - get tag name
		
		WebElement g3 = obj.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		String tagName = g3.getTagName();
		System.out.println(tagName);

		
			
//4. to find - get css value - it bribg fontsize,background clr,border,radius in string	

		// Doubt

		// WebElement g4 = obj.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span"));
		// String cssValue = g4.getCssValue("border-color");

		// System.out.println(cssValue);

	}

}
