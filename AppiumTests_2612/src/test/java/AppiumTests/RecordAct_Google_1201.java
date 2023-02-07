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

public class RecordAct_Google_1201 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName","Redmi 9");
		  cap.setCapability("udid","CQFEDARKYX59JZLR");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","10 QP1A.190711.020");
		  cap.setCapability("appPackage","com.android.chrome");
		  cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
		  
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		
		  
		  System.out.println("Application Started");
		  Thread.sleep(7000);
		  
		  MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Navigate: YouTube: m.youtube.com\"]/android.widget.ImageView");
		  el1.click();
		  System.out.println("YouTube Application Started");
		  MobileElement el2 = (MobileElement) driver.findElementById("com.android.chrome:id/url_bar");
		  el2.click();
		  System.out.println("Search Bar selected");
		  el2.sendKeys("Appium tutorials");
		  MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView");
		  el3.click();
		  System.out.println("Key value searched");
		 

		  

	}

}
