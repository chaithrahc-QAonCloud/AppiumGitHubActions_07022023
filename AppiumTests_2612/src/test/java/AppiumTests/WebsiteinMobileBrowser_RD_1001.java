package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class WebsiteinMobileBrowser_RD_1001 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		  DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
		//	dc.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		//	dc.setCapability(MobileCapabilityType.NO_RESET, true);
		//	dc.setCapability("chromedriverPort","9515");
		//	dc.setCapability("chromedriverexecutable",System.getProperty("C:\\webdrivers"));
			 //Launching the Google Chrome
			  dc.setCapability("appPackage","com.android.chrome");
			  dc.setCapability("appActivity","com.google.android.apps.chrome.Main");
			  
		
			
		//	dc.setCapability(MobileCapabilityType.FULL_RESET,true);
			 
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
			
			driver.manage().timeouts().implicitlyWait(6000,TimeUnit.MILLISECONDS);
		    Thread.sleep(3000);
			driver.findElementById("com.android.chrome:id/terms_accept").click();
			System.out.println("Accept/Continue button clicked");
			Thread.sleep(1000);
			
		    driver.findElementById("com.android.chrome:id/negative_button").click();
		    System.out.println("No thanks button clicked");
		    Thread.sleep(2000);
		
			driver.get("https://in.search.yahoo.com/?fr2=inr");
		
			Thread.sleep(2000);
			System.out.println("Search engine Started");
			WebElement searchbox =  driver.findElementByClassName("android.widget.EditText");
			searchbox.click();
			
			searchbox.sendKeys("Appium Tutorials");
		//	searchbox.sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//android.view.View[@text='appium tutorials']")).click();
			Thread.sleep(5000);
			System.out.println("Search topic clicked");
		
			
			
			
	}

}
