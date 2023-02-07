package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidSwitchElement_RD_3012 {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		 DesiredCapabilities dc = new DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QP1A.190711.020");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 9");
			dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver=new AppiumDriver<MobileElement>(url,dc);
			
			System.out.println("APK file installed on the Real Device");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();  //Preference clicked
			System.out.println("Click on Preference");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='9. Switch']")).click();   //Switch clicked
			System.out.println("Click on Switch");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Switch preference']")).click();  //Switch preference clicked for first time
			System.out.println("Click on Switch Preference for first time(ON STATE)");
			Thread.sleep(3000);
			
			//Second time click on Switch preference
			driver.findElement(By.xpath("//android.widget.TextView[@text='Switch preference']")).click();  
			System.out.println("Click on Switch Preference for second time(OFF STATE)");
			Thread.sleep(3000);
			
			driver.quit();

	}

}
