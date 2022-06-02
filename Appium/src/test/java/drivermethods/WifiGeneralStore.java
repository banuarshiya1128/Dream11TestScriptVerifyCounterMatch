package drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class WifiGeneralStore {
	

	static AndroidDriver driver;
	public static void scrollToElementAndClick(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();;
	}
	
	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		//common dc (Android or  IOs) )
		dc.setCapability("deviceName", "vivo 1920");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "942cc0e8");

		//dc FOR  android
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Connection currentstate = driver.getConnection();
		System.out.println(currentstate);
		driver.setConnection(Connection.DATA);
		
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.WIFI);
		System.out.println(driver.getConnection());
	}
}



