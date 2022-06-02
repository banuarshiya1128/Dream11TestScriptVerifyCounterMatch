package drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunAPPInBackgroundGeneralStore {
	
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();
		 
		 dc.setCapability("deviceName", "vivo 1920");
			dc.setCapability("automationName", "appium");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "11");
			dc.setCapability("UDID", "942cc0e8");
			
			dc.setCapability("appPackage", "com.androidsample.generalstore");
			dc.setCapability("appActivity", ".SplashActivity");
			
			URL url = new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver = new AndroidDriver(url,dc);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.runAppInBackground(20);
			
	}

}
