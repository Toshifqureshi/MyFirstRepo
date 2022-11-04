package com.oct15;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericutilities.Baseclass;


public class TestCase extends Baseclass {
	@Test
	public void logintoFacebook()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fghhjj");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("4356637");
		driver.findElement(By.xpath("//button[@name='login]")).click();
		
		
	}

}
