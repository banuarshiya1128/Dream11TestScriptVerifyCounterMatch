package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralstoreScroll {
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
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		scrollToElementAndClick(driver, "text", "India");
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sonalitiwari");
		WebElement radioBtn = driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
		radioBtn.click();
		WebElement shop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		shop.click();
		
		WebElement addtocart = driver.findElement(By.xpath("//div[@style='z-index: 13; left: 143.5px; top: 285.671px; width: 121.178px; height: 11.4269px;']"));
		addtocart.click();
	}

}
