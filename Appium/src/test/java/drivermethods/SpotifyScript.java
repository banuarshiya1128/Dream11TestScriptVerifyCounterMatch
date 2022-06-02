package drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SpotifyScript {
	 static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		//common dc (Android or  IOs) )
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1920");
		cap.setCapability(MobileCapabilityType.UDID, "942cc0e8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("browserName", "Chrome");

		//dc FOR  android
		//dc.setCapability("appPackage", "com.androidsample.generalstore");
		//dc.setCapability("appActivity", ".SplashActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		Thread.sleep(2000);
		  driver = new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
	
		driver.findElement(By.xpath("//input[@type='text']"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		//driver.findElement(By.xpath("//button[@type='button']")).click();

	}
	}


