package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragnadDropAPI {
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
		 WebElement okbutton = driver.findElement(By.id("android:id/button1"));
			okbutton.click();
		WebElement view = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		view.click();
		WebElement clickondraganddrop = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]"));
		clickondraganddrop.click();
		
		
		
		WebElement src = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		src.click();
		WebElement dest = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		
		
		TouchAction to = new TouchAction(driver);
		to.longPress(src).waitAction().moveTo(dest).perform().release();
}
}
