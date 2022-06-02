package com.crm.ObjectRepsitory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApiDemosHomePage {
	
	@AndroidFindBy(id="android:id/action_bar")
    private MobileElement access;
	
	@AndroidFindBy(accessibility ="Animation")
    private MobileElement animation;	
	
	@AndroidFindBy(accessibility ="App")
    private MobileElement APP;	

	@AndroidFindBy(accessibility ="Content")
    private MobileElement content;	
	
	@AndroidFindBy(accessibility ="Graphics")
    private MobileElement Graphics;	
	
	@AndroidFindBy(accessibility ="Media")
    private MobileElement Media;
  
	@AndroidFindBy(accessibility ="NFC")
    private MobileElement NFC;
}
