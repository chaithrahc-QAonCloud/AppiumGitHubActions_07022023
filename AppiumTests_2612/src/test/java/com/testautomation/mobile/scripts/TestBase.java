package com.testautomation.mobile.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AndroidDriver<WebElement> driver;
	
	
	
	public static void Android_setUp() throws MalformedURLException, InterruptedException {
        
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\Tasks.apk");
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		WebElement TaskIcon = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open\"]");
		TaskIcon.click();
		System.out.println("Task Icon clicked");
		WebElement NewList = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView");
		NewList.click();
		System.out.println("New List option clicked");
		Thread.sleep(2000);
		WebElement EnterTask = driver.findElementById("com.tasks.android:id/task_list_name");
		EnterTask.sendKeys("Task_Entry");
		System.out.println("Task Entry Name is entered ");
		//driver.hideKeyboard();
		Thread.sleep(5000);
		WebElement Save = driver.findElementById("com.tasks.android:id/save");
		Save.click();
		System.out.println("Save button clicked ");
		
		
	}

	public static void tearDown()
	
	{
		if(null!=driver)
		{
			driver.quit();
		}
	}
}
