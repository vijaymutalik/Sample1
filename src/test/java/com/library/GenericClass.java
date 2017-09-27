package com.library;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericClass
{
	public static String getPropertirs(String skey)
	{
		String svalue=null;
		Properties p=new Properties();
		try
		{
		FileInputStream file=new FileInputStream("C:\\Users\\30192062\\workspace\\framework\\config.properties");
		p.load(file);
		svalue=p.getProperty(skey);
		
		}
		catch(Exception e)
		{
			
		}
		return svalue;
		
	}

}
