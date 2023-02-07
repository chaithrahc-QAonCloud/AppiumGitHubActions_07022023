package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class APK_RD_2612 {

	public static void main(String[] args) throws MalformedURLException {
           
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		driver.quit();

	}

}
