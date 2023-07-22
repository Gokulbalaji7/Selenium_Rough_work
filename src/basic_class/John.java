package basic_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class John {

	public static void main(String[] args) throws Throwable {

		
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\gokul\\\\eclipse-workspace\\\\selenium_Rough work\\\\Driver\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			WebElement SignI = driver.findElement(By.xpath("//a[@class='login']"));
			SignI.click();
			Thread.sleep(2000);

			WebElement mail = driver.findElement(By.xpath("//input[@id='email_create']"));
			mail.sendKeys("johnsanD@gmail.com");
			Thread.sleep(2000);
			WebElement create = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
			create.click();
			Thread.sleep(4000);

			WebElement MR = driver.findElement(By.xpath("//label[@for='id_gender1']"));
			MR.click();

			WebElement FN = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
			FN.sendKeys("Johnsan");
			WebElement LN = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
			LN.sendKeys("S");
			WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
			Pass.sendKeys("9600698821");
			Thread.sleep(2000);

			WebElement day = driver.findElement(By.id("days"));
			Select s1 = new Select(day);
			s1.selectByIndex(20);
			Thread.sleep(2000);

			WebElement month = driver.findElement(By.id("months"));
			Select s2 = new Select(month);
			s2.selectByIndex(2);
			Thread.sleep(2000);

			WebElement year = driver.findElement(By.id("years"));
			Select s3 = new Select(year);
			s3.selectByValue("1996");
			Thread.sleep(2000);

			WebElement Adress = driver.findElement(By.xpath("//input[@name='address1']"));
			Adress.sendKeys("NatarajaGarden,Cdm,Chidambaram,etc");

			WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
			city.sendKeys("cuddalore");
			Thread.sleep(2000);

			WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
			Select ST = new Select(state);
			ST.selectByIndex(33);

			WebElement post = driver.findElement(By.xpath("//input[@name='postcode']"));
			post.sendKeys("00000");

			WebElement MN = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
			MN.sendKeys("9600698821");
			Thread.sleep(2000);

			WebElement Reg = driver.findElement(By.xpath("//button[@name='submitAccount']"));
			Reg.click();
			Thread.sleep(4000);

			WebElement Dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
			Dress.click();
			Thread.sleep(3000);

			WebElement PD = driver.findElement(By.xpath("(//a[@class='product-name'])[3]"));
			PD.click();
			Thread.sleep(2000);

			WebElement AD1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			AD1.click();
			Thread.sleep(2000);
			WebElement AD2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			AD2.click();
			Thread.sleep(2000);
			WebElement AD3 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			AD3.click();
			Thread.sleep(2000);
			WebElement AD4 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			AD4.click();
			Thread.sleep(2000);

			WebElement Cart = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
			Cart.click();
			Thread.sleep(2000);

			WebElement Prcd1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			Prcd1.click();
			Thread.sleep(2000);

			WebElement Prcd2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			Prcd2.click();
			Thread.sleep(2000);
			WebElement Prcd3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
			Prcd3.click();
			Thread.sleep(2000);
			WebElement Tos = driver.findElement(By.xpath("//input[@type='checkbox']"));
			Tos.click();
			Thread.sleep(2000);
			WebElement Prcd4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
			Prcd4.click();
			Thread.sleep(2000);
			WebElement PbyC = driver.findElement(By.xpath("//a[@class='bankwire']"));
			PbyC.click();
			Thread.sleep(2000);
			WebElement Cnord = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			Cnord.click();	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
