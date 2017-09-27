package com.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseCalss 
{
	public WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		if(GenericClass.getPropertirs("BrowserName").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\30192062\\workspace\\Selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(GenericClass.getPropertirs("URL"));
			driver.manage().window().maximize();
		}
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
