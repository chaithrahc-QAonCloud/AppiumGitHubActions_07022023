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


public class PORT_9090_VerticalScroll_1601 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		 DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
			dc.setCapability("appPackage","com.android.chrome");
		    dc.setCapability("appActivity","com.google.android.apps.chrome.Main");
			 
			URL url = new URL("http://127.0.0.1:9090/wd/hub");
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
			
			System.out.println("Application Started");
			  Thread.sleep(5000);
			  driver.get("https://cypress.io/");
			  WebElement string = driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
				         ".scrollIntoView(new UiSelector().textContains(\" Subscribe to our newsletter \"))"));
			  
			 
			
			  	System.out.println(string.getLocation());
				Thread.sleep(1000);
				driver.findElementByAccessibilityId("Subscribe to our newsletter").click();
				System.out.println("Subscribe WebPage opened");
				Thread.sleep(4000);
				WebElement email = driver.findElementByXPath("//android.widget.EditText[@bounds='[82,1099][638,1179]']");
				email.click();
				email.sendKeys("ABCD@gmail.com");
				Thread.sleep(1000);
				System.out.println("Email entered");
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]").click();
				System.out.println("Agreement signed");
				Thread.sleep(1000);
				WebElement btn = driver.findElementByClassName("android.widget.Button");
				btn.click();
				Thread.sleep(3000);
				System.out.println("Subscribed for the news letter");
				Thread.sleep(2000);
				
				driver.quit();
				
				
				
	}

}

	


