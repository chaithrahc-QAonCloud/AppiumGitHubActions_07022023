package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;


public class HybridApps_0602 {


	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
        
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\WebViewTest.apk");
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		
		WebElement browsrIcon =driver.findElementById("com.snc.test.webview2:id/action_go_website");
		browsrIcon.click();

		Thread.sleep(3000);
		WebElement inputUrl=driver.findElementById("com.snc.test.webview2:id/input_url");	
		
		inputUrl.clear();
		inputUrl.sendKeys("cypress.io");
		System.out.println("The URL has been launched successfully");	
		
		WebElement goButton=driver.findElementById("android:id/button1");			
		goButton.click();
			Thread.sleep(3000);
		Set<String> contextNames =driver.getContextHandles();				
		Iterator<String> itr=contextNames.iterator();			
		while(itr.hasNext()){
						
		System.out.println(itr.next());	
		}
						
		System.out.println("Both the Contexts are displayed");	
		driver.quit();
		}
	
	}

