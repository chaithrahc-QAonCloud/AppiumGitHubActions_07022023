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

public class Alert_Popup_0601 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"CQFEDARKYX59JZLR");
		dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
		 
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		
		System.out.println("Application Started");
		  Thread.sleep(5000);
		  
		  WebElement App = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='App']"));
		  App.click();
		  System.out.println("Clicked on App Option");
		  Thread.sleep(2000);
		  
		  WebElement AlertDialogs = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Alert Dialogs']"));
		  AlertDialogs.click();
		  System.out.println("Clicked on AlertDialogs Option");
		  Thread.sleep(2000);
		  
		  WebElement FirstOption = driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK Cancel dialog with a message']"));
		  FirstOption.click();
		  System.out.println("Clicked on FirstOption Option");
		  Thread.sleep(2000);
		  
		  WebElement Okbutton = driver.findElementById("android:id/button1");
		  Okbutton.click();
		  System.out.println("Clicked on OK button");
		  Thread.sleep(2000);
		  
		  WebElement FirstOption1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='OK Cancel dialog with a message']"));
		  FirstOption1.click();
		  System.out.println("Clicked on FirstOption Option");
		  Thread.sleep(2000);
		  
		  WebElement Cancelbutton = driver.findElementById("android:id/button2");
		  Cancelbutton.click();
		  System.out.println("Clicked on CANCEL button");
		  Thread.sleep(2000);
		  
		  driver.quit();
	}

}
