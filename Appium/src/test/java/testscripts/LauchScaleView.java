package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LauchScaleView {
	
public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dcap =new DesiredCapabilities();
		
		//common DC (Android or IOS)
		dcap.setCapability("deviceName", "vivo 1920");
		dcap.setCapability("automationName", "appium");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "11");
		dcap.setCapability("UDID", "942cc0e8");
		
		//dc for android
		dcap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dcap.setCapability("appActivity", ".MainActivity");
		
		
		//Appium Server port no
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		
		AndroidDriver  driver=new AndroidDriver(url, dcap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		
		WebElement image = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		
		driver.zoom(image);
		
		driver.pinch(image);
		
	}


}
