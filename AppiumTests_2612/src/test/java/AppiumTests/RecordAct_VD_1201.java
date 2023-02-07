package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RecordAct_VD_1201 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Android Emulator");
		  cap.setCapability("udid","emulator-5554");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","9.0");
		  cap.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\selendroid-test-app.apk");
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		  
		  System.out.println("Application Started");
		  Thread.sleep(2000);
		  
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("visibleButtonTestCD");
		  el1.click();
		  Thread.sleep(4000);
		  System.out.println("Display Tesxt view button clicked");
		  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("showToastButtonCD");
		  el2.click();
		  Thread.sleep(4000);
		  System.out.println("Display a Toast button clicked");
		  MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("my_text_fieldCD");
		  el3.click();
		  el3.sendKeys("Appium Test");
		  System.out.println("Key value entered in Input box");
		  Thread.sleep(4000);
		  MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("buttonTestCD");
		  el4.click();
		  Thread.sleep(4000);
		  System.out.println("END button clicked");
		  MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
		  el5.click();
		  Thread.sleep(4000);
		  System.out.println("I agree button clicked");
		  
		  driver.quit();

	}

}
