package testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapActions11 {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		//Common Capability of Android
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"vivo 1920");
		cap.setCapability(MobileCapabilityType.UDID, "942cc0e8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");


		//Capability of App
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity",".Calculator");

		//Appium Server URL

		URL url=new URL("http://localhost:4723/wd/hub");

		driver=new AndroidDriver(url, cap);

		WebElement six=driver.findElement(By.id("com.android.bbkcalculator:id/digit6"));
		//driver.tap(1, six, 500);
		tapActions(1, six, 500);
		WebElement plus = driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
		//driver.tap(1, plus, 500);
		//driver.tap(1, 919, 1872, 500);
		tapActions(1, six, 500);
		WebElement nine=driver.findElement(By.id("com.android.bbkcalculator:id/digit9"));
		//driver.tap(1, nine, 500);
		tapActions(1, nine, 0);
		WebElement equals = driver.findElement(By.id("com.android.bbkcalculator:id/equal"));

		//driver.tap(1, equals, 500);
		tapActions(1, equals, 500);
		String text = driver.findElement(By.id("com.android.bbkcalculator:id/input_edit")).getText();
		System.out.println(text);


	}
	public static void tapActions(int finger,WebElement element, int duration) {
		driver.tap(finger, element, duration);
	}
	public static void tapActions(int finger,int x, int y, int duration) {

		driver.tap(finger, x, y, duration);
	}
}



