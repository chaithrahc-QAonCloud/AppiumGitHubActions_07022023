package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RecordAct_RD_1201 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		  
		  System.out.println("Application Started");
		  Thread.sleep(2000);
		  
		  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Views");
		  el1.click();
		  Thread.sleep(2000);
		  System.out.println("Views option clicked");
		  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Animation");
		  el2.click();
		  Thread.sleep(2000);
		  System.out.println("Animation option clicked");
		  MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Shake");
		  el3.click();
		  Thread.sleep(2000);
		  System.out.println("Shake option clicked");
		  MobileElement el4 = (MobileElement) driver.findElementById("io.appium.android.apis:id/pw");
		  el4.sendKeys("Appium1234");
		  System.out.println("Password entered");
		  MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Login");
		  el5.click();
		  Thread.sleep(2000);
		  System.out.println("Login button clicked");

		  
		  driver.quit();


	}

}
