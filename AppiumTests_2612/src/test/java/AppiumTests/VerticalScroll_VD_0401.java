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

public class VerticalScroll_VD_0401 {

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
			  
			
			WebElement Views = driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']");
			Views.click();
		
			
			//Capturing all the elements
			AndroidElement list = (AndroidElement) driver.findElementById("android:id/text1");
			MobileElement listitem = (MobileElement) driver.findElement(
					
					MobileBy.AndroidUIAutomator(
							"new UiScrollable(new UiSelector()).scrollIntoView("
							+ "new UiSelector().description(\"Tabs\"));"));
			
			System.out.println(listitem.getText());
			System.out.println(listitem.getLocation());
			listitem.click();
			
			//Working on the listitem selected
			System.out.println("Item clicked");
		    driver.findElement(By.xpath("//android.widget.TextView[@text='1. Content By Id']")).click(); 
			System.out.println("Tab option clicked");
			driver.findElement(By.xpath("//android.widget.TextView[@text='TAB2']")).click(); 
			System.out.println("Tab2 option clicked");
			Thread.sleep(2000);
			driver.quit();


	}

}
