package scripttest;

import org.testng.annotations.Test;

import com.crm.genericUtlity.BaseClass;
import com.crm.genericUtlity.Constantpath;
import com.crm.genericUtlity.FileUtility;
@Test
public class GenericScript1 extends BaseClass {
	
@Test
	public void launchapp() throws Throwable {
		String constantpath = Constantpath.PropertyFilePath;
		FileUtility.tofetchPropertyFile(constantpath);
		String devicename = FileUtility.getproperty("deviceName");
		String UDID = FileUtility.getproperty("UDID");
		String platformname = FileUtility.getproperty("platformName");
		String platformVersion = FileUtility.getproperty("platformVersion");
		String apppackage = FileUtility.getproperty("appPackage");
		String appActivity = FileUtility.getproperty("appActivity");
	}

}
