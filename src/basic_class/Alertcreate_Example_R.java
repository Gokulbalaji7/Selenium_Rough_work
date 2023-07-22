package basic_class;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcreate_Example_R {

	public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");

		
		
		
	
		
		
		
		/*                  important
		
		
          // 1.inspect aleart created by manually in console see in note.		
          // 2. this below alert is created by java scriptcode  
	
	
		*/
		
		
		
		
	
		
		
		
//we shld type this syntax for alert create
		
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		Object g1 = jse.executeScript("alert('Welcome to Handle Alerts')");	
		
// below are extra i will merge those.		
		Thread.sleep(3000);
		Alert g2 = driver.switchTo().alert();
		g2.accept();
				
		
		
	
		
	}
  
}
