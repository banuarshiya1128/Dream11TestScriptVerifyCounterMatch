package drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidKeyCodeAPI {
public static void main(String[] args) throws MalformedURLException, Throwable {
	AppiumDriverLocalService server = AppiumDriverLocalService.buildDefaultService();
	server.start();
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
System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
System.out.println(AndroidKeyCode.BACK);
System.out.println(AndroidKeyCode.ENTER);
System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);


//send a key event to the device

Thread.sleep(2000);

driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
Thread.sleep(2000);
driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
Thread.sleep(2000);
driver.pressKeyCode(AndroidKeyCode.BACK);
Thread.sleep(2000);
driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
Thread.sleep(2000);
driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
Thread.sleep(2000);
server.stop();

}
}
