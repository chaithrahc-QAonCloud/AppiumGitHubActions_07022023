package com.testautomation.mobile.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.testautomation.mobile.pages.PageObjectPage1;
import com.testautomation.mobile.pages.PageObjectPage1_VD;
import com.testautomation.mobile.pages.PageObjectPage2;
import com.testautomation.mobile.pages.PageObjectPage2_VD;
import com.testautomation.mobile.pages.PageObjectPage3;
import com.testautomation.mobile.pages.PageObjectPage3_VD;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PageObjectTestCase_VD {

	@Test
public void pageObjectTestCase_VD() throws MalformedURLException, InterruptedException {
		
        DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		 Thread.sleep(3000);
		 
		 try {
			   Thread.sleep(3000);
			   
			   PageObjectPage1_VD pageObjectPage1=new PageObjectPage1_VD(driver);
			   pageObjectPage1.clickOnViews();
			  
			   PageObjectPage2_VD pageObjectPage2=new PageObjectPage2_VD(driver);
			   pageObjectPage2.clickOnAutoComplete();
			   
			   PageObjectPage3_VD pageObjectPage3=new PageObjectPage3_VD(driver);
			   pageObjectPage3.multiitmText();
			   
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
	}
}
