package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class VisitGeneralStore {

	
		static AndroidDriver driver;
		public static void scrollToElementAndClick(AndroidDriver driver,String an,String av)
		{
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
		}
		
		
		public static void main(String[] args) throws MalformedURLException, InterruptedException {

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
			driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			scrollToElementAndClick(driver, "text", "India");
			driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("arshiya");
			WebElement radioBtn = driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
			radioBtn.click();
			WebElement shop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
			shop.click();
			
			
			scrollToElementAndClick(driver, "text", "PG 3");
			driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
	Thread.sleep(2000);
Set<String> windows= driver.getContextHandles();

for (String ele:windows) {
	

	
	System.out.println("active application"+windows);
	System.out.println("active application"+ele);
	Thread.sleep(2000);
	driver.context("WEBVIEW_com.androidsample.generalstore");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tyss");
	
}
	
}
}
			
		
	
		
		
	


