package scripttest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.crm.ObjectRepsitory.GeneralLoginPage;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStorePOMscript {
	public AndroidDriver driver;
	public void loginpage() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		//common dc (Android or  IOs) )
		dc.setCapability("deviceName", "vivo 1920");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "942cc0e8");

		//dc FOR  android
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url,dc);
		Thread.sleep(2000);
		GeneralLoginPage lp=new GeneralLoginPage(driver);
		lp.loginbtn1("anu");
	}

}
