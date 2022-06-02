package drivermethods;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Android_KeyAction {
public static void main(String[] args) throws MalformedURLException, Throwable {
		AppiumDriverLocalService server = AppiumDriverLocalService.buildDefaultService();
		DesiredCapabilities dcap =new DesiredCapabilities();
		
		//common DC (Android or IOS)
		dcap.setCapability("deviceName", "vivo 1920");
		dcap.setCapability("automationName", "appium");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "11");
		dcap.setCapability("UDID", "942cc0e8");
		
		dcap.setCapability("noReset", true);
		//dc for android
		dcap.setCapability("appPackage","com.android.bbkcalculator");
		dcap.setCapability("appActivity",".Calculator");
}
}