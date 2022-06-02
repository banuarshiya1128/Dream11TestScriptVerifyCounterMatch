package dream11;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.crm.genericUtlity.BaseClass;
import com.crm.genericUtlity.Constantpath;
import com.crm.genericUtlity.FileUtility;
import com.crm.genericUtlity.MobileDriverUtility;

import io.appium.java_client.android.AndroidDriver;

public class VerifyCountersTest extends BaseClass {

	
	public static AndroidDriver driver;

	public static void main(String[] args) throws Throwable {
		
DesiredCapabilities dcap =new DesiredCapabilities();
		
	//FileUtility.tofetchPropertyFile(Constantpath.PropertyFilePath);
	
		dcap.setCapability("deviceName", "vivo 1920");
		dcap.setCapability("automationName", "appium");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "11");
		dcap.setCapability("UDID", "942cc0e8");
		
		
		dcap.setCapability("appPackage", "com.app.dream11Pro");
		dcap.setCapability("appActivity", "com.app.dream11.dream11.SplashActivity");
		
		
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		
		  driver=new AndroidDriver(url, dcap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@text='English']/parent::android.widget.LinearLayout")).click();
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		WebElement actual = driver.findElement(By.xpath("//*[@text='Log In']"));
		actual.click();
		//String excepted = "Log In";
		//Assert.assertEquals(actual, excepted);
		driver.findElement(By.xpath("//*[@text='Email or mobile no']")).sendKeys("7676579883");
		
		WebElement next = driver.findElement(By.xpath("//*[@text='NEXT']"));
		MobileDriverUtility.tapActions(driver, 1, next, 500);
		
		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		
		 List<WebElement> withintwofour = driver.findElements(By.xpath("//*[@text='MEGA']/preceding-sibling::android.widget.TextView"));
		 
		for (WebElement e : withintwofour)
		{
			
		System.out.println(e.getText());
		
		
		}
	
		List<WebElement> twofour = driver.findElementsByXPath("//class[@resource-id='com.app.dream11Pro:id/']");
		for (WebElement fourTwo : twofour) {
			System.out.println(fourTwo.getText());
			
		
	}
		
	}	
}

