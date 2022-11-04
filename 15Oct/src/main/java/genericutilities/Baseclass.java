package genericutilities;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	@BeforeSuite
	public void dbconfig()
	{
		System.out.println("connect to db");
	}
@BeforeClass
public void launchBrowser()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
System.out.println("browser launched");
}
@BeforeTest
public void logintoapp()
{
driver.get("https://www.facebook.com");
System.out.println("successfullu logged in");
}
@AfterMethod
public void logoutfromapp()
{
System.out.println("loggedout from app");	
}
@AfterClass
public void closeBrowser()
{
driver.quit();
System.out.println("browser closed");
}
@AfterSuite
public void dbClose()
{
System.out.println("close DB onnection");	
}
}

