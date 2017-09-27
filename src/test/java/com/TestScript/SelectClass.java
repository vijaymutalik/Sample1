package com.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.library.BaseCalss;

public class SelectClass extends BaseCalss 
{
	@Test
	public void selectclass() throws InterruptedException
	{
		driver.findElement(By.id("Skills")).click();
		Select select=new Select(driver.findElement(By.id("Skills")));
		select.selectByVisibleText("C++");
		Thread.sleep(3000);
		
	}

}
