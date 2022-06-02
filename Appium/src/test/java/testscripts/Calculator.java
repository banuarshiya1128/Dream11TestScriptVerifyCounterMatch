package testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap =new DesiredCapabilities();
		
		//Common Capability of Android
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1920");
		cap.setCapability(MobileCapabilityType.UDID, "942cc0e8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//Capability of App
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity",".Calculator");
		
		
		//Appium Server URL
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver  driver=new AndroidDriver(url, cap);
		
		WebElement six = driver.findElement(By.id("com.android.bbkcalculator:id/digit6"));
		
		six.click();
		
		WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
		
		plus.click();
		
		WebElement nine = driver.findElement(By.id("com.android.bbkcalculator:id/digit9"));
		nine.click();
		WebElement equals = driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
		equals.click();
		
		
		String text = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"15\"]")).getText();
		System.out.println(text);
	}
}
