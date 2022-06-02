package drivermethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ZoomINZoomOut {

	public static void main(String[] args) throws MalformedURLException {
		AppiumDriverLocalService server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("../Appium.txt")));
		
		
		
		server.start();
		
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
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	

}
