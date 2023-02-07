package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidSwitchElement_VD_3012 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
        DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		System.out.println("APK file installed on the Virtual Device");
		
		driver.findElementByXPath("//android.widget.TextView[@content-desc='Preference']").click();  //Preference clicked
		System.out.println("Click on Preference");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='9. Switch']").click();   //Switch clicked
		System.out.println("Click on Switch");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//android.widget.TextView[@bounds='[44,567][394,626]']").click();  //Switch preference clicked for first time
		System.out.println("Click on Switch Preference for first time(ON STATE)");
		Thread.sleep(3000);
		
		//Second time click on Switch preference
		driver.findElementByXPath("//android.widget.TextView[@bounds='[44,567][394,626]']").click();  
		System.out.println("Click on Switch Preference for second time(OFF STATE)");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
