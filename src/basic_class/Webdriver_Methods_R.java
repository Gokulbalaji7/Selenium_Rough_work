package basic_class;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods_R {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\Driver\\chromedriver.exe");

	
		
		
		// once check the program WdWeBSAA_practice_R . Important
		
		
		
		
		
		
		
/*		
// for incognito window shoudbe opened in chrome follow below
 	
		 // give syntax		
		 ChromeOptions gok = new ChromeOptions();
		 
		 // add Incognito in arguments
		 gok.addArguments("incognito");
		
         // for new tab in window 
		 gok.addArguments("new window");
		 
		 // syntax should be little change 
		 WebDriver obj = new ChromeDriver(gok);
*/
		
	
		
		
// for normal open use below syntax
		
		 WebDriver obj = new ChromeDriver();

		 obj.get("https://www.google.com/");

		// obj.manage().window().minimize();
		// obj.manage().window().fullscreen();
		// obj.manage().window().maximize();

		Thread.sleep(2000);

//setsize is important
		Dimension g2 = new Dimension(1000, 500);
		obj.manage().window().setSize(g2);

		Dimension g1 = obj.manage().window().getSize();
		System.out.println(g1);

		Thread.sleep(2000);

		obj.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		obj.navigate().back();
		Thread.sleep(2000);
		obj.navigate().forward();
		Thread.sleep(2000);
		obj.navigate().refresh();
		Thread.sleep(2000);

		String g3 = obj.getTitle();
		System.out.println(g3);
		String g4 = obj.getCurrentUrl();
		System.out.println(g4);

//doubt		
		// String g5 = obj.getPageSource();
		// System.out.println(g5);

	//	obj.close();
		// obj.quit();

// doubt 
		// obj.manage().deleteAllCookies();

	}

}
