package drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ToastMessageGeneralStore {
	static AndroidDriver driver;
	//public static void scrollToElementAndClick(AndroidDriver driver,String an,String av)
	//{
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();;
	//}
	
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
		
		 MobileElement button = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		 
		 driver.tap(1, button, 500);
		 
		String toastmsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		 System.out.println(toastmsg);
		 

}
}