package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchTouchScreen {
public static void main(String[] args) throws MalformedURLException, Throwable {
		
		DesiredCapabilities dcap =new DesiredCapabilities();
		
		//common DC (Android or IOS)
		dcap.setCapability("deviceName", "vivo 1920");
		dcap.setCapability("automationName", "appium");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "11");
		dcap.setCapability("UDID", "942cc0e8");
		
		//dc for android
		dcap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dcap.setCapability("appActivity", ".TouchScreenTestActivity");
		
		
		//Appium Server port no
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
				AndroidDriver  driver=new AndroidDriver(url, dcap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


}
