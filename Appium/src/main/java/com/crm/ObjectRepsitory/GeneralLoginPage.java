package com.crm.ObjectRepsitory;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralLoginPage {
	public AndroidDriver driver;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
    private MobileElement countryDD;
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/nameField")
	private MobileElement nametxtbox;
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/radioMale")
	private MobileElement maleradiobtn;
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/radioFemale")
	private MobileElement femaleradiobtn;


	@AndroidFindBy(id ="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement loginbtn;

	
	
	
public MobileElement getCountryDD() {
		return countryDD;
	}


	public MobileElement getNametxtbox() {
		return nametxtbox;
	}


	public MobileElement getMaleradiobtn() {
		return maleradiobtn;
	}


	public MobileElement getFemaleradiobtn() {
		return femaleradiobtn;
	}


	public MobileElement getLoginbtn() {
		return loginbtn;
	}

public GeneralLoginPage(AndroidDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
/*
public void loginbtn() {
	nametxtbox.sendKeys("anu");
	femaleradiobtn.click();
	loginbtn.click();
	*/
	public void loginbtn1(String name) {
		nametxtbox.sendKeys(name);
		femaleradiobtn.click();
		loginbtn.click();
		
	
	}
}

