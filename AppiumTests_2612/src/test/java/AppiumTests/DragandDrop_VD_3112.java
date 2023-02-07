package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class DragandDrop_VD_3112 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		  cap.setCapability("udid","emulator-5554");
		  cap.setCapability("platformName","Android");
		  cap.setCapability("platformVersion","9.0");
	   	  cap.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");
		//  cap.setCapability("appPackage","com.mobeta.android.demodslv");  //Drag Sort Demos APK
		//  cap.setCapability("appActivity","com.mobeta.android.demodslv.Launcher");
		  
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver<WebElement>  driver = new AndroidDriver<WebElement>(url, cap);
		  
		  System.out.println("Application Started");
		  Thread.sleep(5000);

		  //Navigation
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='Basic usage playground']")).click();
		  System.out.println("Clicked on Basic usage playground");
		  
		  //Selecting a particular element(Source Element)-Joshua Redman
		  WebElement source= driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(1);
		  
		  //Selecting a particular element(Target Element)-Michael Brecker
		  WebElement target= driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(6);
		  
		  //Drag and Drop Class Called here
		  
		  TouchAction action=new TouchAction((MobileDriver)driver);
		  
		  action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		  
		  System.out.println("Element has been dropped to its expected place successfully");
		  
		  Thread.sleep(5000);
		  driver.quit();
		  

	}

}
