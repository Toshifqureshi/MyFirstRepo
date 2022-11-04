package com.oct15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {
public static void main(String[] args) throws InterruptedException {
	//steo-p to open empty browser
	//System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	//ChromeDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	driver.quit();
	//end of the testcass
}
}
