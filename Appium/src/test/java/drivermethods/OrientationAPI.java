package drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OrientationAPI {
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
		
		WebElement clickcontinue = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
	 clickcontinue.click();
	 
	ScreenOrientation currentscreenoriention = driver.getOrientation();
	System.out.println(currentscreenoriention);
	
	
	Thread.sleep(2000);
	driver.rotate(ScreenOrientation.LANDSCAPE);
	System.out.println(driver.getOrientation());
	Thread.sleep(2000);
	
	driver.rotate(ScreenOrientation.PORTRAIT);
	System.out.println(driver.getOrientation());
	driver.rotate(currentscreenoriention.LANDSCAPE);
	driver.rotate(currentscreenoriention.PORTRAIT);
}
}