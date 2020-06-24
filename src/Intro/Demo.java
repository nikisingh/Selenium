package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse_workspcae\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver" ,
		// "D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.ie.driver" ,
		// "D:\\Selenium\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		// WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.facebook.com/");
 
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		// driver.get("https://yahoo.co.in");

		// driver.navigate().back();
		// driver.navigate().forward();
		// Locater technique

		// Classes with spaces cant be used. Compound class error will be thrown.
		// Also if there are two fields with the same id/class/name. It scan from top
		// left and captures the first field

		// driver.findElement(By.className("inputtext
		// login_form_input_box")).sendKeys("singh@gmail.com");

		driver.findElement(By.id("email")).sendKeys("singh@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("hello");

		// driver.findElement(By.id("loginbutton")).click();

		driver.findElement(By.linkText("Forgotten account?")).click();

		// driver.close(); // Closes current browser

		// driver.quit(); // Closes all browser opened by selenium script

	}

}
