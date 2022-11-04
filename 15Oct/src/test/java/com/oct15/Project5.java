package com.oct15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.getTitle();
		driver.get("https://www.flipkart.com");
	
		driver.quit();
	}

}
