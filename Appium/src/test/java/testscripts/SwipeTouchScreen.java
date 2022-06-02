package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwipeTouchScreen {
	
public static void main(String[] args) throws MalformedURLException, Throwable {
		
		DesiredCapabilities dcap =new DesiredCapabilities();
		
		//common DC (Android or IOS)
		dcap.setCapability("deviceName", "vivo 1920");
		dcap.setCapability("automationName", "appium");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "11");
		dcap.setCapability("UDID", "942cc0e8");
		dcap.setCapability("app", "C:\\Users\\hp\\Downloads\\Touch Screen Test_v1.7.14_apkpure.com.apk");
		
		
		//dc for android
		dcap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dcap.setCapability("appActivity", ".TouchScreenTestActivity");
		
		
		//Appium Server port no
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
				AndroidDriver  driver=new AndroidDriver(url, dcap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension size = driver.manage().window().getSize();
		int ht = size.getHeight();
		int wd = size.getWidth();
		//vertical
		driver.swipe(546, 235, 579, 1768, 500);
		//horizontal
		driver.swipe(78, 1020, 953, 983, 500);
		//vertical swipe
		driver.swipe(wd/2, (int)(ht*0.25), wd/2,(int)(ht*0.80), 1000);
		driver.swipe((int)(wd*0.1), (int)(ht*0.2), (int)(wd*0.1), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.5), (int)(ht*0.2), (int)(wd*0.5), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.9), (int)(ht*0.2), (int)(wd*0.9), (int)(ht*0.8), 500);
		
		
		driver.swipe((int)(wd*0.25), ht/2, (int)(wd*0.8),ht/2, 1000);
		driver.swipe((int)(wd*0.1), (int)(ht*0.8), (int)(wd*0.9), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.1), (int)(ht*0.2), (int)(wd*0.9), (int)(ht*0.2), 500);
		driver.swipe((int)(wd*0.1), (int)(ht*0.5), (int)(wd*0.9), (int)(ht*0.5), 500);
	}


}
