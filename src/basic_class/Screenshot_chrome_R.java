package basic_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_chrome_R {

	public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\Driver\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();

		obj.get("https://www.facebook.com/");

		obj.manage().window().maximize();
		

		TakesScreenshot ts = (TakesScreenshot) obj;
		
		File sourcefilee = ts.getScreenshotAs(OutputType.FILE);
		
		File designationn = new File("C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\screenshots\\facebook.png");

        
		Thread.sleep(2000);
		
		
		FileUtils.copyFile(sourcefilee, designationn);
		
		
		
	}

}
