package com.crm.genericUtlity;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility {
	/**
	 * this method is used for scrolling
	 * @param driver
	 * @param an
	 * @param av
	 */

	public static void scrollToElementAndClick(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
	}
	/**
	 * this method is used to click actions
	 * @param driver
	 * @param finger
	 * @param element
	 * @param duration
	 */
	public static void tapActions(AndroidDriver driver,int finger,WebElement element, int duration) {
		driver.tap(finger, element, duration);
	}
	/**
	 * this method is used for swipe actions
	 * @param driver
	 * @param finger
	 * @param x
	 * @param y
	 * @param duration
	 */
	public static void tapActions(AndroidDriver driver,int finger,int x, int y, int duration) {

		driver.tap(finger, x, y, duration);

	}
	/**
	 * this method is used for draganddrop
	 * @param driver
	 * @param element
	 * @param src
	 * @param dest
	 */
	public static void DragnAndDrop(AndroidDriver driver,WebElement element,WebElement src,WebElement dest ) {
		TouchAction to = new TouchAction(driver);
		to.longPress(src).waitAction().moveTo(dest).perform().release();

	}
	/**
	 * this method is used for zoom
	 * @param element
	 * @param driver
	 * @param finger
	 * @param x
	 * @param y
	 */
	public static void zoom(WebElement element,AndroidDriver driver,int finger,int x, int y) {
		driver.zoom(element);
		driver.zoom(x,y);
	}
	/**
	 * this method is used for pinch
	 * @param element
	 * @param driver
	 * @param finger
	 * @param x
	 * @param y
	 */
	public static void pinch(WebElement element,AndroidDriver driver,int finger,int x, int y) {

		driver.pinch(element);
		driver.pinch(x, y);
	}
}