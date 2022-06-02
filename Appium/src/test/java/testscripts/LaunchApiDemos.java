package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class LaunchApiDemos {
	
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
		
		WebElement controls = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]"));
		controls.click();
		
		WebElement LightTheme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]"));
		LightTheme.click();
		
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("appium");
		
		WebElement checkbox = driver.findElement(By.id("io.appium.android.apis:id/check2"));
		checkbox.click();
		
		WebElement radiobutton = driver.findElement(By.id("io.appium.android.apis:id/radio2"));
		radiobutton.click();
		//to hide the keyboard
		driver.hideKeyboard();
		
		
	driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();	
	

		 List <WebElement> alldropdowntext = driver.findElementsByClassName("android.widget.CheckedTextView");
		int size = alldropdowntext.size();
		System.out.println(size);
		for (WebElement ele : alldropdowntext) {
			System.out.println(ele.getText());
		}
		for (WebElement ele : alldropdowntext) {
			
			String val = ele.getText();
			System.out.println(val);
			if (val.equalsIgnoreCase("Venus")) {
				ele.click();
				break;
			}
		
		}
}
		}
			
		
		
		
	




