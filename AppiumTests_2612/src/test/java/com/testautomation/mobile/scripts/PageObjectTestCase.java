package com.testautomation.mobile.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.testautomation.mobile.pages.PageObjectPage1;
import com.testautomation.mobile.pages.PageObjectPage2;
import com.testautomation.mobile.pages.PageObjectPage3;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PageObjectTestCase {

	@Test
	public void pageObjectTestCase() throws MalformedURLException, InterruptedException {
		
        DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		 Thread.sleep(3000);
		 
		  try {
			   Thread.sleep(3000);
			   
			   PageObjectPage1 pageObjectPage1=new PageObjectPage1(driver);
			   pageObjectPage1.clickOnViews();
			  
			   PageObjectPage2 pageObjectPage2=new PageObjectPage2(driver);
			   pageObjectPage2.clickOnAutoComplete();
			   
			   PageObjectPage3 pageObjectPage3=new PageObjectPage3(driver);
			   pageObjectPage3.getScrollText();
			   
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
	}
}
