package basic_class;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_task_R {

	public static void main(String[] args) {

		Scanner gk = new Scanner(System.in);
		System.out.println("search google or facebook");

		// String a = "google";
		// String b = "facebook";

		String g1 = gk.next();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\Driver\\chromedriver.exe");

		WebDriver gokul = new ChromeDriver();

		if (g1.equalsIgnoreCase("google")) {
			gokul.get("https://www.google.com/");
		} else if (g1.equalsIgnoreCase("facebook")) {
			gokul.get("https://www.facebook.com/");

		}

	}

}
