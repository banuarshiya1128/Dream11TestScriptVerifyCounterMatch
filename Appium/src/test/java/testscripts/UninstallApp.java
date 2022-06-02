package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UninstallApp {

	
public static void main(String[] args) throws MalformedURLException, Throwable {
		
		DesiredCapabilities dcap =new DesiredCapabilities();
		
		//common DC (Android or IOS)
		dcap.setCapability("deviceName", "vivo 1920");
		dcap.setCapability("automationName", "appium");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "11");
		dcap.setCapability("UDID", "942cc0e8");
		
		//dc for android
		dcap.setCapability("appPackage", "io.appium.android.apis");
		dcap.setCapability("appActivity", ".ApiDemos");
		
		
		//Appium Server port no
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
				AndroidDriver  driver=new AndroidDriver(url, dcap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("App status" +driver.isAppInstalled("io.appium.android.apis"));
		
		driver.removeApp("io.appium.android.apis");
		System.out.println("App status" + driver.isAppInstalled("io.appium.android.apis"));
		
		driver.installApp("C:\\Users\\hp\\Downloads\\ApiDemos-debug.apk");
}
}
