package com.oct15;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project7 {
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Reporter.log("sucess", false);
		driver.quit();
	}	
	
	@Test
	public void test2()
	{
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	//Reporter.log("sucess", true);
			
	}

}

