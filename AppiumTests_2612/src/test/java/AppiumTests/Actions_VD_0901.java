package AppiumTests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Actions_VD_0901 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		   DesiredCapabilities dc = new DesiredCapabilities();
			
					dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
					dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
					dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
					dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
					dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
					 
					URL url = new URL("http://127.0.0.1:4723/wd/hub");
					AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
					
					System.out.println("Application Started");
					  Thread.sleep(5000);
					  
					  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"App\"]").click();
					  System.out.println("App option clicked");
					  Thread.sleep(1000);
					 
					  driver.findElementByXPath("//android.widget.TextView[@content-desc='Activity']").click();
					  System.out.println("Activity option clicked");
					  Thread.sleep(1000);
						 
					  driver.findElementByXPath("//android.widget.TextView[@content-desc='Animation']").click();
					  System.out.println("Animation option clicked");
					  Thread.sleep(1000);
						 
					  driver.findElementById("io.appium.android.apis:id/zoom_thumbnail_animation").click();
					  System.out.println("Thumbnail zoom option clicked");
					  Thread.sleep(1000);
						 
					  driver.findElementById("io.appium.android.apis:id/radio_button").click();
					  System.out.println("Single choice list option clicked");
					  Thread.sleep(1000);
						 
					  driver.findElementByXPath("//android.widget.CheckedTextView[@text='Street view']").click();
					  System.out.println("Street view option clicked/selected");
					  Thread.sleep(1000);
						 
					  driver.findElementById("android:id/button1").click();
					  System.out.println("OK button clicked");
					  Thread.sleep(1000);
						 
					  driver.quit();
					  

	}

}
