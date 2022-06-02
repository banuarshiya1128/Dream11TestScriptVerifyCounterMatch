package com.crm.genericUtlity;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	static Properties prop;
	public static void tofetchPropertyFile(String path) throws Throwable
	{
		FileInputStream fin = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fin);
	}
	
	/*
	 * used to get common data
	 * 
	 */
	public static String getproperty(String key)
	{
		
		String data = prop.getProperty(key);	
		return data;
	}
	
	
}


