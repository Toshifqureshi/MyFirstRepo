package com.oct15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver  =WebDriverManager.chromedriver().create();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.tagName('a'));
	Thread.sleep(2000);
		driver.quit();
}
}
