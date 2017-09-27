package com.library;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGAnotations extends BeforeMethodAnotation {
	
	@Test(priority=1,enabled=true)
	public void login()
	{
		System.out.println("Lobin to gamil application");
		
	}
	@Test(priority=2,enabled=true)
	public void verifyHomePage()
	{
		System.out.println("Verily the gmail home page");
	}
	@Test(priority=3,enabled=true)
	public void logout()
	{
		System.out.println("Logout from gmail");
	}
	

}
