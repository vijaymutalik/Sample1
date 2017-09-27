package com.TestScript;

import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.library.BaseCalss;

public class LoginModule extends BaseCalss 

{
	@Test
	public void logintoabofapplication() throws InterruptedException{
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign In/Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Already')]")).click();
		Thread.sleep(2000);
		List<WebElement> emailId=driver.findElements(By.name("emailAddress"));
		int count =emailId.size();
		System.out.println("Email ID Elements count is"+count);
		emailId.get(1).sendKeys("VijayMutalik");
		Thread.sleep(3000);
		List<WebElement> password=driver.findElements(By.name("password"));
		int count2=password.size();
		System.out.println("Password Elements count is"+count2);
		password.get(1).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New to')]")).click();
		Thread.sleep(3000);
		emailId.get(0).clear();
		Thread.sleep(3000);
		emailId.get(0).sendKeys("Xerox Corporation");
		Thread.sleep(3000);
		password.get(0).sendKeys("123");
		Thread.sleep(3000);
	}


}
