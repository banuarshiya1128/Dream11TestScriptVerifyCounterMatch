package com.crm.genericUtlity;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
@Test
public class BaseClass {
	public AndroidDriver  driver;
	AppiumDriverLocalService  server;
	/*public FileUtility afc = new FileUtility();
	@BeforeSuite
	public void database()
	{
		System.out.println("database");
	}

	

	@BeforeTest
	public void parallel() {
		System.out.println("parallel");
	}
	@AfterTest
	public void closeparallel() {

		System.out.println("close parallel");

	}

	public void openserver() {
		System.out.println("aaa");

	}*/
	
	@BeforeMethod
	public void launchapp(AndroidDriver  driver) throws Throwable {
		DesiredCapabilities cap =new DesiredCapabilities();

	FileUtility.tofetchPropertyFile("path");
	String deviceName = FileUtility.getproperty("deviceName");
	String UDID = FileUtility.getproperty("UDID");
	String platformVersion = FileUtility.getproperty("platformVersion");
	String platformName = FileUtility.getproperty("platformName");
	String appActivity = FileUtility.getproperty("appActivity");
	String appPackage = FileUtility.getproperty("appPackage");
	
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName );
	cap.setCapability(MobileCapabilityType.UDID,UDID );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName );
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		
		cap.setCapability("appPackage","appPackage");
			cap.setCapability("appActivity","appActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		
	//	cap.setCapability("appPackage","appPackage");
	//	cap.setCapability("appActivity","appActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		  driver=new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		//@AfterSuite
		//public void closedatabase() {
			//System.out.println("close database");
		//}


	@AfterMethod
	public void closeapp() {
		server.stop();
		
	}
	}
	
	//public void close() {
		//System.out.println("aaa");
	

