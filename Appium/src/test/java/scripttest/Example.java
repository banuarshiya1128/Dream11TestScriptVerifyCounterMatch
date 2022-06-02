package scripttest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.genericUtlity.BaseClass;

import io.appium.java_client.android.AndroidDriver;

@Test
public class Example extends BaseClass {
	
	public AndroidDriver  driver;
	@Test
	public void launchapp() throws InterruptedException {
		System.out.println("App is launched");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']")).click();
driver.findElement(By.className("android.view.ViewGroup")).sendKeys("ghh");
Thread.sleep(3000);
		
	}
	}

